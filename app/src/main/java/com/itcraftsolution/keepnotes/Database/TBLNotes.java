package com.itcraftsolution.keepnotes.Database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "TBLNotes")
public class TBLNotes {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private long id;

    @ColumnInfo(name = "title")
    private String title;

    @ColumnInfo(name = "text")
    private String text;

    @ColumnInfo(name = "folder")
    private String folder;

    @ColumnInfo(name = "pin")
    private boolean pin;

    @ColumnInfo(name = "time",defaultValue = "CURRENT_TIMESTAMP")
    private long time;

    public TBLNotes(String title, String text, String folder, boolean pin, long time) {
        this.title = title;
        this.text = text;
        this.folder = folder;
        this.pin = pin;
        this.time = time;
    }
    @Ignore
    public TBLNotes(String title, String text, long time) {
        this.title = title;
        this.text = text;
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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}
