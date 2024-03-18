package com.example.myportfolioapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    EditText input_name;
    EditText input_age;
    EditText input_skills;
    EditText input_address;
    EditText input_phone;
    TextView user_output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        input_name = (EditText) findViewById(R.id.nameInput);
        input_age = (EditText) findViewById(R.id.ageInput);
        input_skills = (EditText) findViewById(R.id.skillInput);
        input_address = (EditText) findViewById(R.id.emailInput);
        input_phone = (EditText) findViewById(R.id.phoneInput);
        user_output = (TextView) findViewById(R.id.userOutput);



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    @SuppressLint("SetTextI18n")
    public void handleText(View v){
        input_name = findViewById(R.id.nameInput);
        input_age = findViewById(R.id.ageInput);
        input_address = findViewById(R.id.emailInput);
        input_phone = findViewById(R.id.phoneInput);
        user_output.setText("NAME: " + input_name.getText() + "\nAGE: " + input_age.getText() + " years old. \nADDRESS: " + input_skills.getText() + "\nEMAIL: " + input_address.getText() + "\nPHONE #: " + input_phone.getText());
    }
}
