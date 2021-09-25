package com.taushkanov.applicationall

import android.content.Context
import android.media.Image
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast


class FragmentMoviesList : Fragment() {
    private var fragmentClickListener: FragmentClickListener? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_movies_list, container, false)

        view?.findViewById<ImageView>(R.id.imageView)?.apply {
            setOnClickListener {
                fragmentClickListener?.onChangeButtonClicked()
            }
        }

        return view
    }

    override fun onDetach() {
        super.onDetach()
        fragmentClickListener = null
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is FragmentClickListener) {
            fragmentClickListener = context
        }
    }

    companion object {
        fun newInstance2(academy: String): FragmentMoviesList {
            val args = Bundle()
            args.putString("android", academy)
            val fragment = FragmentMoviesList()
            fragment.arguments = args
            return fragment
        }
    }

}
