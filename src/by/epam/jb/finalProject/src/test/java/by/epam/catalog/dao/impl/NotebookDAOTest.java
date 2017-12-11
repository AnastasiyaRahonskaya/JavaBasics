package by.epam.catalog.dao.impl;

import by.epam.catalog.bean.Note;
import by.epam.catalog.dao.NoteDAO;
import by.epam.catalog.dao.exception.DAOException;
import by.epam.catalog.dao.factory.DAOFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.Assert.*;

public class NotebookDAOTest {
    private NoteDAO noteDAO;

    @BeforeClass
    public void setUp() throws DAOException{
        DAOFactory daoFactory = DAOFactory.getInstance();
        noteDAO = daoFactory.getNewsDAO();
        noteDAO.addNote(new Note("12.12.2012", "123456"));
        noteDAO.addNote(new Note("13.01.2013", "We are the champions"));
        noteDAO.addNote(new Note("14.02.2014", "Scorpions"));
        noteDAO.addNote(new Note("15.05.2015", "The Beatles"));
        noteDAO.addNote(new Note("10.10.2010", "Hello world"));
        noteDAO.addNote(new Note("11.11.2011", "Hello iPhone"));
    }

    @Test
    public void testFindNote() throws Exception {
        ArrayList<Note> notes = new ArrayList<>();
        notes.add(new Note("11.11.2011", "Hello iPhone"));
        Assert.assertEquals(noteDAO.findNote("iPhone"), notes);
    }

    @Test
    public void testFindByDate() throws Exception {
        ArrayList<Note> notes = new ArrayList<>();
        notes.add(new Note("14.02.2014", "Scorpions"));
        Assert.assertEquals(noteDAO.findByDate("14.02.2014"), notes);
    }

    @Test
    public void testDeleteNote() throws Exception {
        ArrayList<Note> notes = new ArrayList<>();
        notes.add(new Note("12.12.2012", "123456"));
        notes.add(new Note("13.01.2013", "We are the champions"));
        notes.add(new Note("14.02.2014", "Scorpions"));
        notes.add(new Note("10.10.2010", "Hello world"));
        notes.add(new Note("11.11.2011", "Hello iPhone"));
        noteDAO.deleteNote("The Beatles");
        Assert.assertEquals(notes, noteDAO.getNotes());
    }
}