package com.projects.freetalk.ui.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.projects.freetalk.data.bean.ImageSliderModel;
import com.projects.freetalk.databinding.CustomImageSliderViewBinding;
import com.smarteist.autoimageslider.SliderViewAdapter;
import com.squareup.picasso.Picasso;

import java.util.List;

public class ImageSlidingAdapter extends SliderViewAdapter<ImageSlidingAdapter.ImageSlidingViewHolder> {
    private final List<ImageSliderModel> sliderList;

    public ImageSlidingAdapter(List<ImageSliderModel> mSliderItems) {
        this.sliderList = mSliderItems;
    }

    @Override
    public int getCount() {
        return sliderList.size();
    }

    @Override
    public ImageSlidingViewHolder onCreateViewHolder(ViewGroup parent) {
        return new ImageSlidingViewHolder(CustomImageSliderViewBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(ImageSlidingViewHolder viewHolder, int position) {
        ImageSliderModel imageSliderModel = sliderList.get(position);
        Picasso.get().load(imageSliderModel.getImageRes()).into(viewHolder.binding.ivDetailedImage);
    }

    public static class ImageSlidingViewHolder extends SliderViewAdapter.ViewHolder {
        final CustomImageSliderViewBinding binding;

        public ImageSlidingViewHolder(CustomImageSliderViewBinding itemView) {
            super(itemView.getRoot());
            this.binding = itemView;
        }
    }
}

