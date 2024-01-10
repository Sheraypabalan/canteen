package com.example.canteenmealreservationadmin;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;

public class Admin extends AppCompatActivity {

    private Button add,view,account,logout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        setContentView(R.layout.activity_admin);
        add = findViewById(R.id.add);
        view = findViewById(R.id.view);
        account = findViewById(R.id.account);
        logout = findViewById(R.id.logout);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Admin.this,addFood.class);
                startActivity(intent);
                finish();
            }
        });
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Admin.this,viewReservation.class);
                startActivity(intent);
                finish();
            }
        });
        account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Admin.this,addAccount.class);
                startActivity(intent);
                finish();
            }
        });
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Admin.this,Login.class);
                startActivity(intent);
                finish();
            }
        });

    }
}