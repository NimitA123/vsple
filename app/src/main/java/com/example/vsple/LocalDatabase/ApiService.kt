package com.example.vsple.LocalDatabase

import retrofit2.Call
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Query

interface ApiService {
    @POST("/api/auth/appNewSignIn")
    fun getApi(  @Query("username") username: String,
                 @Query("Password") password: String): Call<ResponseDTO>
}