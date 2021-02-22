package com.dogancankilic.hiltsample.ui


import androidx.lifecycle.*
import com.dogancankilic.hiltsample.repository.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainActivityViewModel @Inject constructor(
    private val mainRepository: MainRepository
): ViewModel(){

    val comments= liveData {
        emitSource(mainRepository.getComments().asLiveData())
    }



}