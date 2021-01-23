package com.example.academyproject.ui.reader

interface CourseReaderCallback {
    //digunakan untuk berpindah halaman ke halaman lainnya
    fun moveTo(position: Int, moduleId: String)
}