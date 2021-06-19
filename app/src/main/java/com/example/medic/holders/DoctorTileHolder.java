package com.example.medic.holders;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.medic.Doctors_Gig;
import com.example.medic.R;
import com.example.medic.models.Doctor;

import java.io.Serializable;

import static java.lang.Integer.parseInt;

public class DoctorTileHolder extends RecyclerView.ViewHolder {
    public ImageView dp;
    public TextView name;
    public TextView specialization;
    public TextView rating;
    public  String desc;

    public DoctorTileHolder(@NonNull View itemView) {
        super(itemView);
        dp = (ImageView)itemView.findViewById(R.id.profileImage);
        name = (TextView)itemView.findViewById(R.id.name);
        specialization = (TextView)itemView.findViewById(R.id.specialization);
        rating = (TextView)itemView.findViewById(R.id.rating);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(dp.getContext(), name.getText(), Toast.LENGTH_LONG).show();
                Doctor dc = new Doctor();
                desc = "I am a "+specialization.getText().toString()+". I ave been practicing my field in National Hospital since 10 years. I am eager to help people online. If you have any medical condition regarding  to my field, feel free to pin me up and book an appointment.";
                dc.setter(name.getText().toString(),null,parseInt(rating.getText().toString()), desc ,specialization.getText().toString(),null);
                Intent i = new Intent(dp.getContext(), Doctors_Gig.class);
                i.putExtra("Doctor", (Serializable) dc);
                dp.getContext().startActivity(i);
            }
        });
    }

    public TextView getName() {
        return name;
    }

    public TextView getSpecialization(){ return specialization; }

    public TextView getRating(){ return rating; }


}
