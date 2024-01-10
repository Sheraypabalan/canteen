package com.example.canteenmealreservationadmin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
        import android.content.Intent;
        import android.view.View;
        import android.widget.ImageButton;
        import android.widget.TextView;


public class addFood extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_food);
        ImageButton button = findViewById(R.id.out);
        TextView title = findViewById(R.id.title_toolbar);
        title.setText("ADD FOOD");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(addFood.this,Admin.class);
                startActivity(intent);
                finish();
            }
        });
    }
}