package com.example.xaydung

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class TinNhanActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tin_nhan)

        findViewById<View>(R.id.btnBack)?.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        findViewById<View>(R.id.cardTeacher1)?.setOnClickListener {
            startActivity(Intent(this, NhanTinActivity::class.java))
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

        findViewById<View>(R.id.navSchedule)?.setOnClickListener {
            startActivity(Intent(this, LichHocActivity::class.java))
            finish()
        }

        findViewById<View>(R.id.navCredit)?.setOnClickListener {
            startActivity(Intent(this, TinChiActivity::class.java))
            finish()
        }
    }
}
