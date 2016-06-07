package com.example.g13c1921.biomap;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class ProjectSelectionActivity extends AppCompatActivity {

    public static final String PROJECT_ID_EXTRA = "com.example.g13c1921.biomap.Project Identifier";
    public static final String PROJECT_NAME_EXTRA = "com.example.g13c1921.biomap.Project Name";
    public static final String PROJECT_THEPROJECT_EXTRA = "com.example.g13c1921.biomap.Project TheProject";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_selection);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }

}
