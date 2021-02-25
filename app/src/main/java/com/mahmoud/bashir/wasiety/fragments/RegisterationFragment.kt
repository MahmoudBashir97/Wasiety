package com.mahmoud.bashir.wasiety.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.mahmoud.bashir.wasiety.R
import com.mahmoud.bashir.wasiety.databinding.FragmentRegisterationBinding


class RegisterationFragment : Fragment() {
    lateinit var Registerbinding:FragmentRegisterationBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        Registerbinding=DataBindingUtil.inflate(inflater,
            R.layout.fragment_registeration, container, false)

        Registerbinding.registerRadioGroup.check(R.id.radio_login)
        Registerbinding.registerRadioGroup.setOnCheckedChangeListener { group, checkedId ->
            if (checkedId == R.id.radio_login){

                Registerbinding.relLoginForm.visibility = View.VISIBLE
                Registerbinding.relRegisterForm.visibility = View.GONE

                Registerbinding.radioLogin.setOnClickListener{
                    val action  = RegisterationFragmentDirections.actionRegisterationFragmentToHomeFragment()
                    findNavController().navigate(action)
                }

            }else if (checkedId == R.id.radio_signup){
                Registerbinding.relLoginForm.visibility = View.GONE
                Registerbinding.relRegisterForm.visibility = View.VISIBLE
            }
        }



        return Registerbinding.root
    }

}