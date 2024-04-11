package com.sadpoetry.blackwallpapers;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;

public class LoginActivity extends AppCompatActivity {
    EditText EmailInput, PasswordInput;
    TextView Signup;
    Button loginbtn;

    private FirebaseAuth mAuth;
    private DatabaseReference databaseReference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EmailInput = findViewById(R.id.Email);
        PasswordInput = findViewById(R.id.Password);

        mAuth = FirebaseAuth.getInstance();

        Signup = findViewById(R.id.signup);
        Signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
                finish();
            }
        });
        loginbtn = findViewById(R.id.loginBtn);
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!EmailInput.getText().toString().isEmpty() && !PasswordInput.getText().toString().isEmpty()){
                    
                    validate(EmailInput.getText().toString(), PasswordInput.getText().toString());
                }
                else {
                    Toast.makeText(LoginActivity.this, "Please fill out the detail", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    private void validate(String email, String password) {
        mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(!task.isSuccessful()){
                    startActivity(new Intent(LoginActivity.this, MainActivity.class));
                    Toast.makeText(LoginActivity.this, "This email is not register ", Toast.LENGTH_SHORT).show();
                    finish();
                }
                else {
                    checkifEmailVirified();
                }
            }
        });
    }

    private void checkifEmailVirified() {
        FirebaseUser user = mAuth.getCurrentUser();
        assert user != null;
        if (user.isEmailVerified()){
            Toast.makeText(this, "Login successfully", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(LoginActivity.this, MainActivity.class));
            finish();
        }else {
            Toast.makeText(this, "Check your Email", Toast.LENGTH_SHORT).show();
        }
    }
}
