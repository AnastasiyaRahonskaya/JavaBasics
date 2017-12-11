package by.epam.catalog.service;

import by.epam.catalog.bean.Note;
import by.epam.catalog.service.exception.ServiceException;

import java.util.ArrayList;

public interface NoteService {

    void addNote(Note note) throws ServiceException;

    ArrayList<Note> findNote(String note) throws ServiceException;

    ArrayList<Note> findByDate(String date) throws ServiceException;

    void deleteNote(String note) throws ServiceException;
}
