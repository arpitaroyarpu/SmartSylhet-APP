package com.example.smartsylhet;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.smartsylhet.databinding.ActivityBookAppBinding;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.UUID;

public class BookAppActivity extends AppCompatActivity {

    ActivityBookAppBinding binding;
    FirebaseFirestore fSTore;
    FirebaseAuth fAuth;
    ProgressDialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityBookAppBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        fAuth=FirebaseAuth.getInstance();
        fSTore=FirebaseFirestore.getInstance();
        dialog= new ProgressDialog(this);


        binding.bookAppbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String dname = binding.dname.getText().toString();
                String specialist = binding.specialist.getText().toString();
                String chamber = binding.chamber.getText().toString();
                String fee = binding.fee.getText().toString();
                String pname = binding.pname.getText().toString();
                String pphn = binding.pphn.getText().toString();
                String date = binding.appdate.getText().toString();
                String id= UUID.randomUUID().toString();

                BookAppModel bookAppModel= new BookAppModel();
                bookAppModel.setId(id);
                bookAppModel.setdName(dname);
                bookAppModel.setSpecialist(specialist);
                bookAppModel.setChamber(chamber);
                bookAppModel.setFee(fee);
                bookAppModel.setPname(pname);
                bookAppModel.setPphn(pphn);
                bookAppModel.setDate(date);

                dialog.setTitle("Uploading");
                dialog.setMessage("Dat to the database");
                dialog.show();
                dialog.setMessage("Your Appointment is Booked");
                dialog.show();
                fSTore.collection("booking")
                        .document(id)
                        .set(bookAppModel)
                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void unused) {
                                dialog.cancel();
                                finish();

                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                dialog.cancel();
                                Toast.makeText(BookAppActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                            }
                        });

            }
        });


    }
}