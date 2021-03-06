package com.example.whatsapp.Adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.whatsapp.Fragment.Chats;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    private final List<Fragment> fragmentList = new ArrayList<>();
    private final List<String> fragmentListTitles = new ArrayList<>();
    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int position) {

        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();

    }


    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentListTitles.get(position);

    }
    public  void addfragment(Fragment fragment, String title){
        fragmentList.add(fragment);
        fragmentListTitles.add(title);


    }

}
