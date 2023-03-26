package com.example.tiimiprototype.adapters

import android.text.format.Time
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.tiimiprototype.fragments.*

class JobProfilePagerAdapter(fm: FragmentManager, lifecycle: Lifecycle) : FragmentStateAdapter(fm,lifecycle)  {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        when(position) {
            0 -> {
                return CandidateJobFragment()
            }
            1 -> {
                return JobDetailsFragment()
            }
            2 -> {
                return TimelineFragment()
            }
            else -> {
                return CandidateJobFragment()
            }
        }
    }
}