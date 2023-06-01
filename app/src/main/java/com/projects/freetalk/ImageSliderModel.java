package com.projects.freetalk;

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
