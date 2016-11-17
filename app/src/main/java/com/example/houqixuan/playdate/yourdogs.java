package com.example.houqixuan.playdate;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class yourdogs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yourdogs);

    }
    /**
     * Send the user into the registration screen
     * @param v the current view from application
     */
    public void add(View v) {
        if (v.getId() == R.id.add) {
            final Intent i = new Intent(this, adddog.class);
            startActivity(i);
        }
    }

    public void dogPage(View v) {
        if (v.getId() == R.id.image1 || v.getId() == R.id.image2 ||v.getId() == R.id.image || v.getId() == R.id.image4) {
            final Intent i = new Intent(this, dogpage.class);
            startActivity(i);
        }
    }

    public void logOut(View v) {
        if (v.getId() == R.id.LO) {
            final Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
        }
    }

}
