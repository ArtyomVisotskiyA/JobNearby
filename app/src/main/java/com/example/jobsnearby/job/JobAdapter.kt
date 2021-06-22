package com.example.jobsnearby.job

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.jobsnearby.R
import com.example.jobsnearby.databinding.JobItemBinding
import java.util.ArrayList

class JobAdapter: RecyclerView.Adapter<JobAdapter.JobHolder>() {
    val jobList = ArrayList<Job>()

    class JobHolder(item:View):RecyclerView.ViewHolder(item) {
        val binding = JobItemBinding.bind(item)
        fun bind(job: Job) = with(binding) {
            tvTitle.text = job.title
            tvAdress.text = "Адрес: ${job.address}"
            tvDate.text = "Дата: ${job.date}"
            tvPayment.text = "Оплата: ${job.payment}"
            tvTime.text = "Время на работу: ${job.time}"


        }



    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JobHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.job_item,parent, false)
        return JobHolder(view)
    }

    override fun onBindViewHolder(holder: JobHolder, position: Int) {
        holder.bind(jobList[position])
    }

    override fun getItemCount(): Int {
        return jobList.size
    }
    fun addJob(job: Job){
        jobList.add(job)
        notifyDataSetChanged()
    }



}


