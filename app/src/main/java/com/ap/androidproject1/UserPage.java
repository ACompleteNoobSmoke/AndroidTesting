package com.ap.androidproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import Model.Person;

public class UserPage extends AppCompatActivity {

    private TextView welcomeText;
    private TextView lastName;
    private TextView userName;
    private TextView password;
    private TextView phoneNumber;
    private TextView email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_page);

        welcomeText = findViewById(R.id.welcomeText);
//        lastName = findViewById(R.id.txtLastName);
//        userName = findViewById(R.id.txtUserName);
//        password = findViewById(R.id.txtPassword);
//        phoneNumber = findViewById(R.id.txtPhoneNumber);
//        email = findViewById(R.id.txtEmail);

        Person person = getIntent().getParcelableExtra("person");
        welcomeText.setText("Hello, " + person.getUserName());
//        firstName.setText(person.getFirstName());
//        lastName.setText(person.getLastName());
//        userName.setText(person.getUserName());
//        password.setText(person.getPassword());
//        phoneNumber.setText(person.getPhoneNumber());
//        email.setText(person.getEmail());

    }
}