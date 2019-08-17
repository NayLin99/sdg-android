package com.ums.sdg.model.data.db;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.ums.sdg.model.data.SDGNoteVO;
import com.ums.sdg.model.data.daos.SDGNoteDao;

@Database(entities = {SDGNoteVO.class}, version = 1)
public abstract class SDGDatabase extends RoomDatabase {

    public abstract SDGNoteDao sdgNoteDao();
    private static SDGDatabase instance;

    public static SDGDatabase getInstance(Context context) {
        if( instance == null ){
            synchronized (SDGDatabase.class){
                instance = Room.databaseBuilder(context.getApplicationContext(), SDGDatabase.class, "sdg_database")
                        .fallbackToDestructiveMigration()
                        .build();

            }
        }
        return instance;
    }
}
