package com.example.tiimiprototype.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.tiimiprototype.R
import com.example.tiimiprototype.adapters.CandidateJobAdapter
import com.example.tiimiprototype.adapters.InboxViewPagerAdapter
import com.google.android.material.tabs.TabLayout


class CandidateJobFragment : Fragment() {


    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager2: ViewPager2


    private lateinit var candidateJobAdapter: CandidateJobAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_candidate_job, container, false)

        if (view != null) {
            tabLayout = view.findViewById(R.id.tb)
        }
        if (view != null) {
            viewPager2 = view.findViewById(R.id.vp)
        }

        candidateJobAdapter = activity?.let { CandidateJobAdapter(it) }!!

        viewPager2.adapter = candidateJobAdapter

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