package com.example.medic.holders;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.medic.Doctors_List;
import com.example.medic.R;

public class TileHolder extends RecyclerView.ViewHolder {
    public ImageView img;
    public TextView hd;
    public TileHolder(@NonNull View itemView) {
        super(itemView);
        img = (ImageView)itemView.findViewById(R.id.profileImage);
        hd = (TextView)itemView.findViewById(R.id.name);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(hd.getContext(), hd.getText(), Toast.LENGTH_LONG).show();
                Intent i = new Intent(hd.getContext(), Doctors_List.class);
                i.putExtra("category", hd.getText());
                hd.getContext().startActivity(i);
            }
        });
    }

    public ImageView getImageView() {
        return img;
    }

    public TextView getTextView(){
        return hd;
    }

}
