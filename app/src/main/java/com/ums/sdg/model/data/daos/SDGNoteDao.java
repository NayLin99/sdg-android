package com.ums.sdg.model.data.daos;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.ums.sdg.model.data.SDGNoteVO;

import java.util.List;

@Dao
public interface SDGNoteDao {

    @Insert
    void sdgAddNote(SDGNoteVO sdgNote);

    @Query("select * from sdg_notes")
    LiveData<List<SDGNoteVO>> getAllSDGNotes();

}
