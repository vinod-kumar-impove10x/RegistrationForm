package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SuccessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);
        Intent professionalInfoIntent = getIntent();
        String email = professionalInfoIntent.getStringExtra("email");
        String password = professionalInfoIntent.getStringExtra("password");
        String conformPassword = professionalInfoIntent.getStringExtra("conformPassword");
        String userName = professionalInfoIntent.getStringExtra("userName");
        String firstName = professionalInfoIntent.getStringExtra("firstName");
        String lastName = professionalInfoIntent.getStringExtra("lastName");
        String currentCompany = professionalInfoIntent.getStringExtra("currentCompany");
        String totalExperience = professionalInfoIntent.getStringExtra("totalExperience");
        String designation = professionalInfoIntent.getStringExtra("designation");
    }
}