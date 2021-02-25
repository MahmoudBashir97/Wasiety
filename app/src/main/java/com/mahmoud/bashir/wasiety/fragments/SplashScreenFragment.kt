package com.mahmoud.bashir.wasiety.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AccelerateInterpolator
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.view.animation.TranslateAnimation
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.mahmoud.bashir.wasiety.R

class SplashScreenFragment : Fragment() {

    lateinit var txt_start_btn:TextView
    lateinit var txt_title:TextView
    lateinit var txtSubtitle:TextView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v= inflater.inflate(R.layout.fragment_splash_screen, container, false)
        //init view
        txt_title = v.findViewById(R.id.txt_title)
        txtSubtitle = v.findViewById(R.id.txtSubtitle)
        txt_start_btn = v.findViewById(R.id.txt_start_btn)

        val a: Animation = AnimationUtils.loadAnimation(context, R.anim.txt_anim)
        txt_title.animation = a

        txtSubtitle.startAnimation(inFromLeftAnimation())
        txt_start_btn.startAnimation(inFromLeftAnimation())
        txt_start_btn.setOnClickListener {
            val action  = SplashScreenFragmentDirections.actionSplashScreenFragmentToRegisterationFragment()
            findNavController().navigate(action)
        }

        return v
    }

    private fun inFromRightAnimation(): Animation? {
        val inFromRight: Animation = TranslateAnimation(
            Animation.RELATIVE_TO_PARENT, +1.0f,
            Animation.RELATIVE_TO_PARENT, 0.0f,
            Animation.RELATIVE_TO_PARENT, 0.0f,
            Animation.RELATIVE_TO_PARENT, 0.0f
        )
        inFromRight.duration = 1500
        inFromRight.interpolator = AccelerateInterpolator()
        return inFromRight
    }


    private fun outToLeftAnimation(): Animation? {
        val outtoLeft: Animation = TranslateAnimation(
            Animation.RELATIVE_TO_PARENT, 0.0f,
            Animation.RELATIVE_TO_PARENT, -1.0f,
            Animation.RELATIVE_TO_PARENT, 0.0f,
            Animation.RELATIVE_TO_PARENT, 0.0f
        )
        outtoLeft.duration = 1500
        outtoLeft.interpolator = AccelerateInterpolator()
        return outtoLeft
    }

    private fun inFromLeftAnimation(): Animation? {
        val inFromLeft: Animation = TranslateAnimation(
            Animation.RELATIVE_TO_PARENT, -1.0f,
            Animation.RELATIVE_TO_PARENT, 0.0f,
            Animation.RELATIVE_TO_PARENT, 0.0f,
            Animation.RELATIVE_TO_PARENT, 0.0f
        )
        inFromLeft.duration = 1500
        inFromLeft.interpolator = AccelerateInterpolator()
        return inFromLeft
    }


    private fun outToRightAnimation(): Animation? {
        val outtoRight: Animation = TranslateAnimation(
            Animation.RELATIVE_TO_PARENT, 0.0f,
            Animation.RELATIVE_TO_PARENT, +1.0f,
            Animation.RELATIVE_TO_PARENT, 0.0f,
            Animation.RELATIVE_TO_PARENT, 0.0f
        )
        outtoRight.duration = 1500
        outtoRight.interpolator = AccelerateInterpolator()
        return outtoRight
    }

}