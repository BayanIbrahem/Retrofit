package com.example.retrofit.data

import com.example.retrofit.di.AppModule
import com.example.retrofit.domain.model.Todo
import com.example.retrofit.domain.repository.TodoApi
import com.example.retrofit.domain.repository.TodoRetrofitApi

class ApiRepo: TodoApi {
  private var api = AppModule.api

  override suspend fun getTodoList(): List<Todo> {
    return api.getTodos().body() ?: listOf()
  }
  // implement more functions for Todo
}