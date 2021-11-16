package com.ejtdevelopment.allinonewithnav.Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.ejtdevelopment.allinonewithnav.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import java.util.ArrayList;


public class BottomTab extends Fragment {

    ViewPager2 viewpager;
    BottomNavigationView nav;

    public BottomTab() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_bottom_tab, container, false);


        nav = view.findViewById(R.id.bottomNav);
        getChildFragmentManager().beginTransaction().replace(R.id.bottomFragLayout,new Chips()).commit();
        nav.setSelectedItemId(R.id.firstFragment);

        nav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                Fragment fragment;

                switch (item.getItemId()) {
                    case R.id.firstFragment: fragment = new Chips();

                        break;

                    case R.id.secondFragment: fragment = new ProgressBar();
                        break;

                    default: fragment = new ToggleAndSwitch();
                        break;
                }

                getChildFragmentManager().beginTransaction().replace(R.id.bottomFragLayout,fragment).commit();

                return true;
            }
        });

        return view;
    }
}