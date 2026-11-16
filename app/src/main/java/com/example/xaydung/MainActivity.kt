package com.example.xaydung

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.card.MaterialCardView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<ImageView>(R.id.imgAvatar).setOnClickListener {
            startActivity(Intent(this, StudentProfileActivity::class.java))
        }

        findViewById<MaterialCardView>(R.id.cardNotification1).setOnClickListener {
            startActivity(Intent(this, NotificationDetailActivity::class.java))
        }

        findViewById<MaterialCardView>(R.id.cardNotification2).setOnClickListener {
            startActivity(Intent(this, NotificationDetailActivity::class.java))
        }

        setupBottomNavigation()
    }

    private fun setupBottomNavigation() {
        findViewById<View>(R.id.navSearch).setOnClickListener {
            startActivity(Intent(this, SearchNotificationActivity::class.java))
        }

        findViewById<View>(R.id.navSchedule).setOnClickListener {
            startActivity(Intent(this, ScheduleActivity::class.java))
        }

        findViewById<View>(R.id.navCredit).setOnClickListener {
            startActivity(Intent(this, CreditCenterActivity::class.java))
        }

        findViewById<View>(R.id.navMessage).setOnClickListener {
            startActivity(Intent(this, TeacherListActivity::class.java))
        }
    }
}
