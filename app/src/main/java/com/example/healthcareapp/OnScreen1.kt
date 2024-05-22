package com.example.healthcareapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class OnScreen1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_screen1)


        val On2 = findViewById<Button>(R.id.button20)
        On2.setOnClickListener {
            val intent = Intent(this, OnScreen2::class.java)
            startActivity(intent)
            finish()
        }

        val log = findViewById<Button>(R.id.button21)
        log.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
            finish()
        }
    }
}