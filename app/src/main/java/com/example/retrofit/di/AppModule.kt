package com.example.retrofit.di

import com.example.retrofit.data.remote.RetrofitApi

object AppModule {
  private val RetrofitApi: RetrofitApi = RetrofitApi()
  val api = RetrofitApi.api
}