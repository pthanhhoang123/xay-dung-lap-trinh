package com.example.xaydung

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class TinhTrangHocPhiActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tinh_trang_hoc_phi)

        findViewById<View>(R.id.btnBack)?.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }
    }
}
