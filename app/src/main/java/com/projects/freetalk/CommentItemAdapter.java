package com.projects.freetalk;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.projects.freetalk.databinding.CommentListItemBinding;

public class CommentItemAdapter extends RecyclerView.Adapter<CommentItemAdapter.ViewHolderClass> {
    @NonNull
    @Override
    public ViewHolderClass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolderClass(CommentListItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderClass holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 2;
    }

    public static class ViewHolderClass extends RecyclerView.ViewHolder {
        CommentListItemBinding commentListItemBinding;

        public ViewHolderClass(@NonNull CommentListItemBinding commentListItemBinding) {
            super(commentListItemBinding.getRoot());
            this.commentListItemBinding = commentListItemBinding;
        }
    }
}
