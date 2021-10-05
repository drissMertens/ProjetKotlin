package com.example.projetkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.projetkotlin.databinding.ActivityLogin2Binding
import com.example.projetkotlin.databinding.ActivityMainBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLogin2Binding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLogin2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.successMessage.text = "hello"

        binding.loginButton.setOnClickListener{displaySuccessMessage()}
    }

    private fun displaySuccessMessage(){
        if (binding.emailField.text.isNotEmpty() && binding.passwordField.text.isNotEmpty()) {
            "Felicitation ${binding.emailField.text}, vous êtes connecté".also { binding.successMessage.text = it }
            binding.successMessage.visibility = View.VISIBLE

            val intent = Intent(this, HomeActivity::class.java).apply {
            }

            intent.putExtra("email",binding.emailField.text.toString())

            intent.putExtra(HomeActivity.EMAIL,binding.emailField.text.toString())
            startActivity(intent)
        }
    }



}
