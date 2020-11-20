package com.inti.covidapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        btnRetrofit.setOnClickListener {
            val intent = Intent(this, RetrofitMainActivity::class.java)
            // start your next activity
            startActivity(intent)
//        }
    }
}