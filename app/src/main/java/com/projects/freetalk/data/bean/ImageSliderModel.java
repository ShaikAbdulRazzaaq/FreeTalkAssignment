package com.projects.freetalk.data.bean;

import androidx.annotation.DrawableRes;

public class ImageSliderModel {
    final @DrawableRes int imageRes;

    public ImageSliderModel(@DrawableRes int imageRes) {
        this.imageRes = imageRes;
    }

    public int getImageRes() {
        return imageRes;
    }
}
