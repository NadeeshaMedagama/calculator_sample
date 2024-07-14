package v2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileNumberRepository {

  double[] read() throws IOException { //todo: handle this exception properly

    List<String> data = Files.readAllLines(Paths.get("/Users/asanka/teaching/se/2024/sc/calculator/numbers.txt"));

    //assume that only one line is available in the file
    String numbersStr = data.get(0);
    String[] numbersArray = numbersStr.split(",");
    double[] numbers = new double[numbersArray.length];
    for (int i = 0; i < numbersArray.length; i++) {
      numbers[i] = Double.parseDouble(numbersArray[i]);
    }
    return numbers;
  }

  void write(String val) {}

}
