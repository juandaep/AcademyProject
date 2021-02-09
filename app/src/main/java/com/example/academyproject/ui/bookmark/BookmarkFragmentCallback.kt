package com.example.academyproject.ui.bookmark

import com.example.academyproject.data.source.local.entity.CourseEntity

interface BookmarkFragmentCallback {
    fun onShareClick(course: CourseEntity)
}