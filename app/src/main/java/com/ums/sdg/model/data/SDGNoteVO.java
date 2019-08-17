package com.ums.sdg.model.data;


import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "sdg_notes")
public class SDGNoteVO {
    @PrimaryKey(autoGenerate = true)
    private int id;

    private String title;
    private String desc;

    public SDGNoteVO(String title, String desc) {
        this.title = title;
        this.desc = desc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
