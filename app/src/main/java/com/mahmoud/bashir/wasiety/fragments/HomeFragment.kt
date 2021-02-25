package com.mahmoud.bashir.wasiety.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RelativeLayout
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.navigation.NavigationView
import com.mahmoud.bashir.wasiety.R


class HomeFragment : Fragment() ,NavigationView.OnNavigationItemSelectedListener{

    lateinit var rel_show_drawer:RelativeLayout
    lateinit var drawer_main:DrawerLayout
    lateinit var navView:NavigationView
    lateinit var floatingActionButton:FloatingActionButton
    lateinit var to_create_will_btn:Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v =  inflater.inflate(R.layout.drawer_home_layout, container, false)

        rel_show_drawer = v.findViewById(R.id.rel_show_drawer)
        drawer_main = v.findViewById(R.id.drawer_main)
        navView = v.findViewById(R.id.navigation_View)
        floatingActionButton = v.findViewById(R.id.floatingActionButton)
        to_create_will_btn = v.findViewById(R.id.to_create_will_btn)

        navView.setNavigationItemSelectedListener(this)

        to_create_will_btn.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToCreateNewWillFragment()
            findNavController().navigate(action)
        }
        floatingActionButton.setOnClickListener {
            val action  = HomeFragmentDirections.actionHomeFragmentToChatsFragment()
            findNavController().navigate(action)
        }
        rel_show_drawer.setOnClickListener {
            drawer_main.open()
        }

        return v;
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        when(item.itemId){

            R.id.profileFragment ->{
                val action = HomeFragmentDirections.actionHomeFragmentToProfileFragment()
                findNavController().navigate(action)
                drawer_main.close()
            }
            R.id.chatsFragment ->{
                val action = HomeFragmentDirections.actionHomeFragmentToChatsFragment()
                findNavController().navigate(action)
                drawer_main.close()
            }
            R.id.create_New_Will_Fragment ->{
                val action = HomeFragmentDirections.actionHomeFragmentToCreateNewWillFragment()
                findNavController().navigate(action)
                drawer_main.close()
            }
            R.id.myWill_Fragment ->{
                /*val action = HomeFragmentDirections.actionHomeFragmentToMyWillFragment()
                findNavController().navigate(action)*/
                drawer_main.close()
            }
            R.id.contact_us ->{
                val action = HomeFragmentDirections.actionHomeFragmentToAboutUsFragment()
                findNavController().navigate(action)
                drawer_main.close()
            }
            R.id.about_Us_Fragment -> {
                drawer_main.close()
            }
            else ->{
                /*val action = HomeFragmentDirections.actionHomeFragmentSelf()
                findNavController().navigate(action)*/
                drawer_main.close()
            }
        }
        return true
    }
}