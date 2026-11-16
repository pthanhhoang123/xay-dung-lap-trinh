package com.example.xaydung

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.example.xaydung.adapter.CourseAdapter
import com.example.xaydung.model.Course

class CourseListActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var fabAdd: FloatingActionButton
    private lateinit var toolbar: MaterialToolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_course_list)

        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        toolbar.setNavigationOnClickListener { finish() }

        recyclerView = findViewById(R.id.recyclerViewCourses)
        fabAdd = findViewById(R.id.fabAddCourse)

        recyclerView.layoutManager = LinearLayoutManager(this)

        val sampleCourses = listOf(
            Course("1", "Lập trình Android cơ bản", "Học phát triển ứng dụng Android với Kotlin và Android Studio.", "Nguyễn Văn A", "2 tháng", "Lập trình di động"),
            Course("2", "Lập trình Android nâng cao", "Chuyên sâu về Jetpack Compose, Coroutines, MVVM và Clean Architecture.", "Trần Thị B", "3 tháng", "Lập trình di động"),
            Course("3", "Thiết kế UI/UX cơ bản", "Nguyên lý thiết kế giao diện người dùng và trải nghiệm người dùng trên Figma.", "Lê Văn C", "1.5 tháng", "Thiết kế"),
            Course("4", "Cơ sở dữ liệu và SQL", "Quản lý cơ sở dữ liệu quan hệ, SQLite, Room database trong Android.", "Phạm Thị D", "2 tháng", "Cơ sở dữ liệu")
        )

        val adapter = CourseAdapter(sampleCourses) { course ->
            val intent = Intent(this, CourseDetailActivity::class.java).apply {
                putExtra("COURSE_ID", course.id)
                putExtra("COURSE_TITLE", course.title)
                putExtra("COURSE_DESC", course.description)
                putExtra("COURSE_INSTRUCTOR", course.instructor)
                putExtra("COURSE_DURATION", course.duration)
                putExtra("COURSE_CATEGORY", course.category)
            }
            startActivity(intent)
        }

        recyclerView.adapter = adapter

        fabAdd.setOnClickListener {
            Toast.makeText(this, "Chức năng thêm khóa học mới", Toast.LENGTH_SHORT).show()
        }
    }
}
