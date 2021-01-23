package com.example.academyproject.ui.bookmark

import androidx.lifecycle.ViewModel
import com.example.academyproject.data.CourseEntity
import com.example.academyproject.utils.DataDummy.generateDummyCourses

class BookmarkViewModel : ViewModel() {

    fun getBookmarks() : List<CourseEntity> = generateDummyCourses()
}