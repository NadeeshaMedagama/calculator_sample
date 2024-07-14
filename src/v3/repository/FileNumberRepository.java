package v3.repository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileNumberRepository implements NumberRepository{

  public double[] read() throws NumberRepositoryException { //todo: handle this exception properly

    List<String> data;

    try {
       data = Files.readAllLines(Paths.get("/Users/asanka/teaching/se/2024/sc/calculator/numbers.txt"));
    } catch (IOException e) {
      throw new NumberRepositoryException("Failed to read numbers from the text file.", e);
    }

    if (data.isEmpty()) {
      throw new NumberRepositoryException("No data found in the text file");
    }

    String numbersStr = data.get(0);
    String[] numbersArray = numbersStr.split(",");
    double[] numbers = new double[numbersArray.length];
    for (int i = 0; i < numbersArray.length; i++) {
      try {
        numbers[i] = Double.parseDouble(numbersArray[i]);
      } catch (NumberFormatException e){
        throw new NumberRepositoryException("The value " + numbersArray[i] + " is not a number.");
      }
    }
    return numbers;
  }

  void write(String val) {}

}

//to read numbers from a sql database -> class name??? SqlNumberRepository