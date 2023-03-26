package com.example.tiimiprototype.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.tiimiprototype.fragments.RecruitmentFragment;
import com.example.tiimiprototype.fragments.WorkFragment;

public class InboxViewPagerAdapter extends FragmentStateAdapter {
    public InboxViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new RecruitmentFragment();
            case 1:
                return new WorkFragment();
            default:
                return new RecruitmentFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
