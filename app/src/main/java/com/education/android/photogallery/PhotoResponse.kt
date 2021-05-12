package com.education.android.photogallery

import com.google.gson.annotations.SerializedName

class PhotoResponse {
    @SerializedName("photo")
    public lateinit var galleryItems: List<GalleryItem>
}