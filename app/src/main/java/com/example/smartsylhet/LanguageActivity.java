package com.example.smartsylhet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class LanguageActivity extends AppCompatActivity {

    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);

        listView= (ListView) findViewById(R.id.listView);
String[] Learn_Sylheti = getResources().getStringArray(R.array.Learn_Sylheti);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (LanguageActivity.this, R.layout.sampleview, R.id.find,Learn_Sylheti);
        listView.setAdapter(adapter);
    }
}