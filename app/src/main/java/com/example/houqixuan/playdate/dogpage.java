package com.example.houqixuan.playdate;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class dogpage extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dogpage);

    }

    public void update(View v) {
        if (v.getId() == R.id.update) {
            final Intent i = new Intent(this, adddog.class);
            startActivity(i);
        }
    }

    public void find(View v) {
        if (v.getId() == R.id.find) {
            final Intent i = new Intent(this, findadate.class);
            startActivity(i);
        }
    }

    public void upcoming(View v) {
        if (v.getId() == R.id.upcoming) {
            final Intent i = new Intent(this, upcomingActivities.class);
            startActivity(i);
        }
    }
    public void old(View v) {
        if (v.getId() == R.id.friends) {
            final Intent i = new Intent(this, oldmatches.class);
            startActivity(i);
        }
    }

    public void sendRequest(View v) {
        if (v.getId() == R.id.req) {
            final Intent i = new Intent(this, activityDeails.class);
            startActivity(i);
        }
    }

}
