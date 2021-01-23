package com.example.academyproject.ui.academy

import androidx.lifecycle.ViewModel
import com.example.academyproject.data.CourseEntity
import com.example.academyproject.utils.DataDummy.generateDummyCourses

class AcademyViewModel : ViewModel() {

    fun getCourses(): List<CourseEntity> = generateDummyCourses()
}