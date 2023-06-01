package com.projects.freetalk.ui;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.projects.freetalk.R;
import com.projects.freetalk.data.bean.PostModel;
import com.projects.freetalk.databinding.ActivityMainBinding;
import com.projects.freetalk.ui.adapters.PostItemAdapter;
import com.projects.freetalk.ui.viewmodels.PostViewModel;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());
        activityMainBinding.rvPostList.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        activityMainBinding.rvPostList.setHasFixedSize(true);
        activityMainBinding.rvPostList.setNestedScrollingEnabled(true);
        setSupportActionBar(activityMainBinding.toolbar);

        PostViewModel postViewModel = new ViewModelProvider(this).get(PostViewModel.class);
        postViewModel.getData();

        postViewModel.postModelLiveData.observe(this, this::setUpRecyclerView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.notification_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.notification) {
            Toast.makeText(this, "Notification Icon Clicked", Toast.LENGTH_SHORT).show();
            return true;
        } else return super.onOptionsItemSelected(item);
    }

    private void setUpRecyclerView(PostModel postModel) {
        activityMainBinding.rvPostList.setAdapter(new PostItemAdapter(postModel));
    }
}