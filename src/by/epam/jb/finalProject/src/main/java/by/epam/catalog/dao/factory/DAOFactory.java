package by.epam.catalog.dao.factory;

import by.epam.catalog.dao.NoteDAO;
import by.epam.catalog.dao.impl.NotebookDAO;

public final class DAOFactory {
  private static final DAOFactory instance = new DAOFactory();
  private final NoteDAO fileNewsImpl = new NotebookDAO();

  private DAOFactory() {
  }

  public static DAOFactory getInstance() {
    return instance;
  }

  public NoteDAO getNewsDAO() {
    return fileNewsImpl;
  }
}
