package com.example.medic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.medic.adapters.TileAdapter;

import java.util.ArrayList;

public class medicines extends AppCompatActivity {
    TileAdapter ta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicines);
        RecyclerView populateList = (RecyclerView) findViewById(R.id.RecyclerList);
        populateList.setLayoutManager(new LinearLayoutManager(this));
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Panadol");
        arr.add("Augmentin");
        arr.add("Zyloric");
        arr.add("Lasoride");
        ta = new TileAdapter(arr);
        populateList.setAdapter(ta);
    }
}