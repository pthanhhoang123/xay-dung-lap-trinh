package com.example.xaydung

import android.content.Context
import android.content.SharedPreferences

object UserSession {
    private const val PREF_NAME = "user_session"
    private const val KEY_STUDENT_ID = "student_id"
    private const val KEY_STUDENT_NAME = "student_name"

    private fun getPrefs(context: Context): SharedPreferences {
        return context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
    }

    fun saveUser(context: Context, studentId: String) {
        val studentName = when (studentId) {
            "23115141122105" -> "PHAN THANH HOÀNG"
            "23115141122117" -> "NGUYỄN THANH TÂM"
            else -> if (studentId.isNotEmpty()) "Sinh viên ($studentId)" else "PHAN THANH HOÀNG"
        }

        getPrefs(context).edit().apply {
            putString(KEY_STUDENT_ID, if (studentId.isNotEmpty()) studentId else "23115141122105")
            putString(KEY_STUDENT_NAME, studentName)
            apply()
        }
    }

    fun getStudentId(context: Context): String {
        return getPrefs(context).getString(KEY_STUDENT_ID, "23115141122105") ?: "23115141122105"
    }

    fun getStudentName(context: Context): String {
        return getPrefs(context).getString(KEY_STUDENT_NAME, "PHAN THANH HOÀNG") ?: "PHAN THANH HOÀNG"
    }
}
