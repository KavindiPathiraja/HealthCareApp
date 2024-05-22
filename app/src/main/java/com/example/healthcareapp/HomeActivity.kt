package com.example.healthcareapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        val doctors = findViewById<ImageView>(R.id.imageView4)
        doctors.setOnClickListener {
            val intent = Intent(this, DoctorActivity::class.java)
            startActivity(intent)
        }
        val shedule = findViewById<Button>(R.id.button2)
        shedule.setOnClickListener {
            val intent = Intent(this, SheduleActivity::class.java)
            startActivity(intent)
        }

        val profile = findViewById<ImageView>(R.id.imageView2)
        profile.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }

        val medicine = findViewById<ImageView>(R.id.imageView7)
        medicine.setOnClickListener {
            val intent = Intent(this, MedicineActivity::class.java)
            startActivity(intent)
        }

        val lab = findViewById<ImageView>(R.id.imageView6)
        lab.setOnClickListener {
            val intent = Intent(this, LabActivity::class.java)
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

        val pha = findViewById<ImageView>(R.id.imageView5)
        pha.setOnClickListener {
            val intent = Intent(this, PharmacyActivity::class.java)
            startActivity(intent)
        }

    }
}