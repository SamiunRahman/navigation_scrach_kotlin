package com.samiun.navgivationscrach

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_about.*
import kotlinx.android.synthetic.main.fragment_profile.*


class AboutFragment : Fragment() {
    val geArgs: AboutFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_about, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val getTrainee = geArgs.trainee
        Log.v("About Fragment","${getTrainee?.fistName}\n" +
                "${getTrainee?.lastName}\n" +
                "ID: ${getTrainee?.id}")


        textView_employee.text = "${getTrainee?.fistName}\n${getTrainee?.lastName}\nID: ${getTrainee?.id}"


        button_home_about.setOnClickListener {
            val action = AboutFragmentDirections.actionAboutFragmentToHomeFragment()
            findNavController().navigate(action)
        }

        button_profile_about.setOnClickListener {
            val action = AboutFragmentDirections.actionAboutFragmentToHomeFragment()
            findNavController().navigate(action)
        }

    }
}