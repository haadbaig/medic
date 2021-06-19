package com.example.medic.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.medic.R;
import com.example.medic.holders.DoctorTileHolder;
import com.example.medic.holders.TileHolder;
import com.example.medic.models.Doctor;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class DoctorTileAdapter extends RecyclerView.Adapter<DoctorTileHolder> {
    @NonNull
    @NotNull
    ArrayList<Doctor> doctorsList;

    public DoctorTileAdapter(ArrayList<Doctor> arr) {
        this.doctorsList=arr;
    }

    public DoctorTileHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.doctors_tile,parent,false);
        return new DoctorTileHolder(view);    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull DoctorTileHolder holder, int position) {
        holder.name.setText(doctorsList.get(position).getName());
        holder.specialization.setText(doctorsList.get(position).getSpecialization());
        holder.rating.setText(String.valueOf(doctorsList.get(position).getRating()));
        Context con = holder.getName().getContext();
        Log.d("ContextName", con.toString());
            int id = con.getResources().getIdentifier("doc",
                    "drawable", con.getPackageName());
            holder.dp.setImageResource(id);

    }

    @Override
    public int getItemCount() {
        return doctorsList.size();
    }
}
