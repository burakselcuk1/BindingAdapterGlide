package com.example.newdataexercise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.newdataexercise.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val a = Person("burak","https://cdn.pixabay.com/photo/2020/06/01/22/23/eye-5248678__340.jpg")

        binding.insan = a


    }
}