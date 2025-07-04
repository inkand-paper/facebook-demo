package com.example.facebook

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.facebook.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.LoginBtn.setOnClickListener {
            homePage()
        }
        binding.CreateAccountBtn.setOnClickListener {
            createPage()
        }

    }

    private fun createPage() {
        val intent = Intent(this,createAccount::class.java)
        startActivity(intent)
    }

    private fun homePage() {
        val email = binding.Email.text.toString()
        val password = binding.Password.text.toString()

        var isValid = true

        if (email.isEmpty()){
            binding.LoginLayout1.error = "Complete This Field"
            isValid = false
        }
        if (password.isEmpty()){
            binding.LoginLayout2.error = "Complete This Field"
            isValid = false
        }
        if (isValid){
            val intent = Intent(this,home_page::class.java)
            startActivity(intent)
        }
    }
}