package com.example.jobsnearby.respond

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.jobsnearby.R
import com.example.jobsnearby.databinding.ActivityAddRespondBinding

class AddRespondActivity : AppCompatActivity() {
    lateinit var binding:ActivityAddRespondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddRespondBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}