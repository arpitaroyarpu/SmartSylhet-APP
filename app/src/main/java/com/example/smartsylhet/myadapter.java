package com.example.smartsylhet;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class myadapter extends RecyclerView.Adapter<myviewholder>
{
    ArrayList<Model> data;
    Context context;

    public myadapter(ArrayList<Model> data, Context context)
    {
        this.data = data;
        this.context=context;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view= inflater.inflate(R.layout.singlerow,parent,false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final myviewholder holder, int position)
    {
        final Model temp=data.get(position);

        holder.img.setImageResource(data.get(position).getImgname());
        holder.t1.setText(data.get(position).getHeader());
        holder.t2.setText(data.get(position).getDesc());

        holder.img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context, MediumDetails.class);
                intent.putExtra("imagename", temp.getImgname());
                intent.putExtra("header", temp.getHeader());
                intent.putExtra("desc",temp.getDesc());
                intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });

    }
    @Override
    public int getItemCount() {
        return data.size();
    }


}
