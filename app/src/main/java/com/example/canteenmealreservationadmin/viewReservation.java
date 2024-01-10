package com.example.canteenmealreservationadmin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toolbar;

public class viewReservation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_reservation);
        ImageButton button = findViewById(R.id.out);
        TextView title = findViewById(R.id.title_toolbar);
        title.setText("VIEW RESERVATIONS");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(viewReservation.this,Admin.class);
                startActivity(intent);
                finish();
            }
        });
    }
}