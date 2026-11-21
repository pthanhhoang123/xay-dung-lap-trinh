package com.example.xaydung

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class ChiTietThongBaoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chi_tiet_thong_bao)

        applyTopInsetPadding(findViewById(R.id.headerToolbar))

        val backClick = View.OnClickListener { finish() }
        findViewById<View>(R.id.btnBackContainer)?.setOnClickListener(backClick)
        findViewById<View>(R.id.btnBack)?.setOnClickListener(backClick)

        findViewById<MaterialButton>(R.id.btnIntegrateSchedule)?.setOnClickListener {
            Toast.makeText(this, "Đã tích hợp lịch học bù vào lịch cá nhân!", Toast.LENGTH_SHORT).show()
        }
    }
}
