package com.example.medic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.medic.adapters.DoctorTileAdapter;
import com.example.medic.models.Doctor;

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
        dta = new DoctorTileAdapter(populateList());
        populateList.setAdapter(dta);
    }

    public ArrayList<Doctor> populateList(){
        ArrayList<Doctor> temp = new ArrayList<Doctor>();
        Doctor obj = new Doctor();
        obj.setter("John Doe",null,5,"I am Cardiologist","Cardiologist",null);
        temp.add(obj);
        obj = new Doctor();
        obj.setter("John Mace",null,5,"I am Pediatrician","Pediatrician",null);
        temp.add(obj);
        obj = new Doctor();
        obj.setter("Sara John",null,5,"I am Gynaecologist","Gynaecologist",null);
        temp.add(obj);
        obj = new Doctor();
        obj.setter("Doe John",null,5,"I am Dermatologist","Dermatologist",null);
        temp.add(obj);

        return temp;
    }

}



