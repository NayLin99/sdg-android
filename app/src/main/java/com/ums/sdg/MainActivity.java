package com.ums.sdg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.ums.sdg.adapter.SDG_Adapter;
import com.ums.sdg.model.data.SDG_Goal;

import java.nio.file.SecureDirectoryStream;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    private SDG_Goal sdg_goal;
    private SDG_Adapter sdg_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView =findViewById(R.id.rv);
        sdg_adapter = new SDG_Adapter(getApplicationContext(),loadData());
        recyclerView.setLayoutManager(new GridLayoutManager(getBaseContext(), 2));
        recyclerView.setAdapter(sdg_adapter);
    }

    private ArrayList<SDG_Goal> loadData() {
        ArrayList<SDG_Goal> sArray = new ArrayList<>();
        sArray.add(new SDG_Goal(getResources().getDrawable(R.drawable.goal1), "", "", ""));
        sArray.add(new SDG_Goal(getResources().getDrawable(R.drawable.goal2), "", "", ""));
        sArray.add(new SDG_Goal(getResources().getDrawable(R.drawable.goal3), "", "", ""));
        sArray.add(new SDG_Goal(getResources().getDrawable(R.drawable.goal4), "", "", ""));
        sArray.add(new SDG_Goal(getResources().getDrawable(R.drawable.goal5), "", "", ""));
        sArray.add(new SDG_Goal(getResources().getDrawable(R.drawable.goal6), "", "", ""));
        sArray.add(new SDG_Goal(getResources().getDrawable(R.drawable.goal7), "", "", ""));
        sArray.add(new SDG_Goal(getResources().getDrawable(R.drawable.goal8), "", "", ""));
        sArray.add(new SDG_Goal(getResources().getDrawable(R.drawable.goal9), "", "", ""));
        sArray.add(new SDG_Goal(getResources().getDrawable(R.drawable.goal10), "", "", ""));
        sArray.add(new SDG_Goal(getResources().getDrawable(R.drawable.goal11), "", "", ""));
        sArray.add(new SDG_Goal(getResources().getDrawable(R.drawable.goal12), "", "", ""));
        sArray.add(new SDG_Goal(getResources().getDrawable(R.drawable.goal13), "", "", ""));
        sArray.add(new SDG_Goal(getResources().getDrawable(R.drawable.goal14), "", "", ""));
        sArray.add(new SDG_Goal(getResources().getDrawable(R.drawable.goal15), "", "", ""));
        sArray.add(new SDG_Goal(getResources().getDrawable(R.drawable.goal16), "", "", ""));
        sArray.add(new SDG_Goal(getResources().getDrawable(R.drawable.goal17), "", "", ""));

        return sArray;
    }
}
