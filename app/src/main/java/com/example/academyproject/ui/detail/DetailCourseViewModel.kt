package com.example.academyproject.ui.detail

import androidx.lifecycle.ViewModel
import com.example.academyproject.data.CourseEntity
import com.example.academyproject.data.ModuleEntity
import com.example.academyproject.utils.DataDummy.generateDummyCourses
import com.example.academyproject.utils.DataDummy.generateDummyModules

class DetailCourseViewModel : ViewModel() {

    private lateinit var courseId: String

    fun setSelectedCourse(courseId: String) {
        this.courseId = courseId
    }

    fun getCourse(): CourseEntity {
        lateinit var course: CourseEntity
        val coursesEntities = generateDummyCourses()
        for (courseEntity in coursesEntities) {
            if (courseEntity.courseId == courseId) {
                course = courseEntity
            }
        }
        return course
    }

    fun getModules(): List<ModuleEntity> = generateDummyModules(courseId)
}