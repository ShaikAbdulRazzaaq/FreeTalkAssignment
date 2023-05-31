package com.projects.freetalk;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.projects.freetalk.databinding.ItemPostBinding;

public class PostItemAdapter extends RecyclerView.Adapter<PostItemAdapter.ViewHolderClass> {
    @NonNull
    @Override
    public ViewHolderClass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolderClass(ItemPostBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderClass holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 2;
    }

    public static class ViewHolderClass extends RecyclerView.ViewHolder {
        ItemPostBinding itemPostBinding;

        public ViewHolderClass(@NonNull ItemPostBinding itemPostBinding) {
            super(itemPostBinding.getRoot());
            this.itemPostBinding = itemPostBinding;
        }
    }
}
