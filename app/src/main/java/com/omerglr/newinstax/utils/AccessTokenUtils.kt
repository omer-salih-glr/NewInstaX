package com.omerglr.newinstax.utils

import android.app.Activity
import android.content.Context

class AccessTokenUtils {
    fun setAccessToken(activity: Activity, token: String) {
        activity.getSharedPreferences("Auth", Context.MODE_PRIVATE).edit().putString("Token", token)
            .apply()
    }

    fun getAccessToken(activity: Activity): String {
        println("hata1")
        return activity.getSharedPreferences("Auth", Context.MODE_PRIVATE).getString("Token", "").toString();
    }
}