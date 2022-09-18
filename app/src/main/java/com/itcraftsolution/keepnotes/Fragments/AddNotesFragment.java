package com.itcraftsolution.keepnotes.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.itcraftsolution.keepnotes.Database.DatabaseHelper;
import com.itcraftsolution.keepnotes.Database.TBLNotes;
import com.itcraftsolution.keepnotes.R;
import com.itcraftsolution.keepnotes.ViewModel.NoteViewModel;
import com.itcraftsolution.keepnotes.databinding.FragmentAddNotesBinding;

public class AddNotesFragment extends Fragment {

    public AddNotesFragment() {
        // Required empty public constructor
    }

    private FragmentAddNotesBinding binding;
    private NoteViewModel noteViewModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentAddNotesBinding.inflate(getLayoutInflater());

        //Pass Context to NoteViewModel
        noteViewModel = new ViewModelProvider(this).get(NoteViewModel.class);

        binding.include.txToolbarTitle.setText("Notes");

        binding.include.btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getParentFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frMainContainer, new NotesFragment())
                        .addToBackStack(null).commit();
            }
        });

        binding.include.btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        binding.include.txDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (binding.etNoteTitle.getText().toString().trim().equals("")){
                    binding.etNoteTitle.setError("Please Enter Note Title.");
                }else if (binding.etNoteText.getText().toString().trim().equals("")){
                    binding.etNoteText.setError("Please Enter Note Text.");
                }else {
                    try {
                        String NoteTitle = binding.etNoteTitle.getText().toString().trim();
                        String NoteText = binding.etNoteText.getText().toString().trim();
                        SaveNotes(NoteTitle,NoteText);
                    }catch (Exception e){
                        e.printStackTrace();
                        Log.e("SaveNotes",e.toString());
                    }
                }
            }
        });

        return binding.getRoot();
    }

    private void SaveNotes(String Title,String Text) {
        TBLNotes tblNotes = new TBLNotes(Title,Text,System.currentTimeMillis()/1000);
        noteViewModel.addNote(tblNotes);

        FragmentTransaction fragmentTransaction = getParentFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frMainContainer, new NotesFragment())
                .addToBackStack(null).commit();
    }
}