package com.itcraftsolution.keepnotes.ViewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.itcraftsolution.keepnotes.Database.TBLNotes;
import com.itcraftsolution.keepnotes.Repository.NoteRepository;

import java.util.List;

public class NoteViewModel extends AndroidViewModel {
    private NoteRepository noteRepository;

    public NoteViewModel(@NonNull Application application) {
        super(application);

        //Pass Context in NoteRepository
        noteRepository = new NoteRepository(application);
    }

    public LiveData<List<TBLNotes>> getAllNote(){
        return noteRepository.getAllNote();
    }

    public void addNote(TBLNotes tblNotes){
        noteRepository.addNote(tblNotes);
    }

    public void updateNote(TBLNotes tblNotes){

    }

    public void deleteNote(TBLNotes tblNotes){

    }


}
