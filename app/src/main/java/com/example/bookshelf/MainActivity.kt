package com.example.bookshelf

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.bookshelf.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.loginButton.setOnClickListener {
            // Retrieve username and password from EditText fields
            val username = binding.editTextTextEmailAddress.text.toString()
            val password = binding.editTextTextPassword.text.toString()

            // Perform authentication (example: dummy logic for demo)
            if (isValidCredentials(username, password)) {
                // Authentication successful, navigate to next screen or perform action
                Toast.makeText(this, "Login successful", Toast.LENGTH_SHORT).show()
                // Example: startActivity(Intent(this, HomeActivity::class.java))
                startActivity(Intent(this,MainScreenActivity::class.java))

            } else {
                // Authentication failed, show error message
                Toast.makeText(this, "Invalid username or password", Toast.LENGTH_SHORT).show()
            }
        }

    }

    // Dummy authentication logic (replace with your actual logic)
    private fun isValidCredentials(username: String, password: String): Boolean {
        // Example: Check if username and password match with database or hardcoded values
        val validUsername = "admin"
        val validPassword = "password"
        return username == validUsername && password == validPassword
    }

    }

