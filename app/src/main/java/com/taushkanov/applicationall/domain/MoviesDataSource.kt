package com.taushkanov.applicationall.domain

import com.taushkanov.applicationall.R
import com.taushkanov.applicationall.models.Movie

class MoviesDataSource {
fun getMovies():List<Movie>{
return listOf(
Movie(R.drawable.photo_avengers,"13+",false,"Action, Adventure, Fantasy",true,true,true,true,false,"125 REVIEWS","Avengers: End Game","137 MIN"),
Movie(R.drawable.tenet_cover,"16+",true,"Action, Sci-Fi, Thriller",true,true,true,true,true,"98 REVIEWS","Tenet","97 MIN"),
Movie(R.drawable.black_window_cover,"13+",false,"Action, Adventure, Sci-Fi",true,true,true,true,false,"38 REVIEWS","Black Widow","102 MIN"),
Movie(R.drawable.wonder_woman_cover,"13+",false,"Action, Adventure, Fantasy",true,true,true,true,true,"74 REVIEWS","Wonder Woman 1984","120 MIN")
)
}
}