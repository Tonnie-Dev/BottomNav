package com.androidshowtime

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            //set the toolbar as actionBar
       // setSupportActionBar(toolbar)



        bottomNavView.setOnItemSelectedListener { item ->

            when(item.itemId){

                R.id.kitchen_menu -> {
Toast.makeText(this, "Clicked", Toast.LENGTH_LONG).show()
                    toolbar.title = getString(R.string.kitchen_space)
                    findNavController(R.id.nav_host_fragment).navigate(R.id.kitchenSpace)
                    return@setOnItemSelectedListener true
                }

                R.id.meeting_menu -> {
                    Toast.makeText(this, "Clicked", Toast.LENGTH_LONG).show()
                    toolbar.title = getString(R.string.meeting_room)
                    findNavController(R.id.nav_host_fragment).navigate(R.id.meetingRoom)
                    return@setOnItemSelectedListener true
                }

                else -> {
                    toolbar.title = getString(R.string.work_space)
                    findNavController(R.id.nav_host_fragment).navigate(R.id.workSpace)
                    return@setOnItemSelectedListener true
                }
            }


        }
    }


}