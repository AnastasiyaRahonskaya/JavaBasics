package by.epam.catalog.controller.command.impl;

import by.epam.catalog.controller.command.Command;

public class WrongRequest implements Command {
    public static final String INCORRECT_MESSAGE = "Incorrect command";

    @Override
    public String execute(String request) {
        return INCORRECT_MESSAGE;
    }
}