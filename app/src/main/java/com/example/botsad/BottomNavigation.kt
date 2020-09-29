package com.example.botsad

import android.content.res.Configuration
import android.os.Bundle
import android.os.Handler
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.botsad.Fragments.EmptyFragment
import com.example.botsad.Fragments.LocationFragment
import com.example.botsad.Fragments.PlantsFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_bottom_navigation.*
import kotlinx.android.synthetic.main.nav_location.*

class BottomNavigation : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_navigation)
        bottom_navigation.setOnNavigationItemSelectedListener(navListener)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction().replace(R.id.fragment_container,
                LocationFragment()
            ).commit()
        }
        if (resources.configuration.orientation == Configuration.ORIENTATION_PORTRAIT){
            bottom_navigation.visibility = View.VISIBLE
        }
        if (resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE){
            bottom_navigation.visibility = View.GONE
        }
    }

    fun startDialog1(view: View){
        dialog_belochka.visibility = View.VISIBLE
        Handler().postDelayed(this::hide_dialog_1, 1000)
    }
    fun startDialog2(view: View){
        dialog_elochka.visibility = View.VISIBLE
        Handler().postDelayed(this::hide_dialog_2, 1000)
    }

    fun hide_dialog_1(){
        dialog_belochka.visibility=View.GONE
    }
    fun hide_dialog_2(){
        dialog_elochka.visibility=View.GONE
    }

    private val navListener: BottomNavigationView.OnNavigationItemSelectedListener =
        BottomNavigationView.OnNavigationItemSelectedListener { item ->
            var selectedFragment: Fragment? = null
            when (item.itemId) {
                R.id.location -> selectedFragment = LocationFragment()
                R.id.rectangles -> selectedFragment = PlantsFragment()
                R.id.circle -> selectedFragment = EmptyFragment()
                R.id.star -> selectedFragment = EmptyFragment()
                R.id.last_rectangle -> selectedFragment = EmptyFragment()
            }
            supportFragmentManager.beginTransaction().replace(R.id.fragment_container,
                selectedFragment!!).commit()
            true
        }
}
