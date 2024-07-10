package com.example.smartsylhet;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SignUpActivity extends AppCompatActivity {

    private FirebaseAuth auth;
    private EditText signupEmail,signupPassword;
    private Button signupButton;
    private TextView loginDirect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);


        auth = FirebaseAuth.getInstance();
        signupEmail = findViewById(R.id.User_email);
        signupPassword = findViewById(R.id.User_pass);
        signupButton = findViewById(R.id.sign_up);
        loginDirect = findViewById(R.id.Already_login);

        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String email = signupEmail.getText().toString().trim();
                String password = signupPassword.getText().toString().trim();



                if (email.isEmpty()) {

                    signupEmail.setError("Email Cannot Be Empty");
                }

                if (password.isEmpty()) {

                    signupPassword.setError("Password Cannot Be Empty");
                }

                else {
                    auth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
              if(task.isSuccessful()){
                  Toast.makeText(SignUpActivity.this, "SignUp Successfully", Toast.LENGTH_SHORT).show();
                  startActivity(new Intent(SignUpActivity.this, LoginActivity.class));
                           }
              else {
                  Toast.makeText(SignUpActivity.this, "Failed SignUp" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
              }
                        }
                    });
                }

            }
        });

        loginDirect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SignUpActivity.this,LoginActivity.class));
            }
        });
    }
}