package com.example.academyproject.ui.bookmark

import com.example.academyproject.data.CourseEntity

interface BookmarkFragmentCallback {
    fun onShareClick(course: CourseEntity)
}