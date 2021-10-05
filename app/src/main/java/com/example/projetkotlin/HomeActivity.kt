package com.example.projetkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projetkotlin.databinding.ActivityHomeBinding
import com.example.projetkotlin.databinding.ActivityLogin2Binding

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    companion object {

        const val EMAIL = "email"


    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val email = intent?.extras?.getString(EMAIL).toString()
        binding.centerText.text = email

    }
}