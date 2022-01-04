package com.omerglr.newinstax.api

import android.content.Context
import android.webkit.CookieManager
import com.google.gson.GsonBuilder
import com.omerglr.newinstax.BASE_URL
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object LegacyServiceBuilder {
    private lateinit var USER_COOKIE:String

    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL) // change this IP for testing by your actual machine IP
        .addConverterFactory(
            GsonConverterFactory.create(
                GsonBuilder()
                    .setLenient()
                    .create()))
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .client(OkHttpClient.Builder().also {
            val loggingInterceptor = HttpLoggingInterceptor().apply {
                level = HttpLoggingInterceptor.Level.BODY
            }
            it.readTimeout(60, TimeUnit.SECONDS)
            it.writeTimeout(60, TimeUnit.SECONDS)
            it.addInterceptor(loggingInterceptor)
            it.addInterceptor { chain ->
                val request = chain.request()
                    .newBuilder()
                    .addHeader("cookie", "Bearer $USER_COOKIE")
                    .build()
                chain.proceed(request)

            }
        }.build())
        .build()
    fun buildService(context: Context, includeCookies:Boolean = true): EndPoints {
        if (includeCookies) {
            val cookieManager = CookieManager.getInstance()
            val cookies = cookieManager.getCookie("https://.instagram.com")
            USER_COOKIE = cookies;
        }
        return retrofit.create(EndPoints::class.java)
    }
}