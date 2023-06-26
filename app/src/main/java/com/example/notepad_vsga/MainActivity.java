package com.example.notepad_vsga;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.notepad_vsga.R;
import com.example.notepadvsgaproject.Adapter.NotesAdapter;
import com.example.notepadvsgaproject.Data.Notes;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Notes> listNotes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayNotes();
    }

    private void displayNotes() {

        listNotes = new ArrayList<>();

        listNotes.add(new Notes("Catatan 1", "Hanya sebuah catatan"));
        listNotes.add(new Notes("Catatan 2", "Hanya sebuah catatan"));
        listNotes.add(new Notes("Catatan 3", "Hanya sebuah catatan"));
        listNotes.add(new Notes("Catatan 4", "Hanya sebuah catatan"));
        listNotes.add(new Notes("Catatan 5", "Hanya sebuah catatan"));

        recyclerView = findViewById(R.id.recyclerview_notes);
        recyclerView.setAdapter(new NotesAdapter(listNotes));
    }
}