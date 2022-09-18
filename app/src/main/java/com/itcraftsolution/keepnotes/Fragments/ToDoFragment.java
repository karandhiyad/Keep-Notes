package com.itcraftsolution.keepnotes.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.itcraftsolution.keepnotes.R;
import com.itcraftsolution.keepnotes.databinding.FragmentToDoBinding;

public class ToDoFragment extends Fragment {

    public ToDoFragment() {
        // Required empty public constructor
    }

    private FragmentToDoBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentToDoBinding.inflate(getLayoutInflater());

        binding.include.txHeaderName.setText("To Do");


        return binding.getRoot();
    }
}