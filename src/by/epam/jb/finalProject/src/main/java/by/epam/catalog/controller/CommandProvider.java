package by.epam.catalog.controller;

import by.epam.catalog.controller.command.Command;
import by.epam.catalog.controller.command.commandName.CommandName;
import by.epam.catalog.controller.command.impl.*;

import java.util.HashMap;
import java.util.Map;

class CommandProvider {
  private final Map<CommandName, Command> repository = new HashMap<>();

  public CommandProvider() {
    repository.put(CommandName.ADD_NOTE, new AddNote());
    repository.put(CommandName.FIND_BY_DATE, new FindByDate());
    repository.put(CommandName.FIND_NOTE, new FindNote());
    repository.put(CommandName.DELETE_NOTE, new DeleteNote());
    repository.put(CommandName.WRONG_REQUEST, new WrongRequest());
  }

  Command getCommand(String name) {
    CommandName commandName;
    Command command;
    try {
      commandName = CommandName.valueOf(name.toUpperCase());
      command = repository.get(commandName);
    } catch (IllegalArgumentException | NullPointerException e) {
      command = repository.get(CommandName.WRONG_REQUEST);
    }
    return command;
  }
}
