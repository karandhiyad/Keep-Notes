package com.itcraftsolution.keepnotes;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationBarView;
import com.itcraftsolution.keepnotes.Fragments.BlogsFragment;
import com.itcraftsolution.keepnotes.Fragments.NotesFragment;
import com.itcraftsolution.keepnotes.Fragments.ToDoFragment;
import com.itcraftsolution.keepnotes.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //Set DefaultFragment View
        try {
            defaultView();
        } catch (Exception e) {
            e.printStackTrace();
        }


        binding.mainBottomNav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment = null;
                switch (item.getItemId()) {
                    case R.id.bNavNotes:
                        selectedFragment = new NotesFragment();
                        break;
                    case R.id.bNavToDo:
                        selectedFragment = new ToDoFragment();
                        break;

                    case R.id.bNavBlogs:
                        selectedFragment = new BlogsFragment();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.frMainContainer, selectedFragment).addToBackStack(null).commit();
                return true;
            }
        });

    }

    private void defaultView() {
        FragmentTransaction firstFragment = getSupportFragmentManager().beginTransaction();
        firstFragment.replace(R.id.frMainContainer, new NotesFragment());
        firstFragment.commit();
    }


    public void onBackPressed() {
        if (binding.mainBottomNav.getSelectedItemId() == R.id.bNavNotes) {
            finish();
        } else {
            FragmentTransaction firstFragment = getSupportFragmentManager().beginTransaction();
            firstFragment.replace(R.id.frMainContainer, new NotesFragment());
            firstFragment.commit();
            binding.mainBottomNav.setSelectedItemId(R.id.bNavNotes);
        }
    }
}