package by.epam.catalog.controller.command.impl;

import by.epam.catalog.bean.Note;
import by.epam.catalog.controller.command.Command;
import by.epam.catalog.service.NoteService;
import by.epam.catalog.service.exception.ServiceException;
import by.epam.catalog.service.factory.ServiceFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AddNote implements Command {
  private static final Logger LOG = LogManager.getRootLogger();

  @Override
  public String execute(String request) {
    String response;
    try {
      String date = request.split("/")[1];
      String note = request.split("/")[2];
      ServiceFactory serviceFactory = ServiceFactory.getInstance();
      NoteService noteService = serviceFactory.getNoteService();

      noteService.addNote(new Note(date, note));
      response = "The note is added!";
    } catch (ServiceException | ArrayIndexOutOfBoundsException e) {
      response = "Error while adding the note!";
      LOG.error(e);
    }
    return response;
  }
}
