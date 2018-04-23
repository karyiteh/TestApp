package com.example.teh_k.testapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private Toolbar appbar;
    private RecyclerView tasklist;
    private RecyclerView.Adapter tasklistAdapter;
    private RecyclerView.LayoutManager tasklistLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Creates the appbar.
        appbar = findViewById(R.id.appbar);
        setSupportActionBar(appbar);

        // Creates the task list.
        tasklist = findViewById(R.id.tasks);
        tasklistLayout = new LinearLayoutManager(this);
        tasklist.setLayoutManager(tasklistLayout);

        // Test input dataset.
        String[] inputDataset = new String[3];
        inputDataset[0] = "Take out trash";
        inputDataset[1] = "Wash dishes";
        inputDataset[2] = "Vacuum the living room";

        // Creates the adapter for the task list.
        tasklistAdapter = new TaskAdapter(inputDataset);
        tasklist.setAdapter(tasklistAdapter);

    }

}
