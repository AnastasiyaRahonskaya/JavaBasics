package by.epam.catalog.service.impl;

import by.epam.catalog.bean.Note;
import by.epam.catalog.dao.NoteDAO;
import by.epam.catalog.dao.exception.DAOException;
import by.epam.catalog.dao.factory.DAOFactory;
import by.epam.catalog.service.NoteService;
import by.epam.catalog.service.exception.ServiceException;

import java.util.ArrayList;

public class NoteServiceImpl implements NoteService {
  private ArrayList<Note> notes;

  @Override
  public void addNote(Note note) throws ServiceException {
    validation(note);
    DAOFactory daoObjectFactory = DAOFactory.getInstance();
    try {
      NoteDAO noteDAO = daoObjectFactory.getNewsDAO();
      noteDAO.addNote(note);
    } catch (DAOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public ArrayList<Note> findNote(String note) throws ServiceException {
    validation(note);
    DAOFactory daoObjectFactory = DAOFactory.getInstance();
    try {
      NoteDAO noteDAO = daoObjectFactory.getNewsDAO();
      notes = noteDAO.findNote(note);
    } catch (DAOException e) {
      throw new ServiceException(e);
    }
    return notes;
  }

  @Override
  public ArrayList<Note> findByDate(String date) throws ServiceException {
    validation(date);
    DAOFactory daoObjectFactory = DAOFactory.getInstance();
    try {
      NoteDAO noteDAO = daoObjectFactory.getNewsDAO();
      notes = noteDAO.findByDate(date);
    } catch (DAOException e) {
      throw new ServiceException(e);
    }
    return notes;
  }

  @Override
  public void deleteNote(String note) throws ServiceException {
    validation(note);
    DAOFactory daoObjectFactory = DAOFactory.getInstance();
    try {
      NoteDAO noteDAO = daoObjectFactory.getNewsDAO();
      noteDAO.deleteNote(note);
    } catch (DAOException e) {
      throw new ServiceException(e);
    }
  }

  private void validation(Note note) throws ServiceException {
    if (note.getDate().isEmpty() | note.getNote().isEmpty()) {
      throw new ServiceException("Error while adding the note!");
    }
  }

  private void validation(String s) throws ServiceException {
    if (s.isEmpty() || s == null) {
      throw new ServiceException("Error!");
    }
  }
}
