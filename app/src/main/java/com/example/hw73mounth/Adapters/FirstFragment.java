package com.example.hw73mounth.Adapters;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hw73mounth.Model_fragments;
import com.example.hw73mounth.R;
import com.example.hw73mounth.databinding.FragmentFirstBinding;

import java.util.ArrayList;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;
    private ArrayList<Model_fragments> data;
    private Adapters adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFirstBinding.inflate(LayoutInflater.from(requireContext()), container ,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        adapter = new Adapters(data);
        binding.recyclerFirst.setAdapter(adapter);
    }

    private void loadData() {
        data = new ArrayList<>();
        data.add(new Model_fragments(R.drawable.foto_for_fragments , R.drawable.foto_for_fragments2 , R.drawable.foto_for_fragments3));
        data.add(new Model_fragments(R.drawable.foto_for_fragments , R.drawable.foto_for_fragments2 , R.drawable.foto_for_fragments3));
        data.add(new Model_fragments(R.drawable.foto_for_fragments , R.drawable.foto_for_fragments2 , R.drawable.foto_for_fragments3));
        data.add(new Model_fragments(R.drawable.foto_for_fragments , R.drawable.foto_for_fragments2 , R.drawable.foto_for_fragments3));
        data.add(new Model_fragments(R.drawable.foto_for_fragments , R.drawable.foto_for_fragments2 , R.drawable.foto_for_fragments3));
        data.add(new Model_fragments(R.drawable.foto_for_fragments , R.drawable.foto_for_fragments2 , R.drawable.foto_for_fragments3));
        data.add(new Model_fragments(R.drawable.foto_for_fragments , R.drawable.foto_for_fragments2 , R.drawable.foto_for_fragments3));
    }
}