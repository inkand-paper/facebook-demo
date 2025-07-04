package com.example.facebook

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.facebook.databinding.ActivityCreateAccountBinding

class createAccount : AppCompatActivity() {
    private lateinit var binding: ActivityCreateAccountBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityCreateAccountBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.SignUpBtn.setOnClickListener {
            homePage()
        }
        binding.LogInTV.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

    }

    private fun homePage() {
        val email = binding.Email.text.toString()
        val password = binding.Password.text.toString()
        val name1 = binding.FsName.text.toString()
        val name2 = binding.LsName.text.toString()
        val password2 = binding.ConfirmPassword.text.toString()

        var isValid = true

        if (name1.isEmpty()){
            binding.CreateAccountLayout1.error = "Complete This Field"
            isValid = false
        }
        if (name2.isEmpty()){
            binding.CreateAccountLayout2.error = "Complete This Field"
            isValid = false
        }
        if (email.isEmpty()){
            binding.CreateAccountLayout3.error = "Complete This Field"
            isValid = false
        }

        if (password.isEmpty()){
            binding.CreateAccountLayout4.error = "Complete This Field"
            isValid = false
        }
        if (password2.isEmpty()){
            binding.CreateAccountLayout5.error = "Complete This Field"
            isValid = false
        }
        if (isValid){
            val intent = Intent(this,home_page::class.java)
            startActivity(intent)
        }
    }
}