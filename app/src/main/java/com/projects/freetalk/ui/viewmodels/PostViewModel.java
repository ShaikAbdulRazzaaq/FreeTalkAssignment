package com.projects.freetalk.ui.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.projects.freetalk.data.bean.PostModel;
import com.projects.freetalk.data.repo.Repository;

public class PostViewModel extends ViewModel {
    MutableLiveData<PostModel> _postModelLiveData = new MutableLiveData<>();
    public LiveData<PostModel> postModelLiveData = getPostModelLiveData();

    private LiveData<PostModel> getPostModelLiveData() {
        return _postModelLiveData;
    }

    Repository repository = new Repository();

    public void getData() {
        _postModelLiveData.postValue(repository.data());
    }

}
