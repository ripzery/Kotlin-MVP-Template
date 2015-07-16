package com.example.andrzejz.kotlinproject.network.traits

import com.example.andrzejz.kotlinproject.network.models.IpResponse
import com.example.andrzejz.kotlinproject.singletons.Constants
import retrofit.Callback
import retrofit.RestAdapter
import retrofit.http.GET

/**
 * Created by Andrzej Z on 7/16/2015.
 */

interface FakeApi {

    [GET(Constants.ENDPOINT)]
    fun getGoogle(callback: Callback<IpResponse>)

}