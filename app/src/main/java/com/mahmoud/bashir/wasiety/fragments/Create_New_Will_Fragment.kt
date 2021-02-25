package com.mahmoud.bashir.wasiety.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.mahmoud.bashir.wasiety.R
import com.mahmoud.bashir.wasiety.databinding.FragmentCreateNewWillBinding


class Create_New_Will_Fragment : Fragment() {

    lateinit var createWillBinding:FragmentCreateNewWillBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        createWillBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_create__new__will, container, false)

        createWillBinding.signatureBtn.setOnClickListener {
            val action = Create_New_Will_FragmentDirections.actionCreateNewWillFragmentToSignaturePageFragment()
            findNavController().navigate(action)
        }
        createWillBinding.addDetailsBtn.setOnClickListener {
            val action = Create_New_Will_FragmentDirections.actionCreateNewWillFragmentToWillToWhoFragment2()
            findNavController().navigate(action)
        }
        createWillBinding.backBtn.setOnClickListener {
            findNavController().navigateUp()
        }

        return createWillBinding.root
    }

}