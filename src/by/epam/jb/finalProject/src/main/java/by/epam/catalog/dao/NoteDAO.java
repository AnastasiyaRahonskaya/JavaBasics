package by.epam.catalog.dao;

import by.epam.catalog.bean.Note;
import by.epam.catalog.dao.exception.DAOException;

import java.util.ArrayList;

public interface NoteDAO {

  void addNote(Note note) throws DAOException;

  ArrayList<Note> findNote(String note) throws DAOException;

  ArrayList<Note> findByDate(String date) throws DAOException;

  void deleteNote(String note) throws DAOException;

  ArrayList<Note> getNotes();
}
