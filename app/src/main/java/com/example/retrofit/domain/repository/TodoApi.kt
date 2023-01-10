package com.example.retrofit.domain.repository

import com.example.retrofit.domain.model.Todo
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

/**
 * getTodos function:
 *  we choose type of http request (it is get) and set return type as Response
 *  we can add parameters
 */
interface TodoApi {

	//
	@GET ("/todos") /* in this annotation we put the url after domain. */
	suspend fun getTodos(/* api parameters */): Response<List<TodoApi>>

	//	fun Todos(@Query("key") key: String): Response<List<TodoApi>>

	// body annotation parse json from data class
//	@POST ()
//	fun createTodo(@Body todo: Todo ): Response<CreateTodoResponse>
}