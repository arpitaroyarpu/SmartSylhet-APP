package com.example.smartsylhet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class ServiceActivity extends AppCompatActivity {

    ImageSlider imageSlider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);

        imageSlider= findViewById(R.id.image_slider);
        ArrayList<SlideModel> arrayList = new ArrayList<>();

        arrayList.add(new SlideModel(R.drawable.doctor_slider, ScaleTypes.FIT));
        arrayList.add(new SlideModel(R.drawable.police_slider, ScaleTypes.FIT));
        arrayList.add(new SlideModel(R.drawable.fire_one_slider, ScaleTypes.FIT));
        imageSlider.setImageList(arrayList);

        SharedPreferences sharedPreferences = getSharedPreferences("shared_pref", Context.MODE_PRIVATE);
        String username = sharedPreferences.getString("username", "").toString();
        Toast.makeText(getApplicationContext(), "Welcome " +username, Toast.LENGTH_SHORT).show();

        CardView exit = findViewById(R.id.cardexit);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.clear();
                editor.apply();
                startActivity(new Intent(ServiceActivity.this, HomeActivity.class));
            }
        });

        CardView doctor = findViewById(R.id.carddoctors);
        doctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ServiceActivity.this, DoctorsActivity.class));
            }
        });

    }
}