package com.projects.freetalk.data.bean;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;

import java.util.List;

public class PostModel {
    @DrawableRes
    int profileImage;
    @StringRes
    int profileName;
    @StringRes
    int profileWeight;
    @StringRes
    int profileHeight;
    boolean isVerifiedProfile;
    @StringRes
    int title;
    @StringRes
    int body;
    List<ImageSliderModel> imageSliderModels;
    String likeCount;
    String commentCount;
    @StringRes
    int profileCaption;
    List<CommentModel> commentModels;

    public PostModel(int profileImage, int profileName, int profileWeight, int profileHeight, boolean isVerifiedProfile, int title, int body, List<ImageSliderModel> imageSliderModels, String likeCount, String commentCount, int profileCaption, List<CommentModel> commentModels) {
        this.profileImage = profileImage;
        this.profileName = profileName;
        this.profileWeight = profileWeight;
        this.profileHeight = profileHeight;
        this.isVerifiedProfile = isVerifiedProfile;
        this.title = title;
        this.body = body;
        this.imageSliderModels = imageSliderModels;
        this.likeCount = likeCount;
        this.commentCount = commentCount;
        this.profileCaption = profileCaption;
        this.commentModels = commentModels;
    }

    public int getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(int profileImage) {
        this.profileImage = profileImage;
    }

    public int getProfileName() {
        return profileName;
    }

    public void setProfileName(int profileName) {
        this.profileName = profileName;
    }

    public int getProfileWeight() {
        return profileWeight;
    }

    public void setProfileWeight(int profileWeight) {
        this.profileWeight = profileWeight;
    }

    public int getProfileHeight() {
        return profileHeight;
    }

    public void setProfileHeight(int profileHeight) {
        this.profileHeight = profileHeight;
    }

    public boolean isVerifiedProfile() {
        return isVerifiedProfile;
    }

    public void setVerifiedProfile(boolean verifiedProfile) {
        isVerifiedProfile = verifiedProfile;
    }

    public int getTitle() {
        return title;
    }

    public void setTitle(int title) {
        this.title = title;
    }

    public int getBody() {
        return body;
    }

    public void setBody(int body) {
        this.body = body;
    }

    public List<ImageSliderModel> getImageSliderModels() {
        return imageSliderModels;
    }

    public void setImageSliderModels(List<ImageSliderModel> imageSliderModels) {
        this.imageSliderModels = imageSliderModels;
    }

    public String getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(String likeCount) {
        this.likeCount = likeCount;
    }

    public String getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(String commentCount) {
        this.commentCount = commentCount;
    }

    public int getProfileCaption() {
        return profileCaption;
    }

    public void setProfileCaption(int profileCaption) {
        this.profileCaption = profileCaption;
    }

    public List<CommentModel> getCommentModels() {
        return commentModels;
    }

    public void setCommentModels(List<CommentModel> commentModels) {
        this.commentModels = commentModels;
    }
}
