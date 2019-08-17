package com.ums.sdg;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ums.sdg.adapter.SDG_Adapter;
import com.ums.sdg.model.data.SDG_Goal;

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
        sdg_adapter = new SDG_Adapter(getApplicationContext(),Util.loadData(this));
        recyclerView.setLayoutManager(new GridLayoutManager(getBaseContext(), 2));
        recyclerView.setAdapter(sdg_adapter);
    }


}
