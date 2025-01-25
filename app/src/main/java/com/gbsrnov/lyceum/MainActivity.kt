package com.gbsrnov.lyceum

 import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
 import androidx.fragment.app.Fragment
 import androidx.navigation.fragment.NavHostFragment
 import androidx.navigation.ui.NavigationUI
 import androidx.navigation.ui.setupWithNavController
 import com.gbsrnov.lyceum.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        initializeScaffold()
    }

    private fun initializeScaffold() {
        //initialize bottomNavbar: NavGraph + NavHostFragment (FragmentContainerView)
        val navHostFragment = supportFragmentManager.findFragmentById(
            R.id.nav_host_fragment
        ) as NavHostFragment
        val navController = navHostFragment.navController

        NavigationUI.setupWithNavController(binding.bottomNavigationView, navController)

        //additional topbar initialization goes here, if needed
    }
}

