package by.epam.catalog;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class InputDataReader {
  private static final String PATH = ".\\inputData.txt";

  public ArrayList<String> readInputData() {
    ArrayList<String> requestList = new ArrayList<>();
    try {
      Path path = Paths.get(PATH);
      BufferedReader bufferedReader = Files.newBufferedReader(path);
      String line;
      while ((line = bufferedReader.readLine()) != null) {
        requestList.add(line);
      }
      bufferedReader.close();
    } catch (Exception e) {
      System.out.println("Fail in file reader!");
    }
    return requestList;
  }
}
