package com.sadpoetry.blackwallpapers;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class RegisterActivity extends AppCompatActivity {

    EditText EmailInput, PasswordInput,RPasswordInput;
    Button Submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        EmailInput = findViewById(R.id.R_Email);
        PasswordInput = findViewById(R.id.R_Password);
        RPasswordInput = findViewById(R.id.R_ConfirmPassword);

        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();

        final DatabaseReference databaseReference = firebaseDatabase.getReference();

        Submit = findViewById(R.id.SubmitBtn);
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email = EmailInput.getText().toString();
                String password = PasswordInput.getText().toString();
                final FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
                FirebaseAuth.getInstance().createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            firebaseAuth.getCurrentUser().sendEmailVerification();
                            firebaseAuth.getCurrentUser().sendEmailVerification().addOnCompleteListener(new OnCompleteListener<Void>() {
                                @Override
                                public void onComplete(@NonNull Task<Void> task) {
                                    if (task.isSuccessful()){
                                        startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
                                        FirebaseAuth.getInstance().signOut();
                                    }else {
                                        startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
                                        Toast.makeText(RegisterActivity.this, "Please check email verification", Toast.LENGTH_SHORT).show();
                                        FirebaseAuth.getInstance().signOut();
                                    }
                                }
                            });
                        }
                    }
                });
            }
        });
    }
}
