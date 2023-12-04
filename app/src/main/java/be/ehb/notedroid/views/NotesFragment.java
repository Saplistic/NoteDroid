package be.ehb.notedroid.views;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;

import be.ehb.notedroid.R;
//import be.ehb.notedroid.viewmodels.NotesViewModel;

public class NotesFragment extends Fragment {

private RecyclerView notesRecyclerView;

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

//        notesRecyclerView = view.findViewById(R.id.rv_notes);
//
//        NotesViewModel mNotesViewModel = new ViewModelProvider(getActivity()).get(NotesViewModel.class);
//        // instantie van de adapter




    }
}
