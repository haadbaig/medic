package com.example.medic.holders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.medic.R;

public class DoctorTileHolder extends RecyclerView.ViewHolder {
    public ImageView dp;
    public TextView name;
    public TextView specialization;
    public TextView rating;

    public DoctorTileHolder(@NonNull View itemView) {
        super(itemView);
        dp = (ImageView)itemView.findViewById(R.id.profileImage);
        name = (TextView)itemView.findViewById(R.id.name);
        specialization = (TextView)itemView.findViewById(R.id.specialization);
        rating = (TextView)itemView.findViewById(R.id.rating);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(dp.getContext(), name.getText(), Toast.LENGTH_LONG).show();
            }
        });
    }

    public TextView getName() {
        return name;
    }

    public TextView getSpecialization(){ return specialization; }

    public TextView getRating(){ return rating; }


}
