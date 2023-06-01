package com.projects.freetalk;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.projects.freetalk.databinding.ItemPostBinding;

import java.util.ArrayList;
import java.util.List;

public class PostItemAdapter extends RecyclerView.Adapter<PostItemAdapter.ViewHolderClass> {
    private final CommentItemAdapter commentItemAdapter = new CommentItemAdapter();

    @NonNull
    @Override
    public ViewHolderClass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolderClass(ItemPostBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderClass holder, int position) {
        holder.itemPostBinding.rvCommentList.setHasFixedSize(true);
        holder.itemPostBinding.rvCommentList.setLayoutManager(new LinearLayoutManager(holder.itemPostBinding.getRoot().getContext(), RecyclerView.VERTICAL, false));
        holder.itemPostBinding.rvCommentList.setAdapter(commentItemAdapter);
        List<ImageSliderModel> imageResList = new ArrayList<>();
        imageResList.add(new ImageSliderModel(R.drawable.user_image));
        imageResList.add(new ImageSliderModel(R.drawable.image_loading));
        imageResList.add(new ImageSliderModel(R.drawable.image_loading));
        ImageSlidingAdapter imageSlidingAdapter = new ImageSlidingAdapter(imageResList);
        holder.itemPostBinding.postSlider.setSliderAdapter(imageSlidingAdapter);
        holder.itemPostBinding.postSlider.setAutoCycle(false);


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
