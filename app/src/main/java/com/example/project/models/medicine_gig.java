package com.example.project;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class medicine_gig {

    String medicine_name;
    String pharmacy_name;
    String medicine_size;
    String price;
    String quantity;

    medicine_gig() {

    }

    medicine_gig(String med_name, String pharmacy_name, String med_size,  String price, String Quantity) {
        this.medicine_name = med_name;
        this.pharmacy_name = pharmacy_name;
        this.medicine_size = med_size;
        this.price = price;
        this.quantity = Quantity;
    }

    void StoreData() {
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        DatabaseReference root = db.getReference().child("medicine_data");

        HashMap<String, String> userMap = new HashMap<>();
        userMap.put("medicine_name", this.medicine_name);
        userMap.put("pharmacy_name", this.pharmacy_name);
        userMap.put("medicine_size", this.medicine_size);
        userMap.put("price", this.price);
        userMap.put("quantity", this.quantity);

        root.push().setValue(userMap);
    }
}
