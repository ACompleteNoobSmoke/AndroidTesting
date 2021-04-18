package com.ap.androidproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import Model.Person;

public class Register extends AppCompatActivity {

    private EditText firstName;
    private EditText lastName;
    private EditText userName;
    private EditText password;
    private EditText email;
    private Button saveBTN;
    private Button backBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        EditText[] userInfo = getInfo();
        saveBTN = findViewById(R.id.saveBTN);
        backBTN = findViewById(R.id.backBTN);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.equals(saveBTN)) {
                    userPage(userInfo);
                } else if(v.equals(backBTN)) {
                    backToHomePage();
                }
            }
        };
        saveBTN.setOnClickListener(listener);
        backBTN.setOnClickListener(listener);
    }

    public EditText[] getInfo(){
        EditText[] info = new EditText[5];
        firstName = findViewById(R.id.userFirstName);
        lastName = findViewById(R.id.userLastName);
        userName = findViewById(R.id.userName);
        password = findViewById(R.id.userPassword);
        email = findViewById(R.id.userEmail);
        info[0] = firstName;
        info[1] = lastName;
        info[2] = userName;
        info[3] = password;
        info[4] = email;
        return info;
    }


    public void userPage(EditText[] information){
        String firstName = information[0].getText().toString();
        String lastName = information[1].getText().toString();
        String userName = information[2].getText().toString();
        String password = information[3].getText().toString();
        String phoneNumber = information[4].getText().toString();
        Person p = new Person(firstName, lastName, userName, password, phoneNumber);
        Intent intent = new Intent(Register.this, UserPage.class);
        intent.putExtra("person", p);
        startActivity(intent);

    }

    public void backToHomePage(){
                Intent intent = new Intent(Register.this, MainActivity.class);
                startActivity(intent);
    }
}