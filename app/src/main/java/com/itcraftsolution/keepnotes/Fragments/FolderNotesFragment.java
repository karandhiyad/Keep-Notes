package com.itcraftsolution.keepnotes.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.itcraftsolution.keepnotes.R;
import com.itcraftsolution.keepnotes.databinding.FragmentFolderNotesBinding;

public class FolderNotesFragment extends Fragment {


    public FolderNotesFragment() {
        // Required empty public constructor
    }

    private FragmentFolderNotesBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentFolderNotesBinding.inflate(getLayoutInflater());




        return binding.getRoot();
    }
}