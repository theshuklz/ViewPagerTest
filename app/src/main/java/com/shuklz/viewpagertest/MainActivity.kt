package com.shuklz.viewpagertest

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupTopTabLayout()
        pager.adapter = ViewPagerAdapter(supportFragmentManager)
        setupBottomTabLayout()
    }

    private fun setupBottomTabLayout() {
        bottomTabLayout.addTab(bottomTabLayout.newTab().setText("Bottom 1"))
        bottomTabLayout.addTab(bottomTabLayout.newTab().setText("Bottom 2"))
        bottomTabLayout.addTab(bottomTabLayout.newTab().setText("Bottom 3"))
        bottomTabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabReselected(tab: TabLayout.Tab?) {}

            override fun onTabUnselected(tab: TabLayout.Tab?) {}

            override fun onTabSelected(tab: TabLayout.Tab?) {
                pager.setCurrentItem(tab!!.position)
                Toast.makeText(this@MainActivity, tab?.text.toString(), Toast.LENGTH_SHORT).show()
            }

        })
    }

    private fun setupTopTabLayout() {
        topTabLayout.setupWithViewPager(pager)
        topTabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabReselected(tab: TabLayout.Tab?) {}

            override fun onTabUnselected(tab: TabLayout.Tab?) {}

            override fun onTabSelected(tab: TabLayout.Tab?) {
                Toast.makeText(this@MainActivity, tab?.text.toString(), Toast.LENGTH_SHORT).show()
            }

        })
    }
}
