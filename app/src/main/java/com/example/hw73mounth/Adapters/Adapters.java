package com.example.hw73mounth.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hw73mounth.Model;
import com.example.hw73mounth.Model_fragments;
import com.example.hw73mounth.databinding.ItemForFragmentsBinding;
import com.example.hw73mounth.databinding.ItemMainBinding;

import java.util.ArrayList;

public class Adapters extends RecyclerView.Adapter<Adapters.FragmentsViewHolder> {

    public Adapters(ArrayList<Model_fragments> data) {
        this.data = data;
    }

    private ArrayList<Model_fragments> data;

    @NonNull
    @Override
    public FragmentsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new FragmentsViewHolder(ItemForFragmentsBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull FragmentsViewHolder holder, int position) {
        holder.bind(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class FragmentsViewHolder extends RecyclerView.ViewHolder {
        private ItemForFragmentsBinding binding;

        public FragmentsViewHolder(@NonNull ItemForFragmentsBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }

        public void bind(Model_fragments model_fragments) {
            binding.image1.setImageResource(model_fragments.getImage1());
            binding.image2.setImageResource(model_fragments.getImage2());
            binding.image3.setImageResource(model_fragments.getImage3());
        }
    }
}
