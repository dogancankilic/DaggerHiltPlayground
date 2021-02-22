package com.dogancankilic.hiltsample.api

import com.dogancankilic.hiltsample.Model.CommentsItem
import kotlinx.coroutines.flow.Flow

interface ApiHelper {

    fun getComments(): Flow<List<CommentsItem>>

}