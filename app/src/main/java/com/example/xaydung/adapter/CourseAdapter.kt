package com.example.xaydung.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.xaydung.R
import com.example.xaydung.model.Course

class CourseAdapter(
    private val courses: List<Course>,
    private val onItemClick: (Course) -> Unit
) : RecyclerView.Adapter<CourseAdapter.CourseViewHolder>() {

    class CourseViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvTitle: TextView = view.findViewById(R.id.tvCourseTitle)
        val tvCategory: TextView = view.findViewById(R.id.tvCourseCategory)
        val tvDescription: TextView = view.findViewById(R.id.tvCourseDescription)
        val tvInstructor: TextView = view.findViewById(R.id.tvInstructor)
        val tvDuration: TextView = view.findViewById(R.id.tvDuration)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CourseViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_course, parent, false)
        return CourseViewHolder(view)
    }

    override fun onBindViewHolder(holder: CourseViewHolder, position: Int) {
        val course = courses[position]
        holder.tvTitle.text = course.title
        holder.tvCategory.text = course.category
        holder.tvDescription.text = course.description
        holder.tvInstructor.text = "GV: ${course.instructor}"
        holder.tvDuration.text = course.duration

        holder.itemView.setOnClickListener {
            onItemClick(course)
        }
    }

    override fun getItemCount(): Int = courses.size
}
