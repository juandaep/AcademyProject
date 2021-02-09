package com.example.academyproject.di

import android.content.Context
import com.example.academyproject.data.source.AcademyRepository
import com.example.academyproject.data.source.remote.RemoteDataSource
import com.example.academyproject.utils.JsonHelper

object Injection {
    fun provideRepository(context: Context): AcademyRepository {

        val remoteDataSource = RemoteDataSource.getInstance(JsonHelper(context))

        return AcademyRepository.getInstance(remoteDataSource)
    }
}