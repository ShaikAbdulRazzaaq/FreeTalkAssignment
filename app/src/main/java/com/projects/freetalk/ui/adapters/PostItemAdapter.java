package com.projects.freetalk.ui.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.projects.freetalk.data.bean.PostModel;
import com.projects.freetalk.databinding.ItemPostBinding;

public class PostItemAdapter extends RecyclerView.Adapter<PostItemAdapter.ViewHolderClass> {
    private final PostModel postModel;

    public PostItemAdapter(PostModel postModel) {
        this.postModel = postModel;
    }

    @NonNull
    @Override
    public ViewHolderClass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolderClass(ItemPostBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderClass holder, int position) {
        holder.itemPostBinding.rvCommentList.setHasFixedSize(true);
        holder.itemPostBinding.rvCommentList.setLayoutManager(new LinearLayoutManager(holder.itemPostBinding.getRoot().getContext(), RecyclerView.VERTICAL, false));
        holder.itemPostBinding.rvCommentList.setAdapter(new CommentItemAdapter(postModel.getCommentModels()));
        ImageSlidingAdapter imageSlidingAdapter = new ImageSlidingAdapter(postModel.getImageSliderModels());
        holder.itemPostBinding.postSlider.setSliderAdapter(imageSlidingAdapter);
        holder.itemPostBinding.postSlider.setAutoCycle(false);
        holder.itemPostBinding.postTitle.setText(postModel.getTitle());
        holder.itemPostBinding.tvPostBody.setText(postModel.getBody());
        holder.itemPostBinding.imgProfile.setImageResource(postModel.getProfileImage());
        holder.itemPostBinding.profileImg.setImageResource(postModel.getProfileImage());
        holder.itemPostBinding.profileHeight.setText(postModel.getProfileHeight());
        holder.itemPostBinding.profileWeight.setText(postModel.getProfileWeight());
        holder.itemPostBinding.profileName.setText(postModel.getProfileName());
        holder.itemPostBinding.userCaption.setText(postModel.getProfileCaption());
        holder.itemPostBinding.btnLikeOrHeart.setText(postModel.getLikeCount());
        holder.itemPostBinding.btnComment.setText(postModel.getCommentCount());
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
