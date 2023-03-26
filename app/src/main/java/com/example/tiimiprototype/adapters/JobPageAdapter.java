package com.example.tiimiprototype.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.tiimiprototype.fragments.ActiveFragment;
import com.example.tiimiprototype.fragments.InactiveFragment;
import com.example.tiimiprototype.fragments.RecruitmentFragment;
import com.example.tiimiprototype.fragments.WorkFragment;

public class JobPageAdapter extends FragmentStateAdapter {

    public JobPageAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new ActiveFragment();
            case 1:
                return new InactiveFragment();
            default:
                return new ActiveFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
