package com.omerglr.newinstax.ui.insta_gir

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.CookieManager
import android.webkit.WebView
import android.webkit.WebViewClient
import com.omerglr.newinstax.R
import com.omerglr.newinstax.databinding.FragmentInstaGirisBinding


class Insta_Giris : Fragment() {

    private lateinit var binding: FragmentInstaGirisBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentInstaGirisBinding.inflate(inflater,container,false);

        binding.apply {
            webView.settings.javaScriptEnabled = true;
            webView.webViewClient = object : WebViewClient() {
                override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
                    Log.i("TAG", "shouldOverrideUrlLoading: URL's '$url'")
                    //url will be the url that you click in your webview.
                    //you can open it with your own webview or do
                    //whatever you want

                    //Here is the example that you open it your own webview.
                    view.loadUrl(url)
                    return true
                }

                override fun onPageFinished(view: WebView?, url: String?) {
                    super.onPageFinished(view, url)
                    val userId = getCookie(webView.url,"ds_user_id")
                    val sessionid = getCookie(webView.url,"sessionid")
                    //Kullanıcı giriş yaptıysa 'true' döner.
                    val isUserLoggedIn = (!userId.isNullOrEmpty() && !sessionid.isNullOrEmpty());
                    Log.i("InstaGirisSayfasi", "onPageFinished: isUserLoggedIn:${isUserLoggedIn}")
                    if(isUserLoggedIn) {
                        // kullanıcı giriş yaptığında olacaklar
                    }
                }


                fun getCookie(siteName: String?, cookieName: String?): String? {
                    var CookieValue: String? = null
                    val cookieManager = CookieManager.getInstance()
                    val cookies = cookieManager.getCookie(siteName)
                    Log.i("TAG", "getCookie: '$cookies'")
                    val temp = cookies.split(";").toTypedArray()
                    for (ar1 in temp) {
                        if (ar1.contains(cookieName!!)) {
                            val temp1 = ar1.split("=").toTypedArray()
                            CookieValue = temp1[1]
                            break
                        }
                    }
                    return CookieValue
                }

            }
            webView.loadUrl("https://www.instagram.com/")
        }


        return binding.root
    }



}