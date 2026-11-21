package com.example.xaydung

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class DangNhapActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dang_nhap)

        val etStudentId = findViewById<TextInputEditText>(R.id.etStudentId)
        val btnLogin = findViewById<MaterialButton>(R.id.btnLogin)
        val tvForgotPassword = findViewById<TextView>(R.id.tvForgotPassword)

        btnLogin.setOnClickListener {
            val studentId = etStudentId.text.toString().trim()
            UserSession.saveUser(this, studentId)
            val studentName = UserSession.getStudentName(this)
            Toast.makeText(this, "Xin chào $studentName!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, TrangChuActivity::class.java)
            startActivity(intent)
            finish()
        }

        tvForgotPassword.setOnClickListener {
            Toast.makeText(this, "Chức năng khôi phục mật khẩu đang phát triển", Toast.LENGTH_SHORT).show()
        }
    }
}
