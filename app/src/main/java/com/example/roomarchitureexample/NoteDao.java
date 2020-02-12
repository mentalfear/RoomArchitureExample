package com.example.roomarchitureexample;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

//Interface

@Dao
public interface NoteDao {

    //Strg + b um ins Java file zu gelangen von insert or update delete
    @Insert
    void insert(Note note);

    @Update
    void update(Note note);

    @Delete
    void delete(Note note);

    //Wenn manwas machen möchte das es noch nciht gibt (SQL code)
    @Query("DELETE FROM note_table")
    void deleteAllNotes();

    @Query("SELECT * FROM note_table ORDER BY priority DESC")
    LiveData<List<Note>> getallNotes();

}
