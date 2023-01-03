package com.necatican.loginpage.ui.main.publishing

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.necatican.loginpage.R
import kotlinx.android.synthetic.main.fragment_publishing_page.view.*

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class publishingNewspapersFragment : Fragment() {

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

        val view = inflater.inflate(R.layout.fragment_publishing_newspapers, container, false)

        view.publishing_books_magazines.setOnClickListener { Navigation.findNavController(view).navigate(R.id.navigateToPublishingBooksMagazinesPage)}
        view.publishing_comics.setOnClickListener { Navigation.findNavController(view).navigate(R.id.navigateToPublishingComicPage)}
        view.publishing_autographs.setOnClickListener { Navigation.findNavController(view).navigate(R.id.navigateToPublishingAutographsPage)}

        return view
    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            publishingNewspapersFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}