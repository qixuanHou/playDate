package com.example.houqixuan.playdate;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class findadate extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_findadate);


    }

    public void filter(View v) {
        if (v.getId() == R.id.filter) {
            final Intent i = new Intent(this, filter.class);
            startActivity(i);
        }
    }

    public void list(View v) {
        if (v.getId() == R.id.list) {
            final Intent i = new Intent(this, findadatelist.class);
            startActivity(i);
        }
    }
}
