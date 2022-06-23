package com.example.gastyapp.repository

import com.example.gastyapp.models.ServiceResponse
import retrofit2.Response
import retrofit2.http.GET

interface ApiServiceRepository {

    @GET("/text/android/")
    suspend fun getTextFromTuHermana(): Response<ServiceResponse>

}