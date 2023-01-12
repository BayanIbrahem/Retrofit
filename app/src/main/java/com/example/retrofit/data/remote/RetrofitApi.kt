package com.example.retrofit.data.remote

import com.example.retrofit.domain.repository.TodoRetrofitApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitApi {
  private val BASE_URL = "http://jsonplaceholder.typicode.com"
  val api: TodoRetrofitApi by lazy {
    Retrofit.Builder()
      .baseUrl(BASE_URL)
      .addConverterFactory(GsonConverterFactory.create())
      .build()
      .create(TodoRetrofitApi::class.java)
  }
}