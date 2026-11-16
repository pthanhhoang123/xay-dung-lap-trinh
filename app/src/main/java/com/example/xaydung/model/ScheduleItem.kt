package com.example.xaydung.model

data class ScheduleItem(
    val id: String,
    val subjectName: String,
    val room: String,
    val time: String,
    val date: String,
    val lecturer: String,
    val status: String
)
