package com.example.naviatgortest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavView = findViewById<BottomNavigationView>(R.id.dablitaNavigationView)

        val  navHostFragment = findNavController(R.id.Nav_Fragment)

        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.homeFragment,
                R.id.fragmentTiktaktoe,
                R.id.calculatorFragment,
                R.id.fragmentNikoloz
            )
        )

        setupActionBarWithNavController(navHostFragment, appBarConfiguration)
        bottomNavView.setupWithNavController(navHostFragment)

    }
}