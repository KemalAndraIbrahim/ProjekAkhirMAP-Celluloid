package com.example.projekmapnew.api

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header

interface TodoItem {
    @GET("/rest/v1/listpilem?select=*")
    suspend fun get(
        @Header("Authorization") token: String,
        @Header("apikey") apiKey: String
    ) : Response<List<ListItem>>
}