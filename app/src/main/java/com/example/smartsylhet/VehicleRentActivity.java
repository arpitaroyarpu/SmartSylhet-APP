package com.example.smartsylhet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

public class VehicleRentActivity extends AppCompatActivity {

    Spinner fromBtn,fromBtn1;
    TextView fromd,tod;
    RecyclerView recyclerView;


    String[] places = {"Select Places","Amborkhana","Arambagh","Akaliya","BandarBazar","Baluchar","Couhatta","Cokidigi","Tilaghor"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicle);

        Button clickBtn = findViewById(R.id.clickBtn);
        clickBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VehicleRentActivity.this, Vara.class);
                startActivity(intent);
            }
        });

      }
    }