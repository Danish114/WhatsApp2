package com.example.whatsapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.whatsapp.Adapter.ViewPagerAdapter;
import com.example.whatsapp.Fragment.Calls;
import com.example.whatsapp.Fragment.Chats;
import com.example.whatsapp.Fragment.Status;
import com.example.whatsapp.R;
import com.google.android.material.tabs.TabLayout;

public class TabLayoutActivity extends AppCompatActivity {
    TabLayout tool1;

    ViewPager viewPager;
    private Object ViewPagerAdapter;
    private Object Calls;
    private Object Chats;
    private Object Status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout);
        tool1 = (TabLayout) findViewById(R.id.tab1);
        viewPager = (ViewPager) findViewById(R.id.viwPge);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter((PagerAdapter) ViewPagerAdapter);


        adapter.addfragment(new Chats(), "CHATS");
        adapter.addfragment(new Status(), "STATUS");
        adapter.addfragment(new Calls(), "CALLS");
        viewPager.setAdapter(adapter);
        tool1.setupWithViewPager(viewPager);
    }

}
