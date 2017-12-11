package by.epam.catalog.controller;

import by.epam.catalog.controller.command.Command;
import by.epam.catalog.service.NoteService;
import by.epam.catalog.service.exception.ServiceException;
import by.epam.catalog.service.factory.ServiceFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Controller {
    private static final Logger logger = LogManager.getLogger(Controller.class);

    private final CommandProvider provider = new CommandProvider();

    private final char paramSeparator = '/';

    public String executeTask(String request) {
        String commandName;
        Command executionCommand;
        commandName = request.substring(0, request.indexOf(paramSeparator));
        executionCommand = provider.getCommand(commandName);
        String response;
        response = executionCommand.execute(request);
        return response;
    }
}
