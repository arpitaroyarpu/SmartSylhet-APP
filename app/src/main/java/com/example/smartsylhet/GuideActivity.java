package com.example.smartsylhet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;

public class GuideActivity extends AppCompatActivity {

    private Button hireButton;
    private EditText guideNumber,requiredDay,requiredTime;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);

        hireButton = findViewById(R.id.hireGuide);
        guideNumber = findViewById(R.id.guideNumber);
        requiredDay = findViewById(R.id.requiredDay);
        requiredTime = findViewById(R.id.requiredTime);

        hireButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hireData();
            }

        });
    }
    public void hireData(){
        String number = guideNumber.getText().toString().trim();
        String day = requiredDay.getText().toString().trim();
        String time = requiredTime.getText().toString().trim();

        String key = databaseReference.push().getKey();

        Guide guide = new Guide(number,day,time);

        databaseReference.child(key).setValue(guide);
        Toast.makeText(getApplicationContext(), "Hire Guide Successful!", Toast.LENGTH_SHORT).show();
    }
}