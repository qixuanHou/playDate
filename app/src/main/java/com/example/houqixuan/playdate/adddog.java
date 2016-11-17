package com.example.houqixuan.playdate;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.backendless.Backendless;
import com.backendless.BackendlessUser;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.exceptions.BackendlessFault;

public class adddog extends AppCompatActivity {
    private EditText age;
    private EditText weight;
    private EditText likes;
    private EditText level;
    private EditText temperament;
    private EditText name;
    private EditText breed;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adddog);

    }


    public void add(View v) {
        age = (EditText) findViewById(R.id.age);
        weight = (EditText) findViewById(R.id.weight);
        likes = (EditText) findViewById(R.id.likes);
        level = (EditText) findViewById(R.id.activities);
        temperament = (EditText) findViewById(R.id.temperament);
        name = (EditText) findViewById(R.id.name);
        breed = (EditText) findViewById(R.id.Breed);

        if (v.getId() == R.id.add) {
            addDog(age.getText().toString(), weight.getText().toString(), level.getText().toString(), name.getText().toString(), temperament.getText().toString(), breed.getText().toString(), likes.getText().toString());
            final Intent i = new Intent(this, dogpage.class);
            startActivity(i);
        }
    }


    public void addDog(String age, String weight, String level, String name, String t, String b, String l) {
        final dogs d = new dogs(weight, name, b);

        final BackendlessUser user = Backendless.UserService.CurrentUser();

        d.setAge(age);
        d.setBreed(b);
        d.setLevelofactivities(level);
        d.setLikes(l);
        d.setName(name);
        d.setTemperament(t);
        d.setUser(user);
        d.setWeight(weight);

        Backendless.Persistence.save(d, new AsyncCallback<dogs>() {
            @Override
            public void handleResponse(dogs movie) {
            }

            @Override
            public void handleFault(BackendlessFault backendlessFault) {
            }
        });
    }
}


