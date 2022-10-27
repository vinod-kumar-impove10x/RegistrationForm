package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ProfessionalInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_professional_info);
        Intent personalInfoIntent = getIntent();
        String email = personalInfoIntent.getStringExtra("email");
        String password = personalInfoIntent.getStringExtra("password");
        String conformPassword = personalInfoIntent.getStringExtra("conformPassword");
        String userName = personalInfoIntent.getStringExtra("userName");
        String firstName = personalInfoIntent.getStringExtra("firstName");
        String lastName = personalInfoIntent.getStringExtra("lastName");
        Toast.makeText(this, email + " " + password + " " + conformPassword + " " + userName + " " + firstName + " " + lastName, Toast.LENGTH_SHORT).show();
        Button nextBtn2 = findViewById(R.id.next2_btn);
        nextBtn2.setOnClickListener(view -> {
            Intent professionalInfoIntent = new Intent(this, SuccessActivity.class);
            EditText currentCompanyTxt = findViewById(R.id.current_company_txt);
            String currentCompany = currentCompanyTxt.getText().toString();
            EditText totalExperienceTxt = findViewById(R.id.total_experience_txt);
            String totalExperience = totalExperienceTxt.getText().toString();
            EditText designationTxt = findViewById(R.id.designation_txt);
            String designation = designationTxt.getText().toString();
            professionalInfoIntent.putExtra("emailAddress", email);
            professionalInfoIntent.putExtra("password", password);
            professionalInfoIntent.putExtra("conformPassWord", conformPassword);
            professionalInfoIntent.putExtra("userName", userName);
            professionalInfoIntent.putExtra("firstName", firstName);
            professionalInfoIntent.putExtra("lastName", lastName);
            professionalInfoIntent.putExtra("currentCompany", currentCompany);
            professionalInfoIntent.putExtra("totalExperience", totalExperience);
            professionalInfoIntent.putExtra("designation", designation);
            Toast.makeText(this, email + " " + password + " " + conformPassword + " " + userName + " " + firstName + " " + lastName + " " + currentCompany + " " + totalExperience + " " + designation , Toast.LENGTH_SHORT).show();
            startActivity(professionalInfoIntent);
        });

        Button backBtn2 = findViewById(R.id.back2_btn);
        backBtn2.setOnClickListener(view -> {
            Intent intent2 = new Intent(this, PersonalInfoActivity.class);
            startActivity(intent2);
        });

    }
}