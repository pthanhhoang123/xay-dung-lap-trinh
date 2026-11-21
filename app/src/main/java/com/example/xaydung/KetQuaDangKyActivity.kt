package com.example.xaydung

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class KetQuaDangKyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ket_qua_dang_ky)

        findViewById<TextView>(R.id.tvResultDesc)?.text =
            "Hệ thống đã ghi nhận danh sách môn học đăng ký của sinh viên ${UserSession.getStudentName(this)}."

        val backClick = View.OnClickListener { finish() }
        findViewById<View>(R.id.btnBackContainer)?.setOnClickListener(backClick)
        findViewById<View>(R.id.btnBack)?.setOnClickListener(backClick)

        findViewById<MaterialButton>(R.id.btnGoHome)?.setOnClickListener {
            val intent = Intent(this, TrangChuActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
            finish()
        }
    }
}
