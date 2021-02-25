package com.mahmoud.bashir.wasiety.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.mahmoud.bashir.wasiety.R
import com.mahmoud.bashir.wasiety.databinding.FragmentSignaturePageBinding


class Signature_Page_Fragment : Fragment() {

    lateinit var signatureBinding:FragmentSignaturePageBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        signatureBinding =  DataBindingUtil.inflate(inflater, R.layout.fragment_signature__page_, container, false)
        signatureBinding.backBtn.setOnClickListener {
            findNavController().navigateUp()
        }

        return signatureBinding.root
    }
}