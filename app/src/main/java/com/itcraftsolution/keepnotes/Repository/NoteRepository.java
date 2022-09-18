package com.itcraftsolution.keepnotes.Repository;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.itcraftsolution.keepnotes.Database.DatabaseHelper;
import com.itcraftsolution.keepnotes.Database.TBLNotes;

import java.util.List;

public class NoteRepository{
    private DatabaseHelper databaseHelper;

    public NoteRepository(Application application) {
        //Pass Context in DatabaseHelper
        databaseHelper = DatabaseHelper.databaseHelper(application);
    }

    public LiveData<List<TBLNotes>> getAllNote(){
        return databaseHelper.databaseInterface().getAllLiveTBLNotes();
    }

    public void addNote(TBLNotes tblNotes){

    }

    public void updateNote(TBLNotes tblNotes){

    }

    public void deleteNote(TBLNotes tblNotes){

    }
}
