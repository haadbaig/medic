package com.example.project.models;
import android.util.Log;

import androidx.annotation.NonNull;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DBHandler {

  FirebaseDatabase db;
  DatabaseReference ref;
  public DBHandler(){
  }

  public ArrayList<Doctor_gig> getDoctorGig(){
    ArrayList<Doctor_gig> dgList = new ArrayList<>();

    FirebaseDatabase db = FirebaseDatabase.getInstance();
    DatabaseReference ref = db.getReference("doctor_data");
    ref.addValueEventListener(new ValueEventListener() {

      final String[] description = {null};
      final String[] doctor_specalization = {null};
      final String[] name = {null};
      final String[] title = {null};

      @Override
      public void onDataChange(@NonNull DataSnapshot snapshot) {
        for (DataSnapshot snapsho1t : snapshot.getChildren()) {

          description[0] =  snapsho1t.child("description").getValue().toString();
          doctor_specalization[0] = snapsho1t.child("doctor_specalization").getValue().toString();
          name[0] = snapsho1t.child("name").getValue().toString();
          title[0] = snapsho1t.child("title").getValue().toString();

          Doctor_gig temp = new Doctor_gig(description[0], doctor_specalization[0], name[0], title[0]);
          dgList.add(temp);
        }

        Log.println(Log.DEBUG,"afterretreivedatasdf**", "" + dgList.size());
      }

      @Override
      public void onCancelled(@NonNull DatabaseError error) {

      }
//        Log.d("DB Dat: ", "Value is: " + value);

    });
    return dgList;
  }
}
