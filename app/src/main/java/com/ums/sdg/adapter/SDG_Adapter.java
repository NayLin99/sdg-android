package com.ums.sdg.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ums.sdg.R;
import com.ums.sdg.model.data.SDG_Goal;
import com.ums.sdg.viewholder.SDG_VIewholder;

import java.util.ArrayList;

public class SDG_Adapter extends RecyclerView.Adapter<SDG_VIewholder> {
    private LayoutInflater layoutInflater;
    private ArrayList<SDG_Goal> sdg = null;

    public SDG_Adapter(Context context,ArrayList<SDG_Goal> sdgGoal) {
        this.sdg = sdgGoal;
        layoutInflater=LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public SDG_VIewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = layoutInflater.inflate(R.layout.view_item_sdg,viewGroup,false);
        return new SDG_VIewholder(v,sdg);
    }

    @Override
    public void onBindViewHolder(@NonNull SDG_VIewholder sdg_vIewholder, int i) {
        sdg_vIewholder.bind(i);
    }

    @Override
    public int getItemCount() {
        return sdg.size();
    }
}
