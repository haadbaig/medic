package com.example.project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

import com.example.project.models.DBHandler;
import com.example.project.models.Doctor_gig;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

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
                Intent i = new Intent(ServiceMenu.this, Doctors_Category.class);
                i.putExtra("User", "email, password");
                startActivity(i);
            }
        });
        med.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ServiceMenu.this, Medicines.class);
                i.putExtra("User", "email, password");
                startActivity(i);
            }
        });
    }


}