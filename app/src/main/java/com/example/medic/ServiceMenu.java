package com.example.medic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ServiceMenu extends AppCompatActivity {
    ImageButton med;
    ImageButton doc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_service);
        med = (ImageButton)findViewById(R.id.medicine);
        doc = (ImageButton)findViewById(R.id.doctor);
        doc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ServiceMenu.this, doctors.class);
                i.putExtra("User", "email, password");
                startActivity(i);
            }
        });
        med.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ServiceMenu.this, medicines.class);
                i.putExtra("User", "email, password");
                startActivity(i);
            }
        });
    }


}