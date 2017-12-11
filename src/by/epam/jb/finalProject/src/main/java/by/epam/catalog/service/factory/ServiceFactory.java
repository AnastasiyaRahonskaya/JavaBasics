package by.epam.catalog.service.factory;

import by.epam.catalog.service.NoteService;
import by.epam.catalog.service.impl.NoteServiceImpl;

public class ServiceFactory {
  public static final ServiceFactory instance = new ServiceFactory();
  private final NoteService noteService = new NoteServiceImpl();

  private ServiceFactory() {
  }

  public static ServiceFactory getInstance() {
    return instance;
  }

  public NoteService getNoteService() {
    return noteService;
  }
}
