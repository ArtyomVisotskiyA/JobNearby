package com.example.jobsnearby.LogUpD

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.jobsnearby.signin.SignInActivity
import com.example.jobsnearby.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {


    lateinit var bindingClass: ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)








        bindingClass.btSignUp.setOnClickListener {


                val i = Intent(Intent(this, SignInActivity::class.java))
                startActivity(i)
            }
        }
    }








