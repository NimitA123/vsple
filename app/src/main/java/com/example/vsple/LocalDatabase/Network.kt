package com.example.vsple.LocalDatabase

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Network {
    companion object{
        private var httpOkLoginInterCeptor = HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
           fun getInstance(): Retrofit {
              var retrofit = Retrofit.Builder().baseUrl("https://apistest.tradetipsapp.com/").addConverterFactory(
                  GsonConverterFactory.create()
              ).client(OkHttpClient.Builder().addInterceptor(httpOkLoginInterCeptor).build()).build()
               return retrofit

            }
    }
}