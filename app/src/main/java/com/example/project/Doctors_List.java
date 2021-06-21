package com.example.project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.project.adapters.DoctorTileAdapter;
import com.example.project.models.Doctor;
import com.example.project.models.Doctor_gig;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class Doctors_List extends AppCompatActivity {

    DoctorTileAdapter dta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        String cat = (String)getIntent().getStringExtra("category");
        Toast.makeText(this,cat,Toast.LENGTH_LONG).show();
        setContentView(R.layout.activity_doctors);
        RecyclerView populateList = (RecyclerView) findViewById(R.id.doctorList);
        populateList.setLayoutManager(new LinearLayoutManager(this));

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
                dta = new DoctorTileAdapter(dgList);
                populateList.setAdapter(dta);

                Log.println(Log.DEBUG,"afterretreivedatasdf**", "" + dgList.size());
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }

    public ArrayList<Doctor> populateList(){
        ArrayList<Doctor> temp = new ArrayList<Doctor>();
        Doctor obj = new Doctor();
        obj.setter("John Doe",null,5,"I am Cardiologist","Cardiologist");
        temp.add(obj);
        obj = new Doctor();
        obj.setter("John Mace",null,4,"I am Pediatrician","Pediatrician");
        temp.add(obj);
        obj = new Doctor();
        obj.setter("Sara John",null,3,"I am Gynaecologist","Gynaecologist");
        temp.add(obj);
        obj = new Doctor();
        obj.setter("Doe John",null,2,"I am Dermatologist","Dermatologist");
        temp.add(obj);

        return temp;
    }

}



