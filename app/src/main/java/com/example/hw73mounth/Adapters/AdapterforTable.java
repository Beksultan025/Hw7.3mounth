package com.example.hw73mounth.Adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;

public class AdapterforTable extends FragmentStateAdapter {

    private ArrayList<ModelTableLayout> fragments;

    public AdapterforTable(@NonNull Fragment fragment) {
        super(fragment);
    }

    public void setData(ArrayList<ModelTableLayout> fragments) {
        this.fragments = new ArrayList<>();
        this.fragments.addAll(fragments);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return fragments.get(position).getFragment();
    }

    @Override
    public int getItemCount() {
        return fragments.size();
    }
}
