package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.example.bottom_navigation.R
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class main_3 : AppCompatActivity() {

    private lateinit var adapter: RecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_3)

        val viewPager = findViewById<ViewPager2>(R.id.myViewPager)
        val tabBar = findViewById<TabLayout>(R.id.tabBar)

        var viewPagerAdapter = ViewPagerAdapter()
        viewPager.adapter = viewPagerAdapter

        TabLayoutMediator(tabBar, viewPager){ tab, position ->
            tab.text = "bar ${position + 1}"
        }.attach()
    }
}

class RecyclerAdapter {

}
