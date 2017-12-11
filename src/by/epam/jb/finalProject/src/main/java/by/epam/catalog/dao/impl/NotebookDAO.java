package by.epam.catalog.dao.impl;

import by.epam.catalog.bean.Note;
import by.epam.catalog.dao.NoteDAO;
import by.epam.catalog.dao.exception.DAOException;

import java.util.ArrayList;
import java.util.Iterator;

public class NotebookDAO implements NoteDAO {

  private ArrayList<Note> notes;

  @Override
  public void addNote(Note note) throws DAOException {
    if (notes == null) {
      notes = new ArrayList<>();
    }
    notes.add(note);
  }

  @Override
  public ArrayList<Note> findNote(String note) throws DAOException {
    ArrayList<Note> foundNotes = new ArrayList<>();
    for (Note note1 : notes) {
      if (note1.getNote().contains(note)) {
        foundNotes.add(note1);
      }
    }
    return foundNotes;
  }

  @Override
  public ArrayList<Note> findByDate(String date) throws DAOException {
    ArrayList<Note> foundNotes = new ArrayList<>();
    for (Note note1 : notes) {
      if (note1.getDate().equals(date)) {
        foundNotes.add(note1);
      }
    }
    return foundNotes;
  }

  @Override
  public void deleteNote(String note) throws DAOException {
    Iterator<Note> noteIterator = notes.iterator();
    while (noteIterator.hasNext()) {
      if (noteIterator.next().getNote().contains(note)) {
        noteIterator.remove();
      }
    }
  }

  @Override
  public ArrayList<Note> getNotes() {
    return notes;
  }
}