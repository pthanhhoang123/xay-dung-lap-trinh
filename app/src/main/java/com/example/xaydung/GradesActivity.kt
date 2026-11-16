package com.example.xaydung

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.appbar.MaterialToolbar
import com.example.xaydung.adapter.GradeAdapter
import com.example.xaydung.model.GradeItem

class GradesActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var toolbar: MaterialToolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grades)

        toolbar = findViewById(R.id.toolbarGrades)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        toolbar.setNavigationOnClickListener { finish() }

        recyclerView = findViewById(R.id.recyclerViewGrades)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val sampleGrades = listOf(
            GradeItem("1", "Lập trình Android nâng cao", 3, 8.5, 9.0, 8.8, "A"),
            GradeItem("2", "Kiến trúc phần mềm", 3, 8.0, 8.5, 8.2, "B+"),
            GradeItem("3", "Lập trình Web nâng cao", 4, 9.0, 9.2, 9.1, "A+"),
            GradeItem("4", "Cơ sở dữ liệu phân tán", 3, 7.5, 8.0, 7.8, "B")
        )

        recyclerView.adapter = GradeAdapter(sampleGrades)
    }
}
