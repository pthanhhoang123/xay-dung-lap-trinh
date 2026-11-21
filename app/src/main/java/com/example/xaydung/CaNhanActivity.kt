package com.example.xaydung

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class CaNhanActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ca_nhan)

        findViewById<View>(R.id.btnBack)?.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        findViewById<MaterialButton>(R.id.btnLogout)?.setOnClickListener {
            val intent = Intent(this, DangNhapActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
            finish()
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

        findViewById<View>(R.id.navMessage)?.setOnClickListener {
            startActivity(Intent(this, TinNhanActivity::class.java))
            finish()
        }
    }
}
