package com.example.bottom_navigation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    lateinit var  nameEditText : EditText
    lateinit var ageEditText : EditText
    lateinit var nextButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        init()
        listeners()


        val bottomnavigationview = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        val navController = findNavController(R.id.fragmentContainerView)
        val appBarConfiguration =
            AppBarConfiguration(setOf(R.id.firstfragment, R.id.fragment2, R.id.thirdfragment))
        setupActionBarWithNavController(navController, appBarConfiguration)

        bottomnavigationview.setupWithNavController(navController)
    }
    private fun init() {
        nameEditText = findViewById(R.id.nameEditText)
        ageEditText = findViewById(R.id.ageEditText)
        nextButton = findViewById(R.id.nextButton)
    }
    private fun listeners(){
        nextButton.setOnClickListener {
            val name = nameEditText.text.toString()
            val age = ageEditText.text.toString().toInt()

            val intent = Intent(this, main_2::class.java)
            intent.putExtra("NAME", name)
            intent.putExtra("AGE", age)

            startActivity(intent)
        }


    }
}