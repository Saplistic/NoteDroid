package be.ehb.notedroid.models;

import java.io.Serializable;
import java.time.LocalDate;

public class Note implements Serializable {

    private String title;
    private String content;
    private LocalDate dateCreated;
    private LocalDate dateModified;

    public Note() {
    }

    public Note(String title, String content) {
        this.title = title;
        this.content = content;
        this.dateCreated = LocalDate.now();
        this.dateModified = LocalDate.now();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    public LocalDate getDateModified() {
        return dateModified;
    }

    public void setDateModified(LocalDate dateModified) {
        this.dateModified = dateModified;
    }
}
