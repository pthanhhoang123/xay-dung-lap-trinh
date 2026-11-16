package com.example.xaydung

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class TeacherListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teacher_list)

        findViewById<ImageView>(R.id.btnBack).setOnClickListener {
            finish()
        }

        findViewById<View>(R.id.cardTeacher1).setOnClickListener {
            startActivity(Intent(this, ChatActivity::class.java))
        }

        setupBottomNavigation()
    }

    private fun setupBottomNavigation() {
        findViewById<View>(R.id.navHome).setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }

        findViewById<View>(R.id.navSearch).setOnClickListener {
            startActivity(Intent(this, SearchNotificationActivity::class.java))
            finish()
        }

        findViewById<View>(R.id.navSchedule).setOnClickListener {
            startActivity(Intent(this, ScheduleActivity::class.java))
            finish()
        }

        findViewById<View>(R.id.navCredit).setOnClickListener {
            startActivity(Intent(this, CreditCenterActivity::class.java))
            finish()
        }
    }
}
