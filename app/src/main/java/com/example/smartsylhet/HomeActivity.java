package com.example.smartsylhet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
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

public class HomeActivity extends AppCompatActivity {

    ImageSlider imageSlider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        imageSlider= findViewById(R.id.image_slider);
        ArrayList<SlideModel> arrayList = new ArrayList<>();

        arrayList.add(new SlideModel(R.drawable.img_slider_home1, ScaleTypes.FIT));
        arrayList.add(new SlideModel(R.drawable.img_slider_home_2, ScaleTypes.FIT));
        arrayList.add(new SlideModel(R.drawable.img_slider_home_3, ScaleTypes.FIT));
        arrayList.add(new SlideModel(R.drawable.img_slider_home_4, ScaleTypes.FIT));
        arrayList.add(new SlideModel(R.drawable.img_slider_home_5, ScaleTypes.FIT));

        imageSlider.setImageList(arrayList);

        SharedPreferences sharedPreferences = getSharedPreferences("shared_pref", Context.MODE_PRIVATE);
        String username = sharedPreferences.getString("username", "").toString();
        Toast.makeText(getApplicationContext(), "Welcome " +username, Toast.LENGTH_SHORT).show();

        CardView exit = findViewById(R.id.cardlogout);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.clear();
                editor.apply();
                startActivity(new Intent(HomeActivity.this, LoginActivity.class));
            }
        });

        CardView house = findViewById(R.id.cardhome);
        house.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, HouseActivity.class));
            }
        });

        CardView service = findViewById(R.id.cardservice);
        service.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, ServiceActivity.class));
            }
        });


        CardView school = findViewById(R.id.cardschool);
        school.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, VehicleRentActivity.class));
            }
        });

        CardView parking = findViewById(R.id.cardparking);
        parking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, ParkingActivity.class));
            }
        });


        CardView map = findViewById(R.id.cardmap);
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, MapActivity.class));
            }
        });

        CardView contact = findViewById(R.id.cardcontact);
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, ContactActivity.class));
            }
        });

        CardView explore = findViewById(R.id.cardexplore);
        explore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, ExploreActivity.class));
            }
        });
        CardView guide = findViewById(R.id.cardguide);
        guide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, GuideActivity.class));
            }
        });
        CardView lang = findViewById(R.id.cardlang);
        lang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, LanguageActivity.class));
            }
        });
    }
}