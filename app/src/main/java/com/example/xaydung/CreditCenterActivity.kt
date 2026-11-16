package com.example.xaydung

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class CreditCenterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_credit_center)

        findViewById<ImageView>(R.id.btnBack).setOnClickListener {
            finish()
        }

        findViewById<View>(R.id.cardRegisterCredit).setOnClickListener {
            startActivity(Intent(this, CreditRegistrationActivity::class.java))
        }

        findViewById<View>(R.id.cardTuitionStatus).setOnClickListener {
            startActivity(Intent(this, TuitionStatusActivity::class.java))
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

        findViewById<View>(R.id.navMessage).setOnClickListener {
            startActivity(Intent(this, TeacherListActivity::class.java))
            finish()
        }
    }
}
