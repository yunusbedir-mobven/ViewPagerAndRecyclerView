package com.example.viewpagerandrecyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.viewpagerandrecyclerview.databinding.ActivityMainBinding
import com.example.viewpagerandrecyclerview.ui.ViewPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val viewPagerAdapter = ViewPagerAdapter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupViews()
    }

    private fun setupViews() {
        with(binding) {
            viewPager.adapter = viewPagerAdapter
            TabLayoutMediator(tabLayout, viewPager) { tab, position ->
                tab.text = viewPagerAdapter.getTitle(position)
                tab.icon = viewPagerAdapter.getIcon(position)
            }.attach()
        }
    }

}