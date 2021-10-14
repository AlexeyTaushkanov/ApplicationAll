package com.taushkanov.applicationall.model

import com.taushkanov.applicationall.model.Actor
import com.taushkanov.applicationall.model.Genre

data class Movie(
    val id: Int,
    val pgAge: Int,
    val title: String,
    val genres: List<Genre>,
    val runningTime: Int,
    val reviewCount: Int,
    val isLiked: Boolean,
    val rating: Int,
    val imageUrl: String,
    val detailImageUrl: String,
    val storyLine: String,
    val actors: List<Actor>,
)