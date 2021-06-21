package com.example.project.models;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class Doctor_gig {

    String description;
    String doctor_specalization;
    String title;
    String name;

    Doctor_gig() {

    }

    public Doctor_gig(String disc, String spec, String title, String name) {
        this.description = disc;
        this.doctor_specalization = spec;
        this.title = title;
        this.name = name;
    }

    void StoreData() {
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        DatabaseReference root = db.getReference().child("doctor_data");

        HashMap<String, String> userMap = new HashMap<>();
        userMap.put("description", this.description);
        userMap.put("doctor_specalization", this.doctor_specalization);
        userMap.put("title", this.title);
        userMap.put("name", this.name);

        root.push().setValue(userMap);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDoctor_specalization() {
        return doctor_specalization;
    }

    public void setDoctor_specalization(String doctor_specalization) {
        this.doctor_specalization = doctor_specalization;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
