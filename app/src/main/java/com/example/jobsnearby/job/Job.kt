package com.example.jobsnearby.job

import java.io.Serializable

data class Job( val title:String,  val address: String,
               val payment: String, val time:String, val date:String): Serializable
