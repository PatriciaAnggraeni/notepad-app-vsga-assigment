package com.example.notepadvsgaproject.Data;

public class Notes {

    private String notesHeader;
    private String notesContent;

    public Notes() {}

    public Notes(String notesHeader, String notesContent) {
        this.notesHeader = notesHeader;
        this.notesContent = notesContent;
    }

    public String getNotesHeader() {
        return this.notesHeader;
    }
    public String getNotesContent() {
        return this.notesContent;
    }

    public void setNotesHeader(String notesContent) {
        this.notesContent = notesContent;
    }

    public void setNotes(String notesContent) {
        this.notesContent = notesContent;
    }

}
