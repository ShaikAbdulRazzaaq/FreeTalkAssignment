package com.projects.freetalk;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.projects.freetalk.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;
    private final PostItemAdapter postItemAdapter = new PostItemAdapter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());

        setUpRecyclerView();

        setSupportActionBar(activityMainBinding.toolbar);
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

    private void setUpRecyclerView() {
        activityMainBinding.rvPostList.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        activityMainBinding.rvPostList.setHasFixedSize(true);
        activityMainBinding.rvPostList.setNestedScrollingEnabled(true);
        activityMainBinding.rvPostList.setAdapter(postItemAdapter);
    }
}