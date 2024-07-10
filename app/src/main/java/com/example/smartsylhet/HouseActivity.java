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

public class HouseActivity extends AppCompatActivity {
    ImageSlider imageSlider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_house);

        imageSlider= findViewById(R.id.image_slider);
        ArrayList<SlideModel> arrayList = new ArrayList<>();

        arrayList.add(new SlideModel(R.drawable.img_slider_house1, ScaleTypes.FIT));
        arrayList.add(new SlideModel(R.drawable.img_slider_house2, ScaleTypes.FIT));
        arrayList.add(new SlideModel(R.drawable.img_slider_house3, ScaleTypes.FIT));
        arrayList.add(new SlideModel(R.drawable.img_slider_house4, ScaleTypes.FIT));
        arrayList.add(new SlideModel(R.drawable.img_slider_house5, ScaleTypes.FIT));

        imageSlider.setImageList(arrayList);

        SharedPreferences sharedPreferences = getSharedPreferences("shared_pref", Context.MODE_PRIVATE);
        String username = sharedPreferences.getString("username", "").toString();
        Toast.makeText(getApplicationContext(), "Welcome " +username, Toast.LENGTH_SHORT).show();

        CardView exit1 = findViewById(R.id.cardbackhome);
        exit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.clear();
                editor.apply();
                startActivity(new Intent(HouseActivity.this, HomeActivity.class));
            }
        });

        CardView bigFamily = findViewById(R.id.cardbighouse);
        bigFamily.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HouseActivity.this, BigFamilyActivity .class));
            }
        });
        CardView mediumFamily = findViewById(R.id.cardmediumfamily);
        mediumFamily.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HouseActivity.this, MediumFamilyActivity .class));
            }
        });

        CardView smallFamily = findViewById(R.id.cardsmallfamily);
        smallFamily.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HouseActivity.this, SmallFamilyActivity.class));
            }
        });
    }
}