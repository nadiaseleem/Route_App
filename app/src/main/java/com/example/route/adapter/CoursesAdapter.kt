package com.example.route.CousesScreen.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.route.CousesScreen.model.Course
import com.example.route.databinding.ItemCourseBinding

class CoursesAdapter(private val courses: List<Course>) :
    RecyclerView.Adapter<CoursesAdapter.CoursesViewHolder>() {

    inner class CoursesViewHolder(val binding: ItemCourseBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoursesViewHolder {
        return CoursesViewHolder(
            ItemCourseBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = courses.size

    override fun onBindViewHolder(holder: CoursesViewHolder, position: Int) {
        val course = courses[position]
        holder.binding.imgCourse.setImageResource(course.image)
        holder.binding.courseNameBtn.text = course.name
        holder.binding.courseNameBtn.setOnClickListener {
            onCourseClick?.invoke(course)
        }
    }

    var onCourseClick: ((Course) -> Unit)? = null
}