package com.necatican.loginpage.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.necatican.loginpage.R
import com.necatican.loginpage.base.BaseFragment
import com.necatican.loginpage.databinding.FragmentLoginBinding
import kotlinx.android.synthetic.main.fragment_main_page.view.*

class  MainPageFragment : BaseFragment<FragmentLoginBinding>(FragmentLoginBinding::inflate){

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_main_page, container, false)

        view.music.setOnClickListener { Navigation.findNavController(view).navigate(R.id.navigateToMusicPage)}
        view.publishing.setOnClickListener {Navigation.findNavController(view).navigate(R.id.navigateToPublishingPage)}
        view.movies.setOnClickListener {Navigation.findNavController(view).navigate(R.id.navigateToMoviesPage)}
        view.collectibles.setOnClickListener {Navigation.findNavController(view).navigate(R.id.navigateToCollectiblesPage)}

        return view

    }

}
