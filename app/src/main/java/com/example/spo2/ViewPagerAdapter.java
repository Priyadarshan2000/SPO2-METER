package com.example.spo2;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import org.jetbrains.annotations.NotNull;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    public ViewPagerAdapter(@NonNull @NotNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @NotNull
    @Override
    public Fragment getItem(int position) {

        switch(position) {
            case 0: return new Fragmentone();
            case 1: return new FragmentTwo();
            case 2: return new FragmentThree();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
