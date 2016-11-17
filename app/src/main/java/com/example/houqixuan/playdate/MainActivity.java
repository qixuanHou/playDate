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

public class MainActivity extends AppCompatActivity {

    /**
     * EditText box where user can type his user name
     */

    private EditText usernameTxt;
    /**
     * EditText box where user can enter his password
     */
    private EditText passwordTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usernameTxt = (EditText) findViewById(R.id.email);
        passwordTxt = (EditText) findViewById(R.id.password);

        Backendless.initApp(this, backendSetting.APPLICATION_ID, backendSetting.ANDROID_SECRET_KEY, backendSetting.VERSION);
    }

    /**
     * The method will check if the user email and password match with
     * the information in the backend. IF it matches, the user can go to the main activity page
     * Otherwise, user will be kicked out.
     *
     * @param v the current view from application
     */
    public void onBLoginClick(View v) {
        final String tempUsername = usernameTxt.getText().toString();

        Backendless.UserService.login(tempUsername, passwordTxt.getText().toString(), new AsyncCallback<BackendlessUser>() {
            @Override
            public void handleResponse(BackendlessUser backendlessUser) {
                final Intent i = new Intent(getBaseContext(), yourdogs.class);
                startActivity(i);
            }

            @Override
            public void handleFault(BackendlessFault backendlessFault) {

            }
        });
    }

    /**
     * Send the user into the registration screen
     * @param v the current view from application
     */
    public void onButtonRegisterClick(View v) {
        if (v.getId() == R.id.register) {
            final Intent i = new Intent(this, registration.class);
            startActivity(i);
        }
    }


}
