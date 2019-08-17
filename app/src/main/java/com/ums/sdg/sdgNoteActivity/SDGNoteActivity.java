package com.ums.sdg.sdgNoteActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.ums.sdg.R;
import com.ums.sdg.model.data.SDGNoteVO;

import java.util.List;

public class SDGNoteActivity extends AppCompatActivity {

    private SDGNoteViewModel viewModel;

    private EditText edtTitle;
    private EditText edtDesc;
    private Button btnSave;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sdgnote);

        edtTitle = findViewById(R.id.edtNoteTitle);
        edtDesc = findViewById(R.id.edtNoteDesc);
        btnSave = findViewById(R.id.btnSave);

        viewModel = ViewModelProviders.of(this).get(SDGNoteViewModel.class);
        viewModel.getAllNote().observe(this, new Observer<List<SDGNoteVO>>() {
            @Override
            public void onChanged(List<SDGNoteVO> noteList) {
                Log.d("TAG", "onChanged: " + noteList.size());
            }
        });

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                SDGNoteVO sdgNote = new SDGNoteVO(edtTitle.getText().toString(), edtDesc.getText().toString());
                viewModel.insertSDGNote(sdgNote);
            }
        });


    }
}
