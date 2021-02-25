package com.mahmoud.bashir.wasiety.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.mahmoud.bashir.wasiety.R
import com.mahmoud.bashir.wasiety.databinding.FragmentChatsBinding

class ChatsFragment : Fragment() {

    lateinit var chatsBinding:FragmentChatsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        chatsBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_chats, container, false)

        chatsBinding.backBtn.setOnClickListener {
            findNavController().navigateUp()
        }

        return chatsBinding.root
    }


}