package com.example.javatutorial.parcelable;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.javatutorial.R;

public class FirstScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen);
        Button button = findViewById(R.id.go_to_second_screen);
        button.setOnClickListener(v -> {
            Intent intent = new Intent(FirstScreenActivity.this, SecondActivity.class);
            intent.putExtra("school_info", new SchoolInfo("PRIMARY", "NOIDA", new StudentInfo("John Doe", 20, "123 Main St")));
            startActivity(intent);
        });
    }
}