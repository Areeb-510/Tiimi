package com.example.tiimiprototype.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.tiimiprototype.fragments.NotesFragment;
import com.example.tiimiprototype.fragments.RecruitmentFragment;
import com.example.tiimiprototype.fragments.TimelineViewFragment;
import com.example.tiimiprototype.fragments.WorkFragment;

public class TimelineAdapter extends FragmentStateAdapter {


    public TimelineAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new TimelineViewFragment();
            case 1:
                return new NotesFragment();
            default:
                return new TimelineViewFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
