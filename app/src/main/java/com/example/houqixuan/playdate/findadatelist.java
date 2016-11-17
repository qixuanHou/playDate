package com.example.houqixuan.playdate;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class findadatelist extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_findadatelist);

    }


    public void sendRequest(View v) {
        if (v.getId() == R.id.b12345) {
            final Intent i = new Intent(this, requestPage.class);
            startActivity(i);
        }
    }



}
