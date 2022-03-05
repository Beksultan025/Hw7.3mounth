package com.example.hw73mounth.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hw73mounth.SecondModel;
import com.example.hw73mounth.databinding.ItemMainBinding;
import com.example.hw73mounth.databinding.ItemSecondBinding;

import java.util.ArrayList;

public class SecondAdapter extends RecyclerView.Adapter<SecondAdapter.SecondViewHolder> {

    private ArrayList<SecondModel> data;

    public SecondAdapter(ArrayList<SecondModel> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public SecondViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SecondViewHolder(ItemSecondBinding.inflate(LayoutInflater.from(parent.getContext()) , parent , false));
    }

    @Override
    public void onBindViewHolder(@NonNull SecondViewHolder holder, int position) {
        holder.bind(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class SecondViewHolder extends RecyclerView.ViewHolder {

        public SecondViewHolder(@NonNull View itemView, ItemSecondBinding binding) {
            super(itemView);
            this.binding = binding;
        }

        private ItemSecondBinding binding;

        public SecondViewHolder(@NonNull ItemSecondBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }

        public void bind(SecondModel secondModel) {
            binding.imageAvatarkaSecond.setImageResource(secondModel.getImage_avatarka());
            binding.imageSecondFoto.setImageResource(secondModel.getImage_foto());
            binding.tvLiked.setText(secondModel.getTextLiked());
            binding.tvTime.setText(secondModel.getTextTime());
        }
    }
}
