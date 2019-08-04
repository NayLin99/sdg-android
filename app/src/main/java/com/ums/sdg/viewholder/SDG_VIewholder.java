package com.ums.sdg.viewholder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.ums.sdg.R;
import com.ums.sdg.model.data.SDG_Goal;

import java.util.ArrayList;

public class SDG_VIewholder extends RecyclerView.ViewHolder {
    ImageView img;
    ArrayList<SDG_Goal> s = null;
    public SDG_VIewholder(@NonNull View itemView,ArrayList<SDG_Goal> sdg) {
        super(itemView);
        img =itemView.findViewById(R.id.img);
        s = sdg;
    }
    public void bind(int position){
        img.setImageDrawable(s.get(position).getImage());
    }

}
