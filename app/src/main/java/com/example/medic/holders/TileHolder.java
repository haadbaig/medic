package com.example.medic.holders;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.medic.R;

public class TileHolder extends RecyclerView.ViewHolder {
    public ImageView img;
    public TextView hd;
    public TileHolder(@NonNull View itemView) {
        super(itemView);
        img = (ImageView)itemView.findViewById(R.id.categoryImage);
        hd = (TextView)itemView.findViewById(R.id.categoryName);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(hd.getContext(), hd.getText(), Toast.LENGTH_LONG).show();
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
