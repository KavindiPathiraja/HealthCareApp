package com.example.healthcareapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class DoctorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doctor)

        val Book = findViewById<TextView>(R.id.textView25)
        Book.setOnClickListener {
            val intent = Intent(this, BookingActivity::class.java)
            startActivity(intent)
        }

        val she = findViewById<ImageButton>(R.id.imageButton10)
        she.setOnClickListener {
            val intent = Intent(this, SheduleActivity::class.java)
            startActivity(intent)
        }

        val art = findViewById<ImageButton>(R.id.imageButton11)
        art.setOnClickListener {
            val intent = Intent(this, ArticleActivity::class.java)
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

        val back = findViewById<ImageButton>(R.id.imageButton5)
        back.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        val gendoc = findViewById<ImageView>(R.id.imageView9)
        gendoc.setOnClickListener {
            val intent = Intent(this, GeneraldoctorsActivity::class.java)
            startActivity(intent)
        }
    }


}