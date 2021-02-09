package com.example.academyproject.ui.academy

import androidx.lifecycle.ViewModel
import com.example.academyproject.data.source.local.entity.CourseEntity
import com.example.academyproject.data.source.AcademyRepository

class AcademyViewModel(private val academyRepository: AcademyRepository) : ViewModel() {

    fun getCourses(): List<CourseEntity> = academyRepository.getAllCourses()
}