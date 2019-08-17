package com.ums.sdg.model.data.repository;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import com.ums.sdg.model.data.SDGNoteVO;
import com.ums.sdg.model.data.daos.SDGNoteDao;
import com.ums.sdg.model.data.db.SDGDatabase;

import java.util.List;

public class SDGNoteRepository {

    private SDGNoteDao sdgNoteDao;
    private LiveData<List<SDGNoteVO>> sdgNoteList;
    private SDGDatabase sdgDatabase;

    public SDGNoteRepository(Application application) {

        sdgDatabase = SDGDatabase.getInstance(application.getApplicationContext());
        sdgNoteDao = sdgDatabase.sdgNoteDao();
        sdgNoteList = sdgNoteDao.getAllSDGNotes();

    }

    public void insert(SDGNoteVO sdgNoteVO){
//        sdgDatabase.sdgNoteDao().sdgAddNote(sdgNoteVO);
        new InsertNoteAsyncTask(sdgNoteDao, sdgNoteVO).execute();
    }

    public LiveData<List<SDGNoteVO>> getAllNote(){
        return sdgNoteList;
    }

    public class InsertNoteAsyncTask extends AsyncTask<Void, Void, SDGNoteVO>{
        private SDGNoteDao sdgNoteDao;
        private SDGNoteVO sdgNoteVO;
        public InsertNoteAsyncTask(SDGNoteDao sdgNoteDao, SDGNoteVO sdgNoteVO) {
            this.sdgNoteDao = sdgNoteDao;
            this.sdgNoteVO = sdgNoteVO;
        }


        @Override
        protected SDGNoteVO doInBackground(Void... voids) {
            sdgNoteDao.sdgAddNote(sdgNoteVO);
            return sdgNoteVO;
        }
    }


}
