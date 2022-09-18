package com.itcraftsolution.keepnotes.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.itcraftsolution.keepnotes.R;
import com.itcraftsolution.keepnotes.databinding.FragmentBlogsBinding;

public class BlogsFragment extends Fragment {


    public BlogsFragment() {
        // Required empty public constructor
    }

    private FragmentBlogsBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentBlogsBinding.inflate(getLayoutInflater());

        binding.include.txHeaderName.setText("Blogs");


        return binding.getRoot();
    }
}