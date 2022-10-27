package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PersonalInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_info);
        Intent intent = getIntent();
        String email = intent.getStringExtra("emailAddress");
        String password = intent.getStringExtra("password");
        String conformPassword = intent.getStringExtra("conformPassword");
        Button nextBtn1 = findViewById(R.id.next1_btn);
        nextBtn1.setOnClickListener(view -> {
            Intent personalInfoIntent = new Intent(this, ProfessionalInfoActivity.class);
            EditText userNameTxt = findViewById(R.id.user_name_txt);
            String userName = userNameTxt.getText().toString();
            EditText firstNameTxt = findViewById(R.id.first_name_txt);
            String firstName = firstNameTxt.getText().toString();
            EditText lastNameTxt = findViewById(R.id.last_name_txt);
            String lastName = lastNameTxt.getText().toString();
            personalInfoIntent.putExtra("emailAddress", email);
            personalInfoIntent.putExtra("password", password);
            personalInfoIntent.putExtra("conformPassWord", conformPassword);
            personalInfoIntent.putExtra("userName", userName);
            personalInfoIntent.putExtra("firstName", firstName);
            personalInfoIntent.putExtra("lastName", lastName);
            Toast.makeText(this, email + " " + password + " " + conformPassword + userName + " " + firstName + " " + lastName , Toast.LENGTH_LONG).show();
            startActivity(personalInfoIntent);
        });

        Button backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(view -> {
           finish();
        });
    }
}