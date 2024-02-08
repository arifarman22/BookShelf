package com.example.bookshelf

import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.webkit.WebView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.example.bookshelf.databinding.MainscreenactivityBinding

class MainScreenActivity : AppCompatActivity() {

    private lateinit var binding: MainscreenactivityBinding

    @RequiresApi(Build.VERSION_CODES.P)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainscreenactivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //code for the cse dept Books List
        binding.csecardView.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://archives.daffodilvarsity.edu.bd/category/CSE"))
            startActivity(intent)
        }
        //code for the eee dept Books List
        binding.eeecardView.setOnClickListener(){
            val intent=Intent(Intent.ACTION_VIEW, Uri.parse("https://archives.daffodilvarsity.edu.bd/category/EEE"))
        }
        //code for the mechanical dept Books List
        binding.mechanicalCardView.setOnClickListener(){
            val intent=Intent(Intent.ACTION_VIEW, Uri.parse("https://archives.daffodilvarsity.edu.bd/category/ETE"))
        }
        //code for the textile Dept Books List
        binding.textileCardView.setOnClickListener(){
            val intent=Intent(Intent.ACTION_VIEW,Uri.parse("https://archives.daffodilvarsity.edu.bd/category/TE"))
        }
        //code for the civil dept Books List
        binding.civilcardView.setOnClickListener(){
            val intent=Intent(Intent.ACTION_VIEW, Uri.parse("https://archives.daffodilvarsity.edu.bd/category/CE"))
        }
        //code for the nfe Dept Books List
        binding.nfeCardView.setOnClickListener(){
            val intent=Intent(Intent.ACTION_VIEW, Uri.parse("https://archives.daffodilvarsity.edu.bd/category/NFE"))
        }
    }
}
