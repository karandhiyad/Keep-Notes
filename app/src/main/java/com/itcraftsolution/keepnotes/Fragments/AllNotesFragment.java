package com.itcraftsolution.keepnotes.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.itcraftsolution.keepnotes.R;
import com.itcraftsolution.keepnotes.databinding.FragmentAllNotesBinding;

public class AllNotesFragment extends Fragment {


    public AllNotesFragment() {
        // Required empty public constructor
    }

    private FragmentAllNotesBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentAllNotesBinding.inflate(getLayoutInflater());




        return binding.getRoot();
    }
}