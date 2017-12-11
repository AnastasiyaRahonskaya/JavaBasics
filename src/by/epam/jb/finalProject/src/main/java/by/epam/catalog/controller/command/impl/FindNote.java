package by.epam.catalog.controller.command.impl;

import by.epam.catalog.bean.Note;
import by.epam.catalog.controller.command.Command;
import by.epam.catalog.service.NoteService;
import by.epam.catalog.service.exception.ServiceException;
import by.epam.catalog.service.factory.ServiceFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

public class FindNote implements Command {
  private static final Logger LOG = LogManager.getRootLogger();

  @Override
  public String execute(String request) {
    String response;
    try {
      ServiceFactory serviceFactory = ServiceFactory.getInstance();
      NoteService noteService = serviceFactory.getNoteService();
      ArrayList<Note> notes = noteService.findNote(request.split("/")[1]);

      StringBuilder builder = new StringBuilder();

      for (Note note : notes) {
        builder.append(note.toString()).append("\n");
      }

      response = builder.toString();
    } catch (ServiceException | ArrayIndexOutOfBoundsException e) {
      response = "Error while finding the note!";
      LOG.error(e);
    }
    return response;
  }
}