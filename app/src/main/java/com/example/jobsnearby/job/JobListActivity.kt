package com.example.jobsnearby.job



import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.jobsnearby.R


import com.example.jobsnearby.databinding.ActivityJobListBinding
import com.example.jobsnearby.map.MapActivity
import com.example.jobsnearby.profile.MyProfile
import com.example.jobsnearby.respond.RespondListActivity
import com.example.jobsnearby.signin.SignInActivity
import com.google.android.material.navigation.NavigationView

class JobListActivity : AppCompatActivity(),NavigationView.OnNavigationItemSelectedListener {
    lateinit var binding: ActivityJobListBinding
    private val adapter = JobAdapter()
    private var editLauncher: ActivityResultLauncher<Intent>? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityJobListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.navView.setNavigationItemSelectedListener(this)

        init()
        editLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
            if (it.resultCode == RESULT_OK)
                adapter.addJob(it.data?.getSerializableExtra("job") as Job)

        }

    }

    private fun init() {
        binding.apply {
            rcView.layoutManager = LinearLayoutManager(this@JobListActivity)
            rcView.adapter = adapter
            btAddVacancy.setOnClickListener {

                editLauncher?.launch(Intent(this@JobListActivity, AddVacancyActivity::class.java))

            }
        }
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
