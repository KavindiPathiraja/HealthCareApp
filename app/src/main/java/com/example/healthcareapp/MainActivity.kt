package com.example.healthcareapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val On1 = findViewById<Button>(R.id.MediCare)
        On1.setOnClickListener {
            val intent = Intent(this, OnScreen1::class.java)
            startActivity(intent)
            finish()
        }


    }


}