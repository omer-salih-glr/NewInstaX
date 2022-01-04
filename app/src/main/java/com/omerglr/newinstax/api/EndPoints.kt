package com.omerglr.newinstax.api

import com.omerglr.newinstax.api.model.InstagramGetStoriesResponse
import io.reactivex.Observable
import retrofit2.http.*

interface EndPoints {

        @GET("v1/feed/reels_tray/")
        fun sendInstagramRequest(@HeaderMap map: Map<String,String>): Observable<InstagramGetStoriesResponse>;


}