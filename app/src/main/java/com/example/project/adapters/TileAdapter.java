package com.example.project.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project.R;
import com.example.project.holders.TileHolder;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class TileAdapter extends RecyclerView.Adapter<TileHolder> {

    ArrayList<String> categories;

    public TileAdapter(ArrayList<String> arr) {
        this.categories=arr;
    }

    @NonNull
    @NotNull
    @Override
    public TileHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.recycler_tile,parent,false);
        return new TileHolder(view);
    }

    public void onBindViewHolder(@NonNull TileHolder holder, int position) {
        holder.hd.setText(categories.get(position));
        Context con = holder.getTextView().getContext();
        Log.d("ContextName", con.toString());
        if(con.toString().contains("Doctors_Category")) {
            int id = con.getResources().getIdentifier(categories.get(position).toLowerCase(),
                    "drawable", con.getPackageName());
            holder.img.setImageResource(id);
        }else if(con.toString().contains("Medicines")){
            int id = con.getResources().getIdentifier("pills",
                    "drawable", con.getPackageName());
            holder.img.setImageResource(id);
        }
    }

    @Override
    public int getItemCount() {
        return categories.size();
    }
}