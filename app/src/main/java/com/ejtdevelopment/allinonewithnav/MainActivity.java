package com.ejtdevelopment.allinonewithnav;


import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.transition.Slide;
import android.view.Gravity;
import android.view.MenuItem;
import android.widget.Toast;

import com.ejtdevelopment.allinonewithnav.Fragments.BottomTab;
import com.ejtdevelopment.allinonewithnav.Fragments.ButtonView;
import com.ejtdevelopment.allinonewithnav.Fragments.CheckBox;
import com.ejtdevelopment.allinonewithnav.Fragments.Chips;
import com.ejtdevelopment.allinonewithnav.Fragments.EditText;
import com.ejtdevelopment.allinonewithnav.Fragments.ImageButton;
import com.ejtdevelopment.allinonewithnav.Fragments.ProgressBar;
import com.ejtdevelopment.allinonewithnav.Fragments.RecycleView;
import com.ejtdevelopment.allinonewithnav.Fragments.TextViewFragment;
import com.ejtdevelopment.allinonewithnav.Fragments.ToggleAndSwitch;
import com.ejtdevelopment.allinonewithnav.Fragments.TopTab;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    NavigationView nav;
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle toggle;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentLayout, new TextViewFragment()).commit();

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        nav = findViewById(R.id.navigation);
        drawerLayout= findViewById(R.id.drawer);

        toggle  = new ActionBarDrawerToggle(this ,drawerLayout,toolbar,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.setDrawerIndicatorEnabled(true);
        toggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        nav.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                Fragment fragment;
                switch (item.getItemId()){
                    case R.id.textviewmenu:
                        fragment = new TextViewFragment();
                        break;
                    case R.id.edittextmenu:
                        fragment = new EditText();
                        break;
                    case R.id.buttonviewmenu:
                        fragment = new ButtonView();
                        break;
                    case R.id.chipsmenu:
                        fragment = new Chips();
                        break;
                    case R.id.checkboxmenu:
                        fragment = new CheckBox();
                        break;
                    case R.id.imagebuttonmenu:
                        fragment = new ImageButton();
                        break;
                    case R.id.progressbarmenu:
                        fragment = new ProgressBar();
                        break;
                    case R.id.toggleandswitchmenu:
                        fragment = new ToggleAndSwitch();
                        break;
                    case R.id.recycleviewmenu:
                        fragment = new RecycleView();
                        break;
                    case R.id.bottomtabmenu:
                        fragment = new BottomTab();
                        break;
                    case R.id.toptabmenu:
                        fragment = new TopTab();
                        break;

                    default:fragment = new TextViewFragment();
                }
                drawerLayout.closeDrawer(GravityCompat.START);
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentLayout, fragment).commit();
                return true;
            }
        });
    }
}