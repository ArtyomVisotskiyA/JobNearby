package com.example.jobsnearby.respond

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.jobsnearby.databinding.ActivityCorrespondencectivityBinding

class CorrespondenceActivity : AppCompatActivity() {
    lateinit var binding : ActivityCorrespondencectivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCorrespondencectivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}