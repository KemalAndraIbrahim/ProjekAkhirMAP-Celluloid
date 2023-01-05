package com.example.projekmapnew.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {

    val Linknya = "https://rgijwpedklqmmigkfqnw.supabase.co"

    fun getInstance(): Retrofit {
        return Retrofit.Builder().baseUrl(Linknya)
            .addConverterFactory(GsonConverterFactory.create())
            // we need to add converter factory to
            // convert JSON object to Java object
            .build()
    }
}