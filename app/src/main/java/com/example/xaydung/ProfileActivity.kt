package com.example.xaydung

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.button.MaterialButton

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val toolbar = findViewById<MaterialToolbar>(R.id.toolbarProfile)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        toolbar.setNavigationOnClickListener { finish() }

        val btnLogout = findViewById<MaterialButton>(R.id.btnLogout)
        btnLogout.setOnClickListener {
            Toast.makeText(this, "Đã đăng xuất tài khoản", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}
