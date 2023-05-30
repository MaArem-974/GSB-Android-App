package com.mindorks.retrofit.coroutines.data.api

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object RetrofitBuilder {

// Ancien Ip 10.0.2.2
    private const val BASE_URL = "http://10.0.8.16"

    private fun Gson(): Gson{
        return GsonBuilder()
            .setLenient()
            .create()

    }

    private fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(Gson()))
            .build()

    }

    val apiService: ApiService = getRetrofit().create(ApiService::class.java)
}