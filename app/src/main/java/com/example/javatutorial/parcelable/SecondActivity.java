package com.example.javatutorial.parcelable;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.PersistableBundle;
import android.widget.TextView;

import com.example.javatutorial.R;

public class SecondActivity extends AppCompatActivity {
    SchoolInfo schoolInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView textViewName = findViewById(R.id.name);
        TextView textViewAge = findViewById(R.id.age);
        TextView textViewAddress = findViewById(R.id.address);

        schoolInfo = getIntent().getParcelableExtra("school_info");

        textViewName.setText("Name: " + schoolInfo.getSchoolName());
        textViewAge.setText("Address: " + schoolInfo.getSchoolAddress());
        textViewAddress.setText("StudentInfo: " + schoolInfo.getStudentInfo().getName() + ", Age: " + schoolInfo.getStudentInfo().getAge() + ", Address: " + schoolInfo.getStudentInfo().getAddress());

        if (savedInstanceState != null) {
            schoolInfo = savedInstanceState.getParcelable("school_info");
            textViewName.setText("Name: " + schoolInfo.getSchoolName());
            textViewAge.setText("Address: " + schoolInfo.getSchoolAddress());
            textViewAddress.setText("StudentInfo: " + schoolInfo.getStudentInfo().getName() + ", Age: " + schoolInfo.getStudentInfo().getAge() + ", Address: " + schoolInfo.getStudentInfo().getAddress());
        }
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState, @NonNull PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        outState.putParcelable("school_info", schoolInfo);
    }
}