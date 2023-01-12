package com.example.retrofit.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.core.view.isVisible
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.retrofit.databinding.ActivityMainBinding
import com.example.retrofit.di.AppModule
import com.example.retrofit.domain.model.TodoRecyclerViewAdapter
import retrofit2.HttpException
import java.io.IOException

/**
 * Used API: api: http://jsonplaceholder.typicode.com/todos
 * todo list:
 * 0) make ui xml.
 * 1) add internet permissions.
 * 2) tell Retrofit how we want it to deal with api by creating interface "TodoApi"
 * 3) creating class RetrofitApi and put api variable in it.
 * 4) make recycler view Adapter and view holder
 */
const val TAG = "MAIN_ACTIVITY"
class MainActivity : AppCompatActivity() {
	private lateinit var binding: ActivityMainBinding
	private lateinit var todoAdapter: TodoRecyclerViewAdapter

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		binding = ActivityMainBinding.inflate(layoutInflater)
		setContentView(binding.root)

		createRv()
		lifecycleScope.launchWhenCreated {
			binding.progressBar.isVisible = true
			// TODO ("we need internet connection check")
			val response = try {
				AppModule.api.getTodos()
			} catch (io: IOException) {
				Log.e(TAG, "IOException, fail to connect to internet")
				binding.progressBar.isVisible = false
				return@launchWhenCreated // will end on create.
			} catch (http: HttpException) {
				Log.e(TAG, "HttpException, fail to get data from api")
				binding.progressBar.isVisible = false
				return@launchWhenCreated // will end on create.
			}
			// when we reach this point that means we get the response but we still don't know if it was successful.
			// we have to check that:
			if (response.isSuccessful && response.body() != null) {
				todoAdapter.todos = response.body()!! //will not be null ever.
			} else {
				Log.e(TAG, "get result was failed.")
			}
			binding.progressBar.isVisible = false
		}
	}

	fun createRv() {
		binding.rvTodo.apply {
			todoAdapter = TodoRecyclerViewAdapter()
			this.adapter = todoAdapter
			this.layoutManager = LinearLayoutManager(this@MainActivity)
		}
	}
}