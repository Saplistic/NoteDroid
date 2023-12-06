package be.ehb.notedroid.views.viewutils;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import be.ehb.notedroid.R;
import be.ehb.notedroid.models.Note;

public class NotesRecyclerViewAdapter extends RecyclerView.Adapter<NotesRecyclerViewAdapter.MyViewHolder> {

    private ArrayList<Note> noteItems;

    public NotesRecyclerViewAdapter() {
        this.noteItems = new ArrayList<>();
    }

    public void setNoteItems(ArrayList<Note> items) {
        this.noteItems = items;
    }

    // Nieuwe instantie maken
    @NonNull
    @Override
    public NotesRecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.note_list_item, parent, false);
        return new MyViewHolder(v);
    }

    // Data koppelen aan viewholder
    @Override
    public void onBindViewHolder(@NonNull NotesRecyclerViewAdapter.MyViewHolder holder, int position) {
        Note note = noteItems.get(position);
        holder.tvTitle.setText(note.getTitle());
        holder.tvContent.setText(note.getContent());
    }

    @Override
    public int getItemCount() {
        return noteItems.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        final TextView tvTitle;
        final TextView tvContent;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tv_note_title);
            tvContent = itemView.findViewById(R.id.tv_note_last_edited);
        }
    }
}

