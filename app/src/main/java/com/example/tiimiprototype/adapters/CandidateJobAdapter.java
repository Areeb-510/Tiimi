package com.example.tiimiprototype.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.tiimiprototype.fragments.RecruitmentFragment;
import com.example.tiimiprototype.fragments.WorkFragment;

public class CandidateJobAdapter extends FragmentStateAdapter {

    public CandidateJobAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new TableViewFragment();
            case 1:
                return new PipeLineViewFragment();
            default:
                return new TableViewFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
