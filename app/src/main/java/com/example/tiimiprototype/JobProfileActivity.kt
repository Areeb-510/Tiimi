package com.example.tiimiprototype

import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.ImageButton
import android.widget.TextView
import androidx.viewpager2.widget.ViewPager2
import com.example.tiimiprototype.adapters.JobProfilePagerAdapter
import com.google.android.material.tabs.TabLayout

class JobProfileActivity : AppCompatActivity() {

    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager2: ViewPager2

    private lateinit var recruit_name : TextView

    private lateinit var pageAdapter: JobProfilePagerAdapter


    private lateinit var backBtn : ImageButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_job_profile)


        tabLayout = findViewById(R.id.tab_layout_jobp)
        viewPager2 = findViewById(R.id.view_pager_jobp)

        val adapter = JobProfilePagerAdapter(supportFragmentManager,lifecycle)
        viewPager2.adapter = adapter


        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                viewPager2.currentItem = tab.position
            }

            override fun onTabUnselected(tab: TabLayout.Tab) {}
            override fun onTabReselected(tab: TabLayout.Tab) {}
        })

        backBtn = findViewById(R.id.back_btnn)

        backBtn.setOnClickListener {
            onBackPressed()
        }

        viewPager2.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                tabLayout.getTabAt(position)!!.select()
            }
        })


        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LOCKED);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
        getSupportActionBar()?.hide();



    }

    override fun onBackPressed() {
        super.onBackPressed()
    }
}