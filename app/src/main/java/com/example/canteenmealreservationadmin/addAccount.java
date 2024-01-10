package com.example.canteenmealreservationadmin;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.OnCompleteListener;
import android.widget.Toast;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class addAccount extends AppCompatActivity {

    TextInputEditText editTextEmail,editTextPassword;
    Button buttonReg;
    FirebaseAuth mAuth;
    ProgressBar progressbar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_account);
        ImageButton button = findViewById(R.id.out);
        mAuth = FirebaseAuth.getInstance();
        editTextEmail = findViewById(R.id.email);
        editTextPassword = findViewById(R.id.password);
        buttonReg = findViewById(R.id.btn_register);
        progressbar = findViewById(R.id.progressbar);
        button.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          Intent intent = new Intent(addAccount.this, Admin.class);
                                          startActivity(intent);
                                          finish();
                                      }
                                  });


        buttonReg.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    progressbar.setVisibility(View.VISIBLE);
                    String email,password;
                    email = editTextEmail.getText().toString();
                    password = editTextPassword.getText().toString();

                    if(TextUtils.isEmpty(email)){
                        progressbar.setVisibility(View.GONE);
                        Toast.makeText(addAccount.this,"Enter email", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    if(TextUtils.isEmpty(password)){
                        progressbar.setVisibility(View.GONE);
                        Toast.makeText(addAccount.this,"Enter password", Toast.LENGTH_SHORT).show();
                        return;
                    }


                    mAuth.createUserWithEmailAndPassword(email, password)
                            .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {

                                    if (task.isSuccessful()) {
                                        Toast.makeText(addAccount.this, "Account Created",
                                                Toast.LENGTH_SHORT).show();
                                        Intent intent = new Intent(getApplicationContext(), Admin.class);
                                        startActivity(intent);
                                        finish();

                                    } else {
                                        // If sign in fails, display a message to the user.
                                        progressbar.setVisibility(View.GONE);
                                        Toast.makeText(addAccount.this, "Failed",
                                                Toast.LENGTH_SHORT).show();

                                    }
                                }
                            });

                }
            });
        }
    }