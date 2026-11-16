package com.example.xaydung

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class TuitionStatusActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuition_status)

        findViewById<ImageView>(R.id.btnBack).setOnClickListener {
            finish()
        }
    }
}
