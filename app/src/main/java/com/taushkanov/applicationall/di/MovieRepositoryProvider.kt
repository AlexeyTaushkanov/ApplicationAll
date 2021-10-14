package com.taushkanov.applicationall.di

import com.taushkanov.applicationall.data.MovieRepository

internal interface MovieRepositoryProvider {
    fun provideMovieRepository(): MovieRepository
}