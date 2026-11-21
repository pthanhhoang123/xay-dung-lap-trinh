package com.example.xaydung

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class NhanTinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nhan_tin)

        val backClick = View.OnClickListener { finish() }
        findViewById<View>(R.id.btnBackContainer)?.setOnClickListener(backClick)
        findViewById<View>(R.id.btnBack)?.setOnClickListener(backClick)

        val openTeacherInfo = View.OnClickListener {
            startActivity(Intent(this, ThongTinGiangVienActivity::class.java))
        }
        findViewById<View>(R.id.headerTeacherInfo)?.setOnClickListener(openTeacherInfo)
        findViewById<View>(R.id.btnInfoContainer)?.setOnClickListener(openTeacherInfo)
        findViewById<View>(R.id.btnInfo)?.setOnClickListener(openTeacherInfo)
    }
}
