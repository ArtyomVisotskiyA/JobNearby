package com.example.jobsnearby.signin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.jobsnearby.MainActivity
import com.example.jobsnearby.R
import com.example.jobsnearby.databinding.ActivitySignInBinding
import com.example.jobsnearby.job.JobListActivity

class SignInActivity : AppCompatActivity() {
    lateinit var bindingClass:ActivitySignInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass= ActivitySignInBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
        bindingClass.btSignIn.setOnClickListener{
            val i = Intent(Intent(this, MainActivity::class.java))
            startActivity(i)

        }
    }

}