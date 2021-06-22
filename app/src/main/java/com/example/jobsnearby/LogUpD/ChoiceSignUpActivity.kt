package com.example.jobsnearby.LogUpD

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.jobsnearby.MainActivity
import com.example.jobsnearby.R
import com.example.jobsnearby.databinding.ActivityChoiceSignUpBinding
import com.example.jobsnearby.databinding.ActivitySignUpBinding

class ChoiceSignUpActivity : AppCompatActivity() {

    lateinit var bindingClass: ActivityChoiceSignUpBinding





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityChoiceSignUpBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.btSignUpEmployer.setOnClickListener{

            val i = Intent(Intent(this, SignUpActivity::class.java))
            startActivity(i)

        }


    }



}