package be.ehb.notedroid.views;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import be.ehb.notedroid.R;
import be.ehb.notedroid.viewmodels.NotesViewModel;
import be.ehb.notedroid.views.viewutils.NotesRecyclerViewAdapter;

public class NotesListFragment extends Fragment {

    public NotesListFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_notes_list, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView notesRecyclerView = view.findViewById(R.id.rv_notes);

        NotesViewModel mNotesViewModel = new ViewModelProvider(getActivity()).get(NotesViewModel.class);
        NotesRecyclerViewAdapter adapter = new NotesRecyclerViewAdapter();

        notesRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false));
        notesRecyclerView.setAdapter(adapter);

        mNotesViewModel.getLiveNotes().observe(getViewLifecycleOwner(), notes -> adapter.setNoteItems(notes));
    }
}
