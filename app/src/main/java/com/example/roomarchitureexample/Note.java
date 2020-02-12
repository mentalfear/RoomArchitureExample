package com.example.roomarchitureexample;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "note_table")
public class Note {

    //erstellen der einzelnen Spalten in unserer Tabelle
    @PrimaryKey(autoGenerate = true)
    private int id;

    private String title;

    private String description;
    //@ColumnInfo(name = "priority_column")
    private int priority;

    //Constructor -- Zum erstellen --> rechtsKlick --> Generate.. --> Constructor
    public Note(String title, String description, int priority) {
        this.title = title;
        this.description = description;
        this.priority = priority;
    }

    //Setter -- Zum erstellen --> rechtsKlick --> Generate.. --> Setter


    public void setId(int id) {
        this.id = id;
    }

    //Getter -- Zum erstellen --> rechtsKlick --> Generate.. --> Getter
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }
}
