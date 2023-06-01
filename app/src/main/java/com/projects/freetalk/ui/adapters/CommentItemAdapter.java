package com.projects.freetalk.ui.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.projects.freetalk.data.bean.CommentModel;
import com.projects.freetalk.databinding.CommentListItemBinding;

import java.util.List;

public class CommentItemAdapter extends RecyclerView.Adapter<CommentItemAdapter.ViewHolderClass> {
    List<CommentModel> commentModels;

    public CommentItemAdapter(List<CommentModel> commentModels) {
        this.commentModels = commentModels;
    }

    @NonNull
    @Override
    public ViewHolderClass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolderClass(CommentListItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderClass holder, int position) {
        CommentModel commentModel = commentModels.get(position);
        holder.commentListItemBinding.profileImg.setImageResource(commentModel.getProfileImage());
        holder.commentListItemBinding.profileName.setText(commentModel.getProfileName());
        holder.commentListItemBinding.userCaption.setText(commentModel.getComment());
    }

    @Override
    public int getItemCount() {
        return commentModels.size();
    }

    public static class ViewHolderClass extends RecyclerView.ViewHolder {
        CommentListItemBinding commentListItemBinding;

        public ViewHolderClass(@NonNull CommentListItemBinding commentListItemBinding) {
            super(commentListItemBinding.getRoot());
            this.commentListItemBinding = commentListItemBinding;
        }
    }
}
