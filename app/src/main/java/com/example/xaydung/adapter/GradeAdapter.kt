package com.example.xaydung.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.xaydung.R
import com.example.xaydung.model.GradeItem

class GradeAdapter(
    private val grades: List<GradeItem>
) : RecyclerView.Adapter<GradeAdapter.GradeViewHolder>() {

    class GradeViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvSubjectName: TextView = view.findViewById(R.id.tvSubjectName)
        val tvLetterGrade: TextView = view.findViewById(R.id.tvLetterGrade)
        val tvProcessGrade: TextView = view.findViewById(R.id.tvProcessGrade)
        val tvExamGrade: TextView = view.findViewById(R.id.tvExamGrade)
        val tvFinalGrade: TextView = view.findViewById(R.id.tvFinalGrade)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GradeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_grade, parent, false)
        return GradeViewHolder(view)
    }

    override fun onBindViewHolder(holder: GradeViewHolder, position: Int) {
        val item = grades[position]
        holder.tvSubjectName.text = item.subjectName
        holder.tvLetterGrade.text = item.letterGrade
        holder.tvProcessGrade.text = "Điểm QT: ${item.processGrade}"
        holder.tvExamGrade.text = "Điểm thi: ${item.examGrade}"
        holder.tvFinalGrade.text = "Tổng kết: ${item.finalGrade}"
    }

    override fun getItemCount(): Int = grades.size
}
