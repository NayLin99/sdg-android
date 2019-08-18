package com.ums.sdg;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.ums.sdg.model.data.SDGNoteVO;

public class SDGDetailActivity extends AppCompatActivity {

    private int position = 0;

    private WebView tvFact;
    private WebView tvGoal;
    private WebView tvLink;
    private ImageView iv;
    private TextView tvLblFacts;
    private TextView tvLblTargets;
    private TextView tvLblLinks;
    public static Intent newIntent(Context context, int pos) {
        Intent i = new Intent(context, SDGDetailActivity.class);
        i.putExtra("POSITION", pos);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        return i;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sdgdetail);

        tvFact = findViewById(R.id.tvFactsAndFigures);
        tvGoal = findViewById(R.id.tvGoal);
        tvLink = findViewById(R.id.tvLink);
        iv = findViewById(R.id.ivTitle);
        tvLblFacts = findViewById(R.id.tvLblFact);
        tvLblTargets = findViewById(R.id.tvLblTargets);
        tvLblLinks = findViewById(R.id.tvLblLinks);


        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                position = 0;
            } else {
                position= extras.getInt("POSITION");
            }
        } else {
            position= (Integer) savedInstanceState.getSerializable("POSITION");
        }



        tvFact.loadData(Util.loadData(this).get(position).getFactsAndFigures(),"text/html; charset=UTF-8", null);
        tvGoal.loadData(Util.loadData(this).get(position).getTarget(), "text/html; charset=UTF-8", null);
        tvLink.loadData(Util.loadData(this).get(position).getLinks(), "text/html; charset=UTF-8", null);
        iv.setImageDrawable(Util.loadData(this).get(position).getImage());
        tvLblTargets.setTextColor(getResources().getIntArray(R.array.sdgcolors)[position]);
        tvLblFacts.setTextColor(getResources().getIntArray(R.array.sdgcolors)[position]);
        tvLblLinks.setTextColor(getResources().getIntArray(R.array.sdgcolors)[position]);


    }
}
