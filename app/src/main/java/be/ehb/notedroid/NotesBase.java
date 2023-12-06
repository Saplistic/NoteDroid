package be.ehb.notedroid;

import java.util.ArrayList;
import java.util.Collections;

import be.ehb.notedroid.models.Note;

public class NotesBase {

    private ArrayList<Note> mNotes;
    private static NotesBase Instance;

    private NotesBase() {
        mNotes = new ArrayList<Note>();

        Collections.addAll(mNotes,
                new Note("Note 1","Inhoud van note 1"),
                new Note("Note 2","Inhoud van note 2"),
                new Note("Note 3","Inhoud van note 3"),
                new Note("Note 4", "Inhoud van note 4"),
                new Note("Note 5", "Inhoud van note 5"),
                new Note("Note 6", "Inhoud van note 6"),
                new Note("Note 7", "Inhoud van note 7"),
                new Note("Note 8", "Inhoud van note 8"),
                new Note("Note 9", "Inhoud van note 9"),
                new Note("Note 10", "Inhoud van note 10"));
    }

    public static NotesBase getInstance() {
        if (Instance == null) {
            Instance = new NotesBase();
        }
        return Instance;
    }

    public void AddNote(Note note) {
        mNotes.add(note);
    }

    public ArrayList<Note> getNotes() {
        return mNotes;
    }


}
