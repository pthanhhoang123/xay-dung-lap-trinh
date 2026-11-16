package com.example.xaydung

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.card.MaterialCardView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cardCourse = findViewById<MaterialCardView>(R.id.cardCourseManagement)
        val cardSchedule = findViewById<MaterialCardView>(R.id.cardSchedule)
        val cardGrades = findViewById<MaterialCardView>(R.id.cardGrades)
        val cardProfile = findViewById<MaterialCardView>(R.id.cardProfile)

        cardCourse.setOnClickListener {
            val intent = Intent(this, CourseListActivity::class.java)
            startActivity(intent)
        }

        cardSchedule.setOnClickListener {
            val intent = Intent(this, ScheduleActivity::class.java)
            startActivity(intent)
        }

        cardGrades.setOnClickListener {
            val intent = Intent(this, GradesActivity::class.java)
            startActivity(intent)
        }

        cardProfile.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }
    }
}
