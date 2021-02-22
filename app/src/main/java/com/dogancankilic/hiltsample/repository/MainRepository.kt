package com.dogancankilic.hiltsample.repository

import com.dogancankilic.hiltsample.api.ApiHelper
import javax.inject.Inject

class MainRepository @Inject constructor(
    private val apiHelper: ApiHelper
){

     fun getComments() = apiHelper.getComments()

}