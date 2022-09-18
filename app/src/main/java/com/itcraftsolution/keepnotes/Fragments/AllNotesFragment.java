package com.itcraftsolution.keepnotes.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.itcraftsolution.keepnotes.Adapter.AllNotesAdapter;
import com.itcraftsolution.keepnotes.Database.TBLNotes;
import com.itcraftsolution.keepnotes.R;
import com.itcraftsolution.keepnotes.ViewModel.NoteViewModel;
import com.itcraftsolution.keepnotes.databinding.FragmentAllNotesBinding;

import java.util.List;

public class AllNotesFragment extends Fragment {


    public AllNotesFragment() {
        // Required empty public constructor
    }

    private FragmentAllNotesBinding binding;
    private NoteViewModel noteViewModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentAllNotesBinding.inflate(getLayoutInflater());

        //Pass Context to NoteViewModel
        noteViewModel = new ViewModelProvider(this).get(NoteViewModel.class);

        binding.btnAddNotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getParentFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frMainContainer, new AddNotesFragment())
                        .addToBackStack(null).commit();
            }
        });

        try {
            SetAllNotesRecyclerView();
        }catch (Exception e){
            e.printStackTrace();
            Log.e("SetAllNotesRecyclerView",e.toString());
        }


        return binding.getRoot();
    }

    private void SetAllNotesRecyclerView() {

        AllNotesAdapter allNotesAdapter = new AllNotesAdapter();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),1);
        binding.rvAllNotes.setAdapter(allNotesAdapter);
        binding.rvAllNotes.setLayoutManager(gridLayoutManager);

        noteViewModel.getAllNote().observe(getViewLifecycleOwner(), new Observer<List<TBLNotes>>() {
            @Override
            public void onChanged(List<TBLNotes> tblNotes) {
                allNotesAdapter.submitList(tblNotes);
            }
        });


    }
}