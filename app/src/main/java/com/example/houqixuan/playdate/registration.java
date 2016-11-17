package com.example.houqixuan.playdate;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.backendless.Backendless;
import com.backendless.BackendlessUser;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.exceptions.BackendlessFault;

public class registration extends AppCompatActivity {

    /**
     * The Edit Text require user to input their Georgia Tech StudentID
     */
    private EditText inputStudentID;

    /**
     * The Edit Text require user to input their email address
     */
    private EditText inputEmail;

    /**
     * The Edit Text require user to input their account desire Username
     */
    private EditText confirmPassword;

    /**
     * The Edit Text require user to input their account password
     */
    private EditText inputPassword;

    /**
     * Button alow user to push and register new account
     */
    private Button register;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        Backendless.initApp(this, backendSetting.APPLICATION_ID, backendSetting.ANDROID_SECRET_KEY, backendSetting.VERSION);

        inputEmail = (EditText) findViewById(R.id.email);
        inputPassword = (EditText) findViewById(R.id.password);
        confirmPassword = (EditText) findViewById(R.id.confirmpassword);
        register = (Button) findViewById(R.id.register);

    }


    public void registerUser(View v) {
        final String email = inputEmail.getText().toString();
        final String password = inputPassword.getText().toString();

        final BackendlessUser user = new BackendlessUser();
        user.setEmail(email);
        user.setPassword(password);

        Backendless.UserService.register(user, new AsyncCallback<BackendlessUser>() {
            public void handleResponse(BackendlessUser registeredUser) {
                final Intent i = new Intent(getBaseContext(), MainActivity.class);
                startActivity(i);
            }

            public void handleFault(BackendlessFault fault) {
                // an error has occurred, the error code can be retrieved with fault.getCode()
            }
        });
    }


}
