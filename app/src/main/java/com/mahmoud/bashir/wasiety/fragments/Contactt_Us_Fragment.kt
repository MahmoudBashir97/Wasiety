package com.mahmoud.bashir.wasiety.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.mahmoud.bashir.wasiety.R
import com.mahmoud.bashir.wasiety.databinding.FragmentContactUsBinding


class Contactt_Us_Fragment : Fragment() {
    lateinit var contactBinding:FragmentContactUsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        contactBinding =  DataBindingUtil.inflate(inflater, R.layout.fragment_contact__us, container, false)

        contactBinding.backBtn.setOnClickListener {
            findNavController().navigateUp()
        }
        return contactBinding.root
    }

}