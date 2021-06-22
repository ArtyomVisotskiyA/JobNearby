package com.example.jobsnearby.job

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.jobsnearby.R
import com.example.jobsnearby.databinding.ActivityAddVacancyBinding

class AddVacancyActivity : AppCompatActivity() {

    lateinit var binding:ActivityAddVacancyBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddVacancyBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initButtons()
    }

    private fun initButtons()= with(binding){

        btDoneVacancy.setOnClickListener{
            val job = Job(edTitle.text.toString(),edAdress.text.toString(),
                edPayment.text.toString(), edTime.text.toString(), edDate.text.toString())
            val editIntent = Intent().apply {
                putExtra("job", job)

            }
            setResult(RESULT_OK, editIntent)
            finish()
        }
    }

}