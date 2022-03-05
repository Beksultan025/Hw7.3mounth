package com.example.hw73mounth.Adapters;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hw73mounth.Adapters.MainAdapter;
import com.example.hw73mounth.Model;
import com.example.hw73mounth.R;
import com.example.hw73mounth.databinding.FragmentMainBinding;

import java.util.ArrayList;

public class MainFragment extends Fragment {
    private ArrayList <Model> data;
    private MainAdapter adapter;

    private FragmentMainBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMainBinding.inflate(LayoutInflater.from(getContext()), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        adapter = new MainAdapter(data);
        binding.recyclerMain.setAdapter(adapter);
    }

    private void loadData() {
        data = new ArrayList<>();
        data.add(new Model(R.drawable.hm_foto , "Beksultan krasavjik " , "2008"));
        data.add(new Model(R.drawable.hm_foto , "Beksultan krasavjik " , "2008"));
        data.add(new Model(R.drawable.hm_foto , "Beksultan krasavjik " , "2008"));
        data.add(new Model(R.drawable.hm_foto , "Beksultan krasavjik " , "2008"));
    }
}