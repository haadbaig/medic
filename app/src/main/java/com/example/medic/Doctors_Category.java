package com.example.medic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.medic.adapters.TileAdapter;

import java.util.ArrayList;

public class Doctors_Category extends AppCompatActivity {
    TileAdapter ta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctors_category);
        RecyclerView populateList = (RecyclerView) findViewById(R.id.RecyclerList);
        populateList.setLayoutManager(new LinearLayoutManager(this));
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Gynecologist");
        arr.add("Cardiologist");
        arr.add("Dermatologist");
        arr.add("Pediatrician");
        ta = new TileAdapter(arr);
        populateList.setAdapter(ta);
    }
}