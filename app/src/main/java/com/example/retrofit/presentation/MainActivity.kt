package com.example.retrofit.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.retrofit.databinding.ActivityMainBinding

/**
 * Used API: api: http://jsonplaceholder.typicode.com/todos
 * todo list:
 * 0) make ui xml.
 * 1) add internet permissions.
 * 2) tell Retrofit how we want it to deal with api by creating interface ""
 */
class MainActivity : AppCompatActivity() {
	private lateinit var binding: ActivityMainBinding
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		binding = ActivityMainBinding.inflate(layoutInflater)
		setContentView(binding.root)
	}
}