package com.ums.sdg;

import android.content.Context;

import com.ums.sdg.model.data.SDG_Goal;

import java.util.ArrayList;

public class Util {


    public static ArrayList<SDG_Goal> loadData(Context context) {
        ArrayList<SDG_Goal> sArray = new ArrayList<>();
        sArray.add(new SDG_Goal(context.getResources().getDrawable(R.drawable.goal1), "a", "a", "a"));
        sArray.add(new SDG_Goal(context.getResources().getDrawable(R.drawable.goal2), "b", "b", "b"));
        sArray.add(new SDG_Goal(context.getResources().getDrawable(R.drawable.goal3), "c", "c", "c"));
        sArray.add(new SDG_Goal(context.getResources().getDrawable(R.drawable.goal4), "", "", ""));
        sArray.add(new SDG_Goal(context.getResources().getDrawable(R.drawable.goal5), "", "", ""));
        sArray.add(new SDG_Goal(context.getResources().getDrawable(R.drawable.goal6), "", "", ""));
        sArray.add(new SDG_Goal(context.getResources().getDrawable(R.drawable.goal7), "", "", ""));
        sArray.add(new SDG_Goal(context.getResources().getDrawable(R.drawable.goal8), "", "", ""));
        sArray.add(new SDG_Goal(context.getResources().getDrawable(R.drawable.goal9), "", "", ""));
        sArray.add(new SDG_Goal(context.getResources().getDrawable(R.drawable.goal10), "", "", ""));
        sArray.add(new SDG_Goal(context.getResources().getDrawable(R.drawable.goal11), "", "", ""));
        sArray.add(new SDG_Goal(context.getResources().getDrawable(R.drawable.goal12), "", "", ""));
        sArray.add(new SDG_Goal(context.getResources().getDrawable(R.drawable.goal13), "", "", ""));
        sArray.add(new SDG_Goal(context.getResources().getDrawable(R.drawable.goal14), "", "", ""));
        sArray.add(new SDG_Goal(context.getResources().getDrawable(R.drawable.goal15), "", "", ""));
        sArray.add(new SDG_Goal(context.getResources().getDrawable(R.drawable.goal16), "", "", ""));
        sArray.add(new SDG_Goal(context.getResources().getDrawable(R.drawable.goal17), "", "", ""));

        return sArray;
    }

}
