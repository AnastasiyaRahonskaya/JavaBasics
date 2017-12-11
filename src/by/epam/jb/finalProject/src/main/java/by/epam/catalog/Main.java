package by.epam.catalog;

import by.epam.catalog.controller.Controller;

import java.util.ArrayList;

/**
 * Start point of the program
 * This application  allows to keep news about films,
 * DVDs and books. Initial data for application keeps
 * in XML file. User can add the new and find the new
 * by category, by title and by author.
 */
public class Main {

  public static void main(String[] args) {
    Controller controller = new Controller();
    InputDataReader inputDataReader = new InputDataReader();
    ArrayList<String> requestList = inputDataReader.readInputData();
    for (String aRequestList : requestList) {
      System.out.println(controller.executeTask(aRequestList));
    }
  }
}
