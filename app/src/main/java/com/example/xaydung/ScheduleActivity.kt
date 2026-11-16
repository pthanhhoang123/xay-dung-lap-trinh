package com.example.xaydung

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.appbar.MaterialToolbar
import com.example.xaydung.adapter.ScheduleAdapter
import com.example.xaydung.model.ScheduleItem

class ScheduleActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var toolbar: MaterialToolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_schedule)

        toolbar = findViewById(R.id.toolbarSchedule)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        toolbar.setNavigationOnClickListener { finish() }

        recyclerView = findViewById(R.id.recyclerViewSchedule)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val sampleSchedules = listOf(
            ScheduleItem("1", "Lập trình điện thoại di động", "Phòng 3.505", "07:30 - 11:30", "28/05/2026", "Nguyễn Văn A", "Sắp diễn ra"),
            ScheduleItem("2", "Kiến trúc phần mềm", "Phòng 2.202", "13:30 - 17:00", "29/05/2026", "Trần Thị B", "Đã học"),
            ScheduleItem("3", "Lập trình Web nâng cao", "Phòng Lab 1", "07:30 - 11:30", "31/05/2026", "Lê Văn C", "Sắp diễn ra"),
            ScheduleItem("4", "Cơ sở dữ liệu phân tán", "Phòng 4.102", "13:30 - 17:00", "02/06/2026", "Phạm Thị D", "Sắp diễn ra")
        )

        recyclerView.adapter = ScheduleAdapter(sampleSchedules)
    }
}
