package com.example.healthcareapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class LabActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lab)

        val she = findViewById<ImageButton>(R.id.imageButton10)
        she.setOnClickListener {
            val intent = Intent(this, SheduleActivity::class.java)
            startActivity(intent)
        }

        val art = findViewById<ImageButton>(R.id.imageButton11)
        art.setOnClickListener {
            val intent = Intent(
                this, ArticleActivity::class.java)
            startActivity(intent)
        }

        val pro = findViewById<ImageButton>(R.id.imageButton12)
        pro.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }

        val home = findViewById<ImageButton>(R.id.imageButton9)
        home.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        val back = findViewById<ImageButton>(R.id.imageButton25)
        back.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}