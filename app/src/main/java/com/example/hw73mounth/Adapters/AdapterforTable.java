package com.example.hw73mounth.Adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.hw73mounth.Model_table;

import java.util.ArrayList;

public class AdapterforTable extends FragmentStateAdapter {

    private ArrayList<Model_table> data;

    public AdapterforTable(@NonNull Fragment fragment) {
        super(fragment);
    }

    public void setFragments(ArrayList<Model_table> fragments) {
        this.data = new ArrayList<>();
        this.data.addAll(fragments);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return data.get(position).getFragment();
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
