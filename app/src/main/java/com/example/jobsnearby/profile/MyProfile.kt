package com.example.jobsnearby.profile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.jobsnearby.R
import com.example.jobsnearby.databinding.ActivityMyProfileBinding
import com.example.jobsnearby.job.JobListActivity
import com.example.jobsnearby.map.MapActivity
import com.example.jobsnearby.respond.RespondListActivity
import com.example.jobsnearby.signin.SignInActivity
import com.google.android.material.navigation.NavigationView

class MyProfile : AppCompatActivity(),NavigationView.OnNavigationItemSelectedListener {
    lateinit var binding:ActivityMyProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMyProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.id_acc ->
            {val i = Intent(Intent(this, MyProfile::class.java))
                startActivity(i)}
            R.id.id_map ->
            {val i = Intent(Intent(this, MapActivity::class.java))
                startActivity(i)}
            R.id.id_vacancy ->
            {val i = Intent(Intent(this, JobListActivity::class.java))
                startActivity(i)}
            R.id.id_respond->{val i = Intent(Intent(this, RespondListActivity::class.java))
                startActivity(i)}
            R.id.id_exit ->{val i = Intent(Intent(this, SignInActivity::class.java))
                startActivity(i)}
        }
        return true
    }

}