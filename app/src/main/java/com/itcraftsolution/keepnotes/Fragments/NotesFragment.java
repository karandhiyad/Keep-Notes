package com.itcraftsolution.keepnotes.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayoutMediator;
import com.itcraftsolution.keepnotes.ViewPagerAdapter.NotesViewPagerAdapter;
import com.itcraftsolution.keepnotes.databinding.FragmentNotesBinding;

public class NotesFragment extends Fragment {

    public NotesFragment() {
        // Required empty public constructor
    }

    private FragmentNotesBinding binding;
    private String [] Title=new String[]{"All","Folder"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentNotesBinding.inflate(getLayoutInflater());

        binding.include.txHeaderName.setText("Notes");


        try {
            NotesViewPagerAdapter notesViewPagerAdapter = new NotesViewPagerAdapter(getActivity());
            binding.viewpager.setAdapter(notesViewPagerAdapter);

            new TabLayoutMediator(binding.tablayout, binding.viewpager, (((tab, position) -> tab.setText(Title[position])))).attach();
        } catch (Exception e) {
            e.printStackTrace();
            Log.e("NotesFragment", e.toString());
        }

        return binding.getRoot();
    }
}