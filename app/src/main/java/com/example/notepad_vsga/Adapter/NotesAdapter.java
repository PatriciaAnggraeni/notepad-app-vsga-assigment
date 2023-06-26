package com.example.notepadvsgaproject.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.notepadvsgaproject.Data.Notes;
import com.example.notepadvsgaproject.R;

import java.util.ArrayList;

public class NotesAdapter extends RecyclerView.Adapter<NotesAdapter.ViewHolder> {

    private ArrayList<Notes> listNotes;

    public NotesAdapter() {}

    public NotesAdapter(ArrayList<Notes> listNotes) {
        this.listNotes = listNotes;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.notes_card, parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.notesHeader.setText(listNotes.get(position).getNotesHeader());
        holder.notesContent.setText(listNotes.get(position).getNotesContent());
    }

    @Override
    public int getItemCount() {
        return this.listNotes.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private TextView notesHeader, notesContent;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.notesHeader = itemView.findViewById(R.id.notes_header);
            this.notesContent = itemView.findViewById(R.id.notes_content);
        }
    }

}
