package com.taushkanov.applicationall

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.taushkanov.applicationall.models.Movie

class MoviesAdapter(
    var movies: List<Movie>,
    private val onClickListener: MyOnClickListener
) : RecyclerView.Adapter<DataViewHolder>() {

    override fun getItemCount(): Int = movies.size

    fun getItem(position: Int) : Movie = movies[position]

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        return DataViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.view_holder_movie,parent,false))
    }

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        holder.bind(getItem(position))
        holder.foundation.setOnClickListener {
            onClickListener.onClicked(holder.name.text)
        }
    }
}

class DataViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val foundation: ImageView = view.findViewById(R.id.imageView)
    private val photo: ImageView = view.findViewById(R.id.photo)
    private val age: TextView = view.findViewById(R.id.age)
    private val like: ImageView = view.findViewById(R.id.like)
    private val genre: TextView = view.findViewById(R.id.genre)
    private val star1: ImageView = view.findViewById(R.id.star1)
    private val star2: ImageView = view.findViewById(R.id.star2)
    private val star3: ImageView = view.findViewById(R.id.star3)
    private val star4: ImageView = view.findViewById(R.id.star4)
    private val star5: ImageView = view.findViewById(R.id.star5)
    private val reviews: TextView = view.findViewById(R.id.reviews)
    val name: TextView = view.findViewById(R.id.name)
    private val duration: TextView = view.findViewById(R.id.duration)

    fun bind(movie: Movie) {
        photo.setImageResource(movie.photo)
        age.text = movie.age
        like.visibility = if (movie.like) View.VISIBLE else View.GONE
        genre.text = movie.genre
        if (movie.star1) star1.setImageResource(R.drawable.ic_star_icon) //else star1.setImageResource(R.drawable.ic_star_icon_gray)
        if (movie.star2) star2.setImageResource(R.drawable.ic_star_icon) //else star1.setImageResource(R.drawable.ic_star_icon_gray)
        if (movie.star3) star3.setImageResource(R.drawable.ic_star_icon) //else star1.setImageResource(R.drawable.ic_star_icon_gray)
        if (movie.star4) star4.setImageResource(R.drawable.ic_star_icon) //else star1.setImageResource(R.drawable.ic_star_icon_gray)
        if (movie.star5) star5.setImageResource(R.drawable.ic_star_icon) //else star1.setImageResource(R.drawable.ic_star_icon_gray)
        reviews.text = movie.reviews
        name.text = movie.name
        duration.text = movie.duration
    }

}