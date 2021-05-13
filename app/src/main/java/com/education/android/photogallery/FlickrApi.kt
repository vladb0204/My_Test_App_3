package com.education.android.photogallery

import android.graphics.Bitmap
import androidx.annotation.WorkerThread
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.Url

interface FlickrApi {

    @GET("services/rest?method=flickr.interestingness.getList")
    public fun fetchPhotos(): Call<FlickrResponse>

    @GET("services/rest?method=flickr.photos.search")
    public fun searchPhotos(@Query("text") query: String): Call<FlickrResponse>

    @GET
    public fun fletchUrlBytes(@Url url: String): Call<ResponseBody>
}