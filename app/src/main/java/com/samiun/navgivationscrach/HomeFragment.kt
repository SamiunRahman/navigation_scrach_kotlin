package com.samiun.navgivationscrach

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_home.*
import com.samiun.navgivationscrach.MainActivity
import kotlinx.android.synthetic.main.activity_main.*


class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button_profile_home.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToProfileFragment(30036)
            findNavController().navigate(action)
        }

        button_about_home.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_aboutFragment)
        }


    }
}