package com.example.medic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.medic.models.Doctor;

public class Doctors_Gig extends AppCompatActivity {

  ImageView dp;
  TextView name;
  TextView specaiality;
  TextView desc;
  RatingBar rb;
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_doctors_gig);
    dp = (ImageView) findViewById(R.id.docprofileimage);
    name = (TextView) findViewById((R.id.name));
    specaiality = (TextView) findViewById(R.id.specialization);
    desc = (TextView) findViewById(R.id.desc);
    rb = (RatingBar) findViewById(R.id.ratingBar);
    Doctor dc= (Doctor)getIntent().getSerializableExtra("Doctor");
    Log.d("Doctor", dc.getName());
    name.setText(dc.getName());
    specaiality.setText(dc.getSpecialization());
    desc.setText(dc.getDesc());
    rb.setRating(dc.getRating());

  }
}