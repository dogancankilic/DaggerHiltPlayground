package com.dogancankilic.hiltsample.api

import kotlinx.coroutines.flow.flow
import javax.inject.Inject


class ApiHelperImpl @Inject constructor(
    private val apiService: ApiService
): ApiHelper {

    override fun getComments() = flow { emit(apiService.getComments()) }


}