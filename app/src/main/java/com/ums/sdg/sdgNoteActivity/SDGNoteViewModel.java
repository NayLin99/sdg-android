package com.ums.sdg.sdgNoteActivity;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.ums.sdg.model.data.SDGNoteVO;
import com.ums.sdg.model.data.repository.SDGNoteRepository;

import java.util.List;

public class SDGNoteViewModel extends AndroidViewModel {

    private SDGNoteRepository repository;
    private LiveData<List<SDGNoteVO>> allNote;

    public SDGNoteViewModel(@NonNull Application application) {
        super(application);
        repository = new SDGNoteRepository(application);
        allNote = repository.getAllNote();
    }

    public void insertSDGNote(SDGNoteVO sdgNote){
        repository.insert(sdgNote);
    }

    public LiveData<List<SDGNoteVO>> getAllNote() {
        return allNote;
    }
}
