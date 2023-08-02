package com.example.watsappslideviewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.watsappslideviewpager.adapters.ViewPagerAdapter
import com.example.watsappslideviewpager.databinding.ActivityMainBinding
import com.example.watsappslideviewpager.fragments.CallsFragment
import com.example.watsappslideviewpager.fragments.MessageFragment
import com.example.watsappslideviewpager.fragments.StatusFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(MessageFragment(), "First")
        adapter.addFragment(StatusFragment(), "Second")
        adapter.addFragment(CallsFragment(), "Third")
        binding.viewPager.adapter = adapter
        binding.tbLayout.setupWithViewPager(binding.viewPager)
    }
}