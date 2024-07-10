package com.example.smartsylhet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;


import java.util.ArrayList;

public class SmallFamilyActivity extends AppCompatActivity {

    RecyclerView rcv;
    myadapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medium_family);

        rcv=(RecyclerView) findViewById(R.id.recview);
        rcv.setLayoutManager(new LinearLayoutManager(this));

        adapter = new myadapter(dataqueue(),getApplicationContext());
        rcv.setAdapter(adapter);

//        GridLayoutManager gridLayoutManager= new GridLayoutManager(this,2);
//        rcv.setLayoutManager(gridLayoutManager);


    }
    public ArrayList<Model> dataqueue()
    {
        ArrayList<Model> holder = new ArrayList<>();

        Model ob1=new Model();
        ob1.setImgname(R.drawable.school);
        ob1.setHeader("Amborkhana");
        ob1.setDesc("2 Bed Room 1 attached Washroom and 1 Single Washroom"+
                ",1 Dining Room and Kitchen"+",Per Month - 9000tk only including Gas Services"+
                "It is special because its near the main point also all facilities are available"+
                "If you need any kind of information please contact us");
        holder.add(ob1);

        Model ob2=new Model();
        ob2.setImgname(R.drawable.school);
        ob2.setHeader("Akalia");
        ob2.setDesc("2 Bed Room 1 attached Washroom and 1 Single Washroom"+
                ",1 Dining Room and Kitchen"+",Per Month - 9500tk only including Gas Services"+
                "It is special because its near the main point also all facilities are available"+
                "If you need any kind of information please contact us");
        holder.add(ob2);

        Model ob3=new Model();
        ob3.setImgname(R.drawable.school);
        ob3.setHeader("SubidBazar");
        ob3.setDesc("3 Bed Room 2, attached Washroom and 1 Single Washroom"+
                ",1 Dining Room and Kitchen"+",Per Month - 17000tk only including Gas Services"+
                "It is special because its near the main point also all facilities are available"+
                "If you need any kind of information please contact us");
        holder.add(ob3);

        Model ob4=new Model();
        ob4.setImgname(R.drawable.school);
        ob4.setHeader("BandarBazar");
        ob4.setDesc("2 Bed Room 1 attached Washroom and 1 Single Washroom"+
                ",1 Dining Room and Kitchen"+",Per Month - 10000tk only including Gas Services"+
                "It is special because its near the main point also all facilities are available"+
                "If you need any kind of information please contact us");
        holder.add(ob4);

        Model ob5=new Model();
        ob5.setImgname(R.drawable.school);
        ob5.setHeader("HousingState");
        ob5.setDesc("2 Bed Room 1 Single Washroom"+
                ",1 Dining Room and Kitchen"+",Per Month - 8500tk only including Gas Services"+
                "It is special because its near the main point also all facilities are available"+
                "If you need any kind of information please contact us");
        holder.add(ob5);

        Model ob6=new Model();
        ob6.setImgname(R.drawable.school);
        ob6.setHeader("Baluchar");
        ob6.setDesc("2 Bed Room 1 attached Washroom and 1 Single Washroom"+
                ",1 Dining Room and Kitchen"+",Per Month - 9000tk only including Gas Services"+
                "It is special because its near the main point also all facilities are available"+
                "If you need any kind of information please contact us");
        holder.add(ob6);

        Model ob7=new Model();
        ob7.setImgname(R.drawable.school);
        ob7.setHeader("Tilaghor");
        ob7.setDesc("2 Bed Room 2 attached Washroom "+
                ",1 Dining Room and Kitchen"+",Per Month - 9500tk only including Gas Services"+
                "It is special because its near the main point also all facilities are available"+
                "If you need any kind of information please contact us");
        holder.add(ob7);

        Model ob8=new Model();
        ob8.setImgname(R.drawable.school);
        ob8.setHeader("Arambagh");
        ob8.setDesc("2 Bed Room 1 Single Washroom"+
                ",1 Dining Room and Kitchen"+",Per Month - 8000tk only including Gas Services"+
                "It is special because its near the main point also all facilities are available"+
                "If you need any kind of information please contact us");
        holder.add(ob8);

        Model ob9=new Model();
        ob9.setImgname(R.drawable.school);
        ob9.setHeader("Uposhore");
        ob9.setDesc("2 Bed Room 2 attached Washroom "+
                ",1 Dining Room and Kitchen"+",Per Month - 10000tk only including Gas Services"+
                "It is special because its near the main point also all facilities are available"+
                "If you need any kind of information please contact us");
        holder.add(ob9);

        Model ob10=new Model();
        ob10.setImgname(R.drawable.school);
        ob10.setHeader("ShibGanj");
        ob10.setDesc("3 Bed Room 2 attached Washroom and  Single Washroom"+
                ",1 Dining Room and Kitchen"+",Per Month - 12000tk only including Gas Services"+
                "It is special because its near the main point also all facilities are available"+
                "If you need any kind of information please contact us");
        holder.add(ob10);

        return holder;

    }
}