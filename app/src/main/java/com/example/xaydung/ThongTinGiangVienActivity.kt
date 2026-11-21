package com.example.xaydung

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class ThongTinGiangVienActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thong_tin_giang_vien)

        val backClick = View.OnClickListener { finish() }
        findViewById<View>(R.id.btnBackContainer)?.setOnClickListener(backClick)
        findViewById<View>(R.id.btnBack)?.setOnClickListener(backClick)

        findViewById<MaterialButton>(R.id.btnContact)?.setOnClickListener {
            Toast.makeText(this, "Đang kết nối liên hệ với ThS. Đỗ Phú Huy", Toast.LENGTH_SHORT).show()
        }
    }
}
