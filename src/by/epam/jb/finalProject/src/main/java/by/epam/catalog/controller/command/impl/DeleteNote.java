package by.epam.catalog.controller.command.impl;

import by.epam.catalog.controller.command.Command;
import by.epam.catalog.service.NoteService;
import by.epam.catalog.service.exception.ServiceException;
import by.epam.catalog.service.factory.ServiceFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DeleteNote implements Command {
    private static final Logger LOG = LogManager.getRootLogger();


    @Override
    public String execute(String request) {
        String response;
        try {
            ServiceFactory serviceFactory = ServiceFactory.getInstance();
            NoteService noteService = serviceFactory.getNoteService();

            noteService.deleteNote(request.split("/")[1]);
            response = "The note is deleted";
        } catch (ServiceException | ArrayIndexOutOfBoundsException e) {
            response = "Error while deleting the note!";
            LOG.error(e);
        }
        return response;
    }
}
