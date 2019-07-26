package com.stuffshuf.practice_fragments


import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.fragment_vegetables.*
import kotlinx.android.synthetic.main.fragment_vegetables.view.*


/**
 * A simple [Fragment] subclass.
 *
 */
class VegetablesFragment : Fragment() {

    val vegetables= arrayOf(
        "Potato","Onion", "Tomato", "Lettuce", "Carrot", "Capsicum",
        "Group", "Pumpkin","Radish"
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val fragmentView=inflater.inflate(R.layout.fragment_vegetables, container, false)
        fragmentView.lvVeg.adapter=ArrayAdapter<String>(requireContext(), android.R.layout.simple_list_item_1, android.R.id.text1, vegetables     )


        return fragmentView
    }


}
