package com.example.tiimiprototype.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.tiimiprototype.R
import com.example.tiimiprototype.adapters.InboxViewPagerAdapter
import com.example.tiimiprototype.adapters.JobPageAdapter
import com.google.android.material.tabs.TabLayout


class JobsFragment : Fragment() {

    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager2: ViewPager2

    private lateinit var jobViewPagerAdapter: JobPageAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_jobs, container, false)


        if (view != null) {
            tabLayout = view.findViewById(R.id.tab_layout_job)
        }
        if (view != null) {
            viewPager2 = view.findViewById(R.id.view_pager_job)
        }

        jobViewPagerAdapter = activity?.let { JobPageAdapter(it) }!!

        viewPager2.adapter = jobViewPagerAdapter

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



        return view
    }

}