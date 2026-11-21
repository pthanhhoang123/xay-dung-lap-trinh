package com.example.xaydung

import android.view.View
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

fun applyTopInsetPadding(view: View?) {
    if (view == null) return
    ViewCompat.setOnApplyWindowInsetsListener(view) { v, insets ->
        val statusBarInset = insets.getInsets(WindowInsetsCompat.Type.statusBars())
        val topPadding = if (statusBarInset.top > 0) statusBarInset.top else 72
        v.setPadding(
            v.paddingLeft,
            topPadding,
            v.paddingRight,
            v.paddingBottom
        )
        insets
    }
}
