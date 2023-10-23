package com.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.viewpager.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding){
            viewPager.adapter = ViewPagerAdapter(supportFragmentManager)

            // Hubungkan ViewPager dengan TabLayout
            tabLayout.setupWithViewPager(viewPager)
        }

    }
}