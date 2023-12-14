package be.ehb.notedroid.views;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import be.ehb.notedroid.NotesBase;
import be.ehb.notedroid.R;
import be.ehb.notedroid.models.Note;
import be.ehb.notedroid.viewmodels.NotesViewModel;

public class CreateFragment extends Fragment {

    EditText title;
    EditText content;
    Button submitBtn;

    public CreateFragment() {
    }

    public static CreateFragment newInstance() {
        CreateFragment fragment = new CreateFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_create, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        NotesViewModel notesViewModel = new ViewModelProvider(getActivity()).get(NotesViewModel.class);

        title = view.findViewById(R.id.et_note_create_title);
        content = view.findViewById(R.id.et_note_create_content);
        submitBtn = view.findViewById(R.id.btn_note_save);

        submitBtn.setOnClickListener((View v) -> {
            String titleTxt = title.getText().toString();
            String contentTxt = content.getText().toString();

            Note newNote = new Note(titleTxt, contentTxt);

            NotesBase.getInstance().AddNote(newNote);

            Toast.makeText(getContext(), "Created new note", Toast.LENGTH_SHORT).show();

            Navigation.findNavController(view).navigateUp();
        });
    }
}