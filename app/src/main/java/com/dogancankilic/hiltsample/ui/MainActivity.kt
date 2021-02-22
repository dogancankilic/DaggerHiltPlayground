package com.dogancankilic.hiltsample.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import com.dogancankilic.hiltsample.R
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {


    private val  viewModel : MainActivityViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.comments.observe(this as LifecycleOwner, Observer {
            it.let {
                it.forEach{
                    Log.d("MainActivity",it.body)
                }
            }
        })



    }
}