package com.example.jobsnearby

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.jobsnearby.databinding.ActivityMainBinding
import com.example.jobsnearby.job.JobListActivity
import com.example.jobsnearby.map.MapActivity
import com.example.jobsnearby.profile.MyProfile
import com.example.jobsnearby.respond.RespondListActivity
import com.example.jobsnearby.signin.SignInActivity
import com.google.android.material.navigation.NavigationView
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener{

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.navView.setNavigationItemSelectedListener(this)



    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.id_acc ->
            {val i = Intent(Intent(this, MyProfile::class.java))
            startActivity(i)}
            R.id.id_map ->
            {val i =Intent(Intent(this, MapActivity::class.java))
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