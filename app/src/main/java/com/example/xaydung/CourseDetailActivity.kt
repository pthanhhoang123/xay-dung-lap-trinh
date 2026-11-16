package com.example.xaydung

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.button.MaterialButton

class CourseDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_course_detail)

        val toolbar = findViewById<MaterialToolbar>(R.id.toolbarDetail)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        toolbar.setNavigationOnClickListener { finish() }

        val tvTitle = findViewById<TextView>(R.id.tvDetailTitle)
        val tvCategory = findViewById<TextView>(R.id.tvDetailCategory)
        val tvInstructor = findViewById<TextView>(R.id.tvDetailInstructor)
        val tvDuration = findViewById<TextView>(R.id.tvDetailDuration)
        val tvDescription = findViewById<TextView>(R.id.tvDetailDescription)
        val btnEnroll = findViewById<MaterialButton>(R.id.btnEnroll)

        val title = intent.getStringExtra("COURSE_TITLE") ?: "Khóa học"
        val category = intent.getStringExtra("COURSE_CATEGORY") ?: "Chung"
        val instructorName = intent.getStringExtra("COURSE_INSTRUCTOR") ?: "Giảng viên"
        val duration = intent.getStringExtra("COURSE_DURATION") ?: "1 tháng"
        val description = intent.getStringExtra("COURSE_DESC") ?: "Chưa có mô tả"

        tvTitle.text = title
        tvCategory.text = category
        tvInstructor.text = instructorName
        tvDuration.text = duration
        tvDescription.text = description

        btnEnroll.setOnClickListener {
            Toast.makeText(this, "Đăng ký thành công khóa học: $title", Toast.LENGTH_LONG).show()
        }
    }
}
