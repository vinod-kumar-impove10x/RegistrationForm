package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(view -> {
            Intent signupInfoIntent = new Intent(this, PersonalInfoActivity.class);
            EditText emailTxt = findViewById(R.id.email_txt);
            String emailAddress = emailTxt.getText().toString();
            EditText passWordTxt = findViewById(R.id.password_txt);
            String passWord = passWordTxt.getText().toString();
            EditText conformPassWordTxt = findViewById(R.id.conform_password_txt);
            String conformPassWord = conformPassWordTxt.getText().toString();
            signupInfoIntent.putExtra("emailAddress", emailAddress);
            signupInfoIntent.putExtra("password", passWord);
            signupInfoIntent.putExtra("conformPassWord", conformPassWord);
            Toast.makeText(this, emailAddress + "\t" + passWord + "\t" + conformPassWord, Toast.LENGTH_SHORT).show();
            startActivity(signupInfoIntent);
        });
    }
}