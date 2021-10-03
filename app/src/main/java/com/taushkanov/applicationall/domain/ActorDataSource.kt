package com.taushkanov.applicationall.domain

import com.taushkanov.applicationall.R
import com.taushkanov.applicationall.models.Actor
import com.taushkanov.applicationall.models.Movie

class ActorDataSource {
    fun getActor(): List<Actor> {
        return listOf(
            Actor(R.drawable.actor,"Robert Downey Jr."),
            Actor(R.drawable.actor_1,"Chris Evans"),
            Actor(R.drawable.actor_2,"Mark Ruffalo"),
            Actor(R.drawable.actor_3,"Chris Hemsworth")
        )
    }
}