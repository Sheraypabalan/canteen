package com.example.canteenmealreservationadmin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;
import com.google.android.material.textfield.TextInputEditText;


public class Login extends AppCompatActivity {


    TextInputEditText editTextEmail,editTextPassword;
    Button buttonLogin;
    ProgressBar progressbar;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        editTextEmail = findViewById(R.id.email);
        editTextPassword = findViewById(R.id.password);
        buttonLogin = findViewById(R.id.btn_login);
        progressbar = findViewById(R.id.progressbar);


        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressbar.setVisibility(View.VISIBLE);
                String email,password;
                email = editTextEmail.getText().toString();
                password = editTextPassword.getText().toString();

                if(email.equals("admin@bisu.ph") && password.equals("admin54321")){
                    Intent intent = new Intent(Login.this,Admin.class);
                    startActivity(intent);
                    finish();
                    Toast.makeText(Login.this,"Login Successfully", Toast.LENGTH_SHORT).show();
                    progressbar.setVisibility(View.GONE);
                }
                else if(email.isEmpty()){
                    Toast.makeText(Login.this,"Enter Email", Toast.LENGTH_SHORT).show();
                    progressbar.setVisibility(View.GONE);

                }
                else if(password.isEmpty()){
                    Toast.makeText(Login.this,"Enter Password", Toast.LENGTH_SHORT).show();
                    progressbar.setVisibility(View.GONE);

                }
                else{
                    Toast.makeText(Login.this,"Login Failed", Toast.LENGTH_SHORT).show();
                    progressbar.setVisibility(View.GONE);

                }





            }
        });

    }
}