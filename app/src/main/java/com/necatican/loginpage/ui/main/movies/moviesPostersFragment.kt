package com.necatican.loginpage.ui.main.movies

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.necatican.loginpage.R
import kotlinx.android.synthetic.main.fragment_movies_page.view.*

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class moviesPostersFragment : Fragment() {

    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_movies_posters, container, false)

        view.movies_series.setOnClickListener { Navigation.findNavController(view).navigate(R.id.navigateToMoviesSeriesPage)}
        view.movies_film_reels.setOnClickListener { Navigation.findNavController(view).navigate(R.id.navigateToMoviesFilmReelsPage)}
        view.movies_autographs.setOnClickListener { Navigation.findNavController(view).navigate(R.id.navigateToMoviesAutographsPage)}

        return view

    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            moviesPostersFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}