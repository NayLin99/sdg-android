package com.ums.sdg.viewholder;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.ums.sdg.MainActivity;
import com.ums.sdg.R;
import com.ums.sdg.SDGDetailActivity;
import com.ums.sdg.model.data.SDG_Goal;

import java.util.ArrayList;

import static androidx.constraintlayout.widget.Constraints.TAG;

public class SDG_VIewholder extends RecyclerView.ViewHolder {
    ImageView img;
    ArrayList<SDG_Goal> s = null;
    int pos;
    public SDG_VIewholder(@NonNull final View itemView, ArrayList<SDG_Goal> sdg) {
        super(itemView);
        img =itemView.findViewById(R.id.img);
        s = sdg;

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: pos"+pos);
                itemView.getContext().startActivity(SDGDetailActivity.newIntent(itemView.getContext(), pos));
            }
        });
    }
    public void bind(int position){
        this.pos = position;
        img.setImageDrawable(s.get(position).getImage());
    }



}
