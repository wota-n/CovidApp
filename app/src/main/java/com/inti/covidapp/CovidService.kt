package com.inti.covidapp
import retrofit2.http.GET
import retrofit2.Call

//this page is to call the REST api for the data relating to covid cases in the US

interface CovidService{

    @GET("us/daily.json")
    fun getNationalData(): Call<List<CovidData>>

    @GET("states/daily.json")
    fun getStatesData(): Call<List<CovidData>>
}