package com.taushkanov.applicationall

import android.content.Context
import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity

class MainActivity : AppCompatActivity(), FragmentClickListener {

    private var fragmentMoviesList : FragmentMoviesList? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            fragmentMoviesList = FragmentMoviesList.newInstance2("lskndf")
            fragmentMoviesList?.apply {
                supportFragmentManager.beginTransaction()
                    .add(R.id.main_container, FragmentMoviesList())
                    .commit()
            }
        }
        else {
            fragmentMoviesList = supportFragmentManager.findFragmentByTag(FRAGMENT_TAG_1) as? FragmentMoviesList
        }
    }

    override fun onChangeButtonClicked() {
        supportFragmentManager.beginTransaction()
            .add(R.id.main_container, FragmentMoviesDetails.newInstance("123"))
            .addToBackStack(null)
            .commit()
    }

    companion object {
        const val FRAGMENT_TAG_1 = "Fragment"
    }

}