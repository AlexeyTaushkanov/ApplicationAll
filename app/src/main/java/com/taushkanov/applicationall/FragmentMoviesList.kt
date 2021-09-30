package com.taushkanov.applicationall

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.taushkanov.applicationall.domain.MoviesDataSource


class FragmentMoviesList : Fragment() {

    private var fragmentClickListener: FragmentClickListener? = null
    private lateinit var adapter: MoviesAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_movies_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val recycler: RecyclerView = view.findViewById(R.id.rv_movie)
        val movies = MoviesDataSource().getMovies()
        adapter = MoviesAdapter(movies, object : MyOnClickListener{
            override fun onClicked(name: CharSequence) {
                val name = name.toString()
                if (name == "Avengers: End Game") {
                    fragmentClickListener?.onChangeButtonClicked()
                }
                    else Toast.makeText(context,"$name",Toast.LENGTH_SHORT).show()
            }

        })
        recycler.adapter = adapter
        recycler.layoutManager = StaggeredGridLayoutManager(2,1)
    }

    companion object {
        fun newInstance2(): FragmentMoviesList {
            return FragmentMoviesList()
        }
    }
}
