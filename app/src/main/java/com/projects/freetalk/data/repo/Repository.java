package com.projects.freetalk.data.repo;

import com.projects.freetalk.R;
import com.projects.freetalk.data.bean.CommentModel;
import com.projects.freetalk.data.bean.ImageSliderModel;
import com.projects.freetalk.data.bean.PostModel;

import java.util.ArrayList;
import java.util.List;

public class Repository {
    public PostModel data() {
        List<ImageSliderModel> list = new ArrayList<>();
        List<CommentModel> commentModels = new ArrayList<>();
        list.add(new ImageSliderModel(R.drawable.user_image));
        list.add(new ImageSliderModel(R.drawable.image_loading));
        list.add(new ImageSliderModel(R.drawable.image_loading));
        commentModels.add(new CommentModel(R.drawable.other_profile, R.string.otherUserCaption, R.string.otherUserProfileName));
        return new PostModel(R.drawable.profile_avatar, R.string.profile_name, R.string._53kg, R.string._165cm, true, R.string.post_title, R.string.tv_post_body, list, "5", "5", R.string.main_user_caption, commentModels);
    }
}
