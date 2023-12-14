package be.ehb.notedroid.views;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import be.ehb.notedroid.R;
import be.ehb.notedroid.models.Note;

public class NoteDetailsFragment extends Fragment {

    public NoteDetailsFragment() {
    }

    public static NoteDetailsFragment newInstance() {
        NoteDetailsFragment fragment = new NoteDetailsFragment();
        return fragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_details, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Note seletedNote = (Note) getArguments().getSerializable("selectedNote");

        TextView title = view.findViewById(R.id.tv_note_details_title);
        TextView content = view.findViewById(R.id.tv_note_details_content);
        TextView dateCreated = view.findViewById(R.id.tv_note_details_date_created);
        TextView dateUpdated = view.findViewById(R.id.tv_note_details_date_modified);

        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);

        title.setText(seletedNote.getTitle());
        content.setText(seletedNote.getContent());
        dateCreated.setText(seletedNote.getDateCreated().format(formatter));
        dateUpdated.setText(seletedNote.getDateModified().format(formatter));
    }
}