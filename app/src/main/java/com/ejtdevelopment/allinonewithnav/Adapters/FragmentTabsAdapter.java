package com.ejtdevelopment.allinonewithnav.Adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.ejtdevelopment.allinonewithnav.Fragments.EditText;
import com.ejtdevelopment.allinonewithnav.Fragments.TextViewFragment;

public class FragmentTabsAdapter extends FragmentStateAdapter {

    public FragmentTabsAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        switch (position){

            case 0: return new TextViewFragment();
            case 1: return new EditText();
        }
        return new TextViewFragment();
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
