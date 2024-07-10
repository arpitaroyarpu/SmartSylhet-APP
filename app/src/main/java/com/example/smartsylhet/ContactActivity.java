package com.example.smartsylhet;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.smartsylhet.R.id;

public class ContactActivity extends AppCompatActivity {


    Button buttonCall,buttonCall1,buttonCall2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        buttonCall =findViewById(R.id.call);
        buttonCall1 =findViewById(R.id.call1);
        buttonCall2 =findViewById(R.id.call2);



        buttonCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: 01750160850"));
                startActivity(intent);
            }
        });

        buttonCall1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:01730636140"));
                startActivity(intent);
            }
        });

        buttonCall2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:01315554396"));
                startActivity(intent);
            }
        });

    }


}