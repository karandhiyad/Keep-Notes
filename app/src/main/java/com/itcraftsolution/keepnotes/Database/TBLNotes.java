package com.itcraftsolution.keepnotes.Database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "TBLNotes")
public class TBLNotes {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private long id;

    @ColumnInfo(name = "title")
    private String title;

    @ColumnInfo(name = "notes")
    private String notes;

    @ColumnInfo(name = "folder")
    private String folder;

    @ColumnInfo(name = "pin")
    private boolean pin;

    @ColumnInfo(name = "time",defaultValue = "CURRENT_TIMESTAMP")
    private String time;

    public TBLNotes(String title, String notes, String folder, boolean pin, String time) {
        this.title = title;
        this.notes = notes;
        this.folder = folder;
        this.pin = pin;
        this.time = time;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getFolder() {
        return folder;
    }

    public void setFolder(String folder) {
        this.folder = folder;
    }

    public boolean isPin() {
        return pin;
    }

    public void setPin(boolean pin) {
        this.pin = pin;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
