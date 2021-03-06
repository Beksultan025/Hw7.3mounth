package com.example.hw73mounth.Adapters;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hw73mounth.Model_table;
import com.example.hw73mounth.R;
import com.example.hw73mounth.databinding.FragmentThirdBinding;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;

public class ThirdFragment extends Fragment {

    private FragmentThirdBinding binding;
    private AdapterforTable adapter;
    private ArrayList<Model_table> fragments;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentThirdBinding.inflate(LayoutInflater.from(requireContext()), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        fragments = new ArrayList<>();
        fragments.add(new Model_table(R.drawable.table_one , new FirstFragment()));
        fragments.add(new Model_table(R.drawable.table_two , new TwoFragment()));
        adapter = new AdapterforTable(this);
        adapter.setFragments(fragments);
        binding.ViewPager.setAdapter(adapter);
        new TabLayoutMediator(binding.TabLayout, binding.ViewPager, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                tab.setIcon(fragments.get(position).getImage());
            }
        }).attach();

    }
}