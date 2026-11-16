package com.example.xaydung

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.card.MaterialCardView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cardCourse = findViewById<MaterialCardView>(R.id.cardCourseManagement)
        val cardStudent = findViewById<MaterialCardView>(R.id.cardStudentManagement)

        cardCourse.setOnClickListener {
            val intent = Intent(this, CourseListActivity::class.java)
            startActivity(intent)
        }

        cardStudent.setOnClickListener {
            Toast.makeText(this, "Màn hình Quản lý học viên đang phát triển", Toast.LENGTH_SHORT).show()
        }
    }
}
