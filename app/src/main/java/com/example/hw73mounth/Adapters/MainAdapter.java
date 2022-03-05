package com.example.hw73mounth.Adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hw73mounth.Model;
import com.example.hw73mounth.databinding.ItemMainBinding;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder> {

    private ArrayList<Model> data;

    public MainAdapter(ArrayList<Model> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MainViewHolder(ItemMainBinding.inflate(LayoutInflater.from
                (parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        holder.bind(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class MainViewHolder extends RecyclerView.ViewHolder {
        private ItemMainBinding binding;

        public MainViewHolder(@NonNull ItemMainBinding itemMainBinding) {
            super(itemMainBinding.getRoot());
            binding = itemMainBinding;

        }

        public void bind(Model model) {
            binding.hmFoto.setImageResource(model.getImage());
            binding.text1.setText(model.getText1());
            binding.text2.setText(model.getText2());
        }
    }
}
