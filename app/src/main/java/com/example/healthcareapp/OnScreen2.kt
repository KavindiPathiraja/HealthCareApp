package com.example.healthcareapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class OnScreen2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_screen2)

        val On3 = findViewById<Button>(R.id.button22)
        On3.setOnClickListener {
            val intent = Intent(this, OnScreen3::class.java)
            startActivity(intent)
            finish()
        }

        val log = findViewById<Button>(R.id.button19)
        log.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
            finish()
        }
    }
}