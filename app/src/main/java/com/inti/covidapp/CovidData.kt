package com.inti.covidapp

import com.google.gson.annotations.SerializedName
import java.util.*

data class CovidData(

    val dateChecked: Date,
    val positiveIncrease: Int,
    val negativeIncrease: Int,
    val deathIncrease: Int,
    val state: String,


    //below maps the json var  to the kotlin var
    //only use the serialized tags if the local variable doesnt match the json file
//    @SerializedName("dateChecked") val dateChecked: String,
//    @SerializedName("positiveIncrease") val positiveIncrease: String,
//    @SerializedName("negativeIncrease") val negativeIncrease: String,
//    @SerializedName("deathIncrease") val deathIncrease: String,
//    @SerializedName("state") val state: String,


)