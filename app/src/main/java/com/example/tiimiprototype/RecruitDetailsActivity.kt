package com.example.tiimiprototype

import PageAdapter
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.tiimiprototype.adapters.InboxViewPagerAdapter
import com.google.android.material.tabs.TabLayout

class RecruitDetailsActivity : AppCompatActivity() {


    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager2: ViewPager2

    private lateinit var recruit_name : TextView

    private lateinit var pageAdapter: PageAdapter

    private lateinit var backBtn : ImageView


    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        // Your code here
        // For example, you can finish the current activity
        finish()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recruit_details)


        tabLayout = findViewById(R.id.tb)
        viewPager2 = findViewById(R.id.vp)

        val adapter = PageAdapter(supportFragmentManager,lifecycle)
        viewPager2.adapter = adapter

        backBtn = findViewById(R.id.back_btn)

        backBtn.setOnClickListener {
            onBackPressed()
        }


        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                viewPager2.currentItem = tab.position
            }

            override fun onTabUnselected(tab: TabLayout.Tab) {}
            override fun onTabReselected(tab: TabLayout.Tab) {}
        })

        viewPager2.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                tabLayout.getTabAt(position)!!.select()
            }
        })



        val extras = intent.extras

        val name = extras?.getString("recruit_name")

        recruit_name = findViewById(R.id.name_recruit)

        recruit_name.text = name


    }


}