package com.example.bookshelf

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.bookshelf.databinding.MainscreenactivityBinding

class ProfileLayout : AppCompatActivity() {
    private lateinit var binding: MainscreenactivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainscreenactivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Setting onClickListener for the backtomainpage button
       val button:Button=findViewById(R.id.backButton)
        button.setOnClickListener(){
            startActivity(Intent(this,MainScreenActivity::class.java))
        }
    }
}
