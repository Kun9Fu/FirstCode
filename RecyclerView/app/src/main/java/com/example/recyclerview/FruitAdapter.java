package com.example.recyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class FruitAdapter extends RecyclerView.ViewHolder {
    ImageView fruitImage;
    TextView fruitName;

    public ViewHolder(View view){
        super(view);
        fruitImage=(ImageView) view.findViewById(R.id.fruit_image);
        fruitName=(TextView) view.findViewById(R.id.fruit_name);
    }
}


