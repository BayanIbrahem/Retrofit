package com.example.retrofit.domain.repository

import com.example.retrofit.domain.model.Todo

interface TodoApi {
  suspend fun getTodoList(): List<Todo>
}