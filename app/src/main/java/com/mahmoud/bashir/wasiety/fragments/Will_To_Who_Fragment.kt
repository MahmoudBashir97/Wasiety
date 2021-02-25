package com.mahmoud.bashir.wasiety.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.mahmoud.bashir.wasiety.R
import com.mahmoud.bashir.wasiety.databinding.FragmentWillToWhoBinding


class Will_To_Who_Fragment : Fragment() {

    lateinit var towhoBinding:FragmentWillToWhoBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        towhoBinding  =  DataBindingUtil.inflate(inflater, R.layout.fragment_will__to__who_, container, false)

        towhoBinding.backBtn.setOnClickListener {
            findNavController().navigateUp()
        }
        return towhoBinding.root
    }
}