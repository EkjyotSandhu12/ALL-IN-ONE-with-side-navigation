package com.ejtdevelopment.allinonewithnav.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ejtdevelopment.allinonewithnav.Adapters.FragmentTabsAdapter;
import com.ejtdevelopment.allinonewithnav.R;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class TopTab extends Fragment {

    TabLayout tabLayout;
    ViewPager2 viewpager;


    public TopTab() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_top_tab, container, false);

        FragmentTabsAdapter adapter = new FragmentTabsAdapter(getChildFragmentManager(),getLifecycle());

        viewpager = view.findViewById(R.id.viewPager);

        viewpager.setAdapter(adapter);


        tabLayout = view.findViewById(R.id.tabLayout);

        tabLayout.getTabAt(0).setText("Fragment 1");
        tabLayout.getTabAt(1).setText("Fragment 2");

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewpager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewpager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                tabLayout.selectTab(tabLayout.getTabAt(position));
            }
        });


        return view;
    }
}