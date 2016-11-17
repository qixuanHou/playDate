package com.example.houqixuan.playdate;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import java.util.List;
import java.util.ArrayList;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class upcomingActivities extends AppCompatActivity  {

    private List<activity> upc = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upcoming_activities);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
}
