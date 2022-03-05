package com.example.hw73mounth.Adapters;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hw73mounth.R;
import com.example.hw73mounth.SecondModel;
import com.example.hw73mounth.databinding.FragmentSecondBinding;

import java.util.ArrayList;

public class SecondFragment extends Fragment {

    private FragmentSecondBinding binding;
    private ArrayList<SecondModel> data;
    private SecondAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSecondBinding.inflate(LayoutInflater.from(requireContext()) , container , false );
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        adapter = new SecondAdapter(data);
        binding.recyclerSecond.setAdapter(adapter);
    }

    private void loadData() {
        data = new ArrayList<>();
        data.add(new SecondModel(R.drawable.avatarka_second , "karennne liked your photo." , "1h" , R.drawable.second_foto));
        data.add(new SecondModel(R.drawable.avatarka_second , "karennne liked your photo." , "1h" , R.drawable.second_foto));
        data.add(new SecondModel(R.drawable.avatarka_second , "karennne liked your photo." , "1h" , R.drawable.second_foto));
        data.add(new SecondModel(R.drawable.avatarka_second , "karennne liked your photo." , "1h" , R.drawable.second_foto));
        data.add(new SecondModel(R.drawable.avatarka_second , "karennne liked your photo." , "1h" , R.drawable.second_foto));
        data.add(new SecondModel(R.drawable.avatarka_second , "karennne liked your photo." , "1h" , R.drawable.second_foto));
        data.add(new SecondModel(R.drawable.avatarka_second , "karennne liked your photo." , "1h" , R.drawable.second_foto));
        data.add(new SecondModel(R.drawable.avatarka_second , "karennne liked your photo." , "1h" , R.drawable.second_foto));
        data.add(new SecondModel(R.drawable.avatarka_second , "karennne liked your photo." , "1h" , R.drawable.second_foto));
    }
}