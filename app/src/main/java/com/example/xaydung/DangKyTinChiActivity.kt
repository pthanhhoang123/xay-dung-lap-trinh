package com.example.xaydung

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class DangKyTinChiActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dang_ky_tin_chi)

        val backClick = View.OnClickListener { finish() }
        findViewById<View>(R.id.btnBackContainer)?.setOnClickListener(backClick)
        findViewById<View>(R.id.btnBack)?.setOnClickListener(backClick)

        findViewById<MaterialButton>(R.id.btnConfirmRegistration)?.setOnClickListener {
            val intent = Intent(this, KetQuaDangKyActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
