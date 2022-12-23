package com.samiun.navgivationscrach

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_profile.*
import kotlinx.android.synthetic.main.fragment_profile.view.*

class ProfileFragment : Fragment() {
    val args: ProfileFragmentArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textView_number.text = args.number.toString()

        button_home_profile.setOnClickListener {
            val action = ProfileFragmentDirections.actionProfileFragmentToHomeFragment()
            findNavController().navigate(action)
        }

        button_about_profile.setOnClickListener {
            val trainee = Trainee("Samiun Rahman", "Sizan",30036)
            val action = ProfileFragmentDirections.actionProfileFragmentToAboutFragment(trainee)
            findNavController().navigate(action)
        }



        button_about_profile.setOnClickListener {
            val trainee = Trainee("Samiun Rahman", "Sizan",30036)
            val action = ProfileFragmentDirections.actionProfileFragmentToAboutFragment(trainee)
            findNavController().navigate(action)
        }

    }
}