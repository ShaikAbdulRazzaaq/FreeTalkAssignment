package com.projects.freetalk.data.bean;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;

public class CommentModel {
    @DrawableRes
    int profileImage;
    @StringRes
    int comment;
    @StringRes
    int profileName;

    public CommentModel(int profileImage, int comment, int profileName) {
        this.profileImage = profileImage;
        this.comment = comment;
        this.profileName = profileName;
    }

    public int getProfileImage() {
        return profileImage;
    }

    public int getComment() {
        return comment;
    }

    public int getProfileName() {
        return profileName;
    }

}
