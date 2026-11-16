package com.example.xaydung.model

data class GradeItem(
    val id: String,
    val subjectName: String,
    val credits: Int,
    val processGrade: Double,
    val examGrade: Double,
    val finalGrade: Double,
    val letterGrade: String
)
