package be.ehb.notedroid.viewmodels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;

import be.ehb.notedroid.NotesBase;
import be.ehb.notedroid.models.Note;

public class NotesViewModel extends AndroidViewModel {

    private MutableLiveData<ArrayList<Note>> liveNotes;
    public NotesViewModel(@NonNull Application application) {
        super(application);

        liveNotes = new MutableLiveData<>();
        liveNotes.setValue(NotesBase.getInstance().getNotes());
    }

    public MutableLiveData<ArrayList<Note>> getLiveNotes() {
        return liveNotes;
    }
}
