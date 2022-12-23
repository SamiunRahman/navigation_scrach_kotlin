package com.samiun.navgivationscrach

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationMenuView
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController
    private lateinit var bottomMenu: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navHostFragment  = supportFragmentManager.findFragmentById(R.id.fragment_container_view) as NavHostFragment

        navController = navHostFragment.findNavController()


        val appBarConfiguration = AppBarConfiguration(setOf(R.id.home_menu, R.id.about_menu, R.id.profile_menu))
        setupActionBarWithNavController(navController,appBarConfiguration)

        bottomMenu = findViewById(R.id.nav_menu)

        bottomMenu.setupWithNavController(navController)
        bottomMenu.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.home_menu -> {
                    Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show()
                    navController.navigate(R.id.homeFragment)
                    true
                }
                R.id.profile_menu -> {
                    Toast.makeText(this, "Dashboard", Toast.LENGTH_SHORT).show()
                    navController.navigate(R.id.aboutFragment)

                    true
                }
                else -> {
                    Toast.makeText(this, "Notifications", Toast.LENGTH_SHORT).show()
                    navController.navigate(R.id.profileFragment)

                    true
                }
            }
        }
    }




    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }




}