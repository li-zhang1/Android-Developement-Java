package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void btnRegister(View view){
        EditText editFirstName = findViewById(R.id.editFirstName);
        EditText editLastName = findViewById(R.id.editLastName);
        EditText editEmail = findViewById(R.id.editEmail);

        TextView firstName = findViewById(R.id.textFn);
        TextView lastName = findViewById(R.id.textLn);
        TextView email = findViewById(R.id.textE);

        firstName.setText("First Name: " + editFirstName.getText().toString());
        lastName.setText("Last Name: " + editLastName.getText().toString());
        email.setText("Email: " + editEmail.getText().toString());

    }



