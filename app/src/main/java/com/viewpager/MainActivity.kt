package com.viewpager

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    private var viewPagerAdapter: ViewPagerAdapter? = null
    private lateinit var viewPager: ViewPager
    private lateinit var tabLayout: TabLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewPager = findViewById(R.id.viewpager)

        // setting up the adapter
        viewPagerAdapter = ViewPagerAdapter(supportFragmentManager)

        // add the fragments
        viewPagerAdapter!!.add(Page1(), "Page 1")
        viewPagerAdapter!!.add(Page2(), "Page 2")
        viewPagerAdapter!!.add(Page3(), "Page 3")

        // Set the adapter
        viewPager.adapter = viewPagerAdapter

        // The Page (fragment) titles will be displayed in the
        // tabLayout hence we need to set the page viewer
        // we use the setupWithViewPager().
        tabLayout = findViewById(R.id.tab_layout)
        tabLayout.setupWithViewPager(viewPager)
    }
}
