package com.dogancankilic.hiltsample.api

import com.dogancankilic.hiltsample.Model.CommentsItem
import retrofit2.http.GET

interface ApiService{

    @GET("comments")
    suspend fun getComments():  List<CommentsItem>
}