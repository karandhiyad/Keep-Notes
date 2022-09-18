package com.itcraftsolution.keepnotes.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.itcraftsolution.keepnotes.Database.TBLNotes;
import com.itcraftsolution.keepnotes.R;
import com.itcraftsolution.keepnotes.databinding.NoteSampleBinding;

public class AllNotesAdapter extends ListAdapter<TBLNotes,AllNotesAdapter.viewHolder> {

    public AllNotesAdapter() {
        super(diffCallback);
    }

    private static final DiffUtil.ItemCallback<TBLNotes> diffCallback = new DiffUtil.ItemCallback<TBLNotes>() {
        @Override
        public boolean areItemsTheSame(@NonNull TBLNotes oldItem, @NonNull TBLNotes newItem) {
            return oldItem.getId() == newItem.getId();
        }

        @Override
        public boolean areContentsTheSame(@NonNull TBLNotes oldItem, @NonNull TBLNotes newItem) {
            return oldItem.getTitle().equals(newItem.getTitle()) &&
                    oldItem.getText().equals(newItem.getText());
        }
    };

    @NonNull
    @Override
    public AllNotesAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.note_sample,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AllNotesAdapter.viewHolder holder, int position) {
        TBLNotes tblNotes = getItem(position);

        holder.binding.txNoteTitle.setText(tblNotes.getTitle());
        holder.binding.txNoteText.setText(tblNotes.getText());
        holder.binding.txDate.setText(""+tblNotes.getTime());
        if (tblNotes.getFolder() != null){
            holder.binding.txFolderName.setText(tblNotes.getFolder());
        }else {
            holder.binding.txFolderName.setVisibility(View.INVISIBLE);
        }

    }

    public TBLNotes getTBLNotes(int position){
        return getItem(position);
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        NoteSampleBinding binding;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            binding = NoteSampleBinding.bind(itemView);
        }
    }
}
