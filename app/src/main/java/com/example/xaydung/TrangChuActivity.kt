package com.example.xaydung

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.card.MaterialCardView

class TrangChuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trang_chu)

        findViewById<TextView>(R.id.tvUserName)?.text = UserSession.getStudentName(this)

        val openProfile = View.OnClickListener {
            startActivity(Intent(this, CaNhanActivity::class.java))
        }

        findViewById<View>(R.id.headerProfile)?.setOnClickListener(openProfile)
        findViewById<ImageView>(R.id.imgAvatar)?.setOnClickListener(openProfile)

        findViewById<MaterialCardView>(R.id.cardNotification1)?.setOnClickListener {
            startActivity(Intent(this, ChiTietThongBaoActivity::class.java))
        }

        findViewById<MaterialCardView>(R.id.cardNotification2)?.setOnClickListener {
            startActivity(Intent(this, ChiTietThongBaoActivity::class.java))
        }

        setupBottomNavigation()
    }

    private fun setupBottomNavigation() {
        findViewById<View>(R.id.navSearch)?.setOnClickListener {
            startActivity(Intent(this, TimKiemThongBaoActivity::class.java))
        }

        findViewById<View>(R.id.navSchedule)?.setOnClickListener {
            startActivity(Intent(this, LichHocActivity::class.java))
        }

        findViewById<View>(R.id.navCredit)?.setOnClickListener {
            startActivity(Intent(this, TinChiActivity::class.java))
        }

        findViewById<View>(R.id.navMessage)?.setOnClickListener {
            startActivity(Intent(this, TinNhanActivity::class.java))
        }
    }
}
