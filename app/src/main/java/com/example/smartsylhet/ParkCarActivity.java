package com.example.smartsylhet;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.smartsylhet.databinding.ActivityParkCarBinding;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.Calendar;
import java.util.UUID;

public class ParkCarActivity extends AppCompatActivity {
    ActivityParkCarBinding binding;
    FirebaseFirestore fAuth;
    FirebaseAuth auth;
ProgressDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityParkCarBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        auth = FirebaseAuth.getInstance();
        fAuth = FirebaseFirestore.getInstance();
        dialog=new ProgressDialog(this);


     binding.parkBtn1.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             String driverName = binding.driverName.getText().toString();
             String driverNumber = binding.driverNumber.getText().toString();
             String numberPlate = binding.numberPlate.getText().toString();
             String vehicleType = binding.vehicleType.getText().toString();
             String parkingArea = binding.parkingArea.getText().toString();
             String amount = binding.amount.getText().toString();
             long date = Calendar.getInstance().getTimeInMillis();
             String id= UUID.randomUUID().toString();


             ParkModel parkModel= new ParkModel();

             parkModel.setId(id);
             parkModel.setDriverName(driverName);
             parkModel.setNumberPlate(numberPlate);
             parkModel.setParkingArea(parkingArea);
             parkModel.setDate(date);
             parkModel.setVehicleType(vehicleType);
             parkModel.setAmount(amount);
             parkModel.setDriverNumber(driverNumber);
             parkModel.setUserId(auth.getCurrentUser().getUid());


             dialog.setTitle("Uploading");
             dialog.setMessage("Data to the database");
             dialog.show();
             dialog.setTitle("Parking Successful");
             dialog.show();

             fAuth.collection("Parking")
                     .document(id)
                     .set(parkModel)
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
                             Toast.makeText(ParkCarActivity.this,e.getMessage(), Toast.LENGTH_SHORT).show();
                         }
                     });


         }
     });
    }
}