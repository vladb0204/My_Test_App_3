package com.education.android.photogallery

import android.graphics.Bitmap
import androidx.annotation.WorkerThread
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface FlickrApi {

    @GET("services/rest/?method=flickr.interestigness.getList" +
            "&apikey=" + /* I need to create it, haven't done that yet */
            "&format=json&nojsoncallback=1&extras=url_s")
    fun fetchPhotos(): Call<FlickrResponse>

    @GET
    fun fletchUrlBytes(@Url url: String): Call<ResponseBody>
}