package com.itcraftsolution.keepnotes.ViewPagerAdapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.itcraftsolution.keepnotes.Fragments.AllNotesFragment;
import com.itcraftsolution.keepnotes.Fragments.FolderNotesFragment;

public class NotesViewPagerAdapter extends FragmentStateAdapter {

    private String [] Title=new String[]{"All","Folder"};

    public NotesViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }


    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new AllNotesFragment();
            case 1:
                return new FolderNotesFragment();
        }
        return new AllNotesFragment();
    }

    @Override
    public int getItemCount() {
        return Title.length;
    }
}
