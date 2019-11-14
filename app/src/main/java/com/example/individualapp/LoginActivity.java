package com.example.individualapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private EditText Username;
    private EditText Password;
    private Button SignIn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_activity);

        Username = (EditText) findViewById(R.id.etUsermane);
        Password = (EditText)findViewById(R.id.etPassword);
        SignIn = (Button)findViewById(R.id.btnSignin);

        SignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               validate(Username.getText().toString(), Password.getText().toString());
            }
        });



    }

    private void validate(String userName, String userPassword){
        if((userName.equals("hnogueiras4484")) && (userPassword.equals("1234"))) {
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);
        }


        }
    }




