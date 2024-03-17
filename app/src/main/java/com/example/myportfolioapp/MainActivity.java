package com.example.myportfolioapp;

import android.os.Bundle;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    EditText input_name;
    EditText input_email;
    EditText input_address;
    EditText input_number;
    EditText input_about;
    EditText input_skills;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        input_name = (EditText) findViewById(R.id.name_text);
        input_email = (EditText) findViewById(R.id.email_text);
        input_address = (EditText) findViewById(R.id.address_text);
        input_number = (EditText) findViewById(R.id.number_text);
        input_about= (EditText) findViewById(R.id.about_text);
        input_skills = (EditText) findViewById(R.id.skills_text);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void Save(View v){
        input_name = findViewById(R.id.name_text);
        input_email = findViewById(R.id.email_text);
        input_address = findViewById(R.id.address_text);
        input_number = findViewById(R.id.number_text);
        input_about= findViewById(R.id.about_text);
        input_skills = findViewById(R.id.skills_text);
    }
}