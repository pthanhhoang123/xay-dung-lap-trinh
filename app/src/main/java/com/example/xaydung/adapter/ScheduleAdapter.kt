package com.example.xaydung.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.xaydung.R
import com.example.xaydung.model.ScheduleItem

class ScheduleAdapter(
    private val schedules: List<ScheduleItem>
) : RecyclerView.Adapter<ScheduleAdapter.ScheduleViewHolder>() {

    class ScheduleViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvSubjectName: TextView = view.findViewById(R.id.tvSubjectName)
        val tvStatus: TextView = view.findViewById(R.id.tvStatus)
        val tvTime: TextView = view.findViewById(R.id.tvTime)
        val tvDate: TextView = view.findViewById(R.id.tvDate)
        val tvRoom: TextView = view.findViewById(R.id.tvRoom)
        val tvLecturer: TextView = view.findViewById(R.id.tvLecturer)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ScheduleViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_schedule, parent, false)
        return ScheduleViewHolder(view)
    }

    override fun onBindViewHolder(holder: ScheduleViewHolder, position: Int) {
        val item = schedules[position]
        holder.tvSubjectName.text = item.subjectName
        holder.tvStatus.text = item.status
        holder.tvTime.text = item.time
        holder.tvDate.text = item.date
        holder.tvRoom.text = item.room
        holder.tvLecturer.text = item.lecturer
    }

    override fun getItemCount(): Int = schedules.size
}
