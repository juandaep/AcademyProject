package com.example.academyproject.ui.bookmark

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.academyproject.data.source.local.entity.CourseEntity
import com.example.academyproject.data.source.AcademyRepository

class BookmarkViewModel(private val academyRepository: AcademyRepository) : ViewModel() {

    fun getBookmarks() : LiveData<List<CourseEntity>> = academyRepository.getBookmarkedCourses()
}