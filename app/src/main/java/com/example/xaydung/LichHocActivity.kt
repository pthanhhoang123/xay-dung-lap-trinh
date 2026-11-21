package com.example.xaydung

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class LichHocActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lich_hoc)

        findViewById<View>(R.id.btnBack)?.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        findViewById<View>(R.id.cardScheduleSubject1)?.setOnClickListener {
            startActivity(Intent(this, ThongTinMonHocActivity::class.java))
        }

        setupBottomNavigation()
    }

    private fun setupBottomNavigation() {
        findViewById<View>(R.id.navHome)?.setOnClickListener {
            startActivity(Intent(this, TrangChuActivity::class.java))
            finish()
        }

        findViewById<View>(R.id.navSearch)?.setOnClickListener {
            startActivity(Intent(this, TimKiemThongBaoActivity::class.java))
            finish()
        }

        findViewById<View>(R.id.navCredit)?.setOnClickListener {
            startActivity(Intent(this, TinChiActivity::class.java))
            finish()
        }

        findViewById<View>(R.id.navMessage)?.setOnClickListener {
            startActivity(Intent(this, TinNhanActivity::class.java))
            finish()
        }
    }
}
