package v1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {

    List<String> data = Files.readAllLines(Paths.get("/Users/asanka/teaching/se/2024/sc/calculator/numbers.txt"));

    //assume that only one line is available in the file
    String numbersStr = data.get(0);
    String[] numbersArray = numbersStr.split(",");
    double[] numbers = new double[numbersArray.length];
    for (int i = 0; i < numbersArray.length; i++) {
      numbers[i] = Double.parseDouble(numbersArray[i]);
    }

    //read user input using scanner
    System.out.println("Enter the operation you want to do: ");
    Scanner scanner = new Scanner(System.in);
    String operation = scanner.nextLine();

    double result = 0;
    if (operation.equals("add")) {

      //add all the numbers
      for (double number : numbers) {
        result += number;
      }

    } else if (operation.equals("mul")) {
      //multiply all the numbers
      result = 1;
      for (double number: numbers) {
        result *= number;
      }
    }

    System.out.println("The result is: " + result);

  }
}

//A CALCULATOR APP

// numbers.txt -> a csv file
// read the numbers.txt file
// do an operation that user asks to do
 //ex: if user says add => add all the numbers
 // if user says mul => multiply all the numbers
 // if user says avg => calculate the average

//finally display the result in the console.
//10.50 AM

//Changeability
// Any software application is subjected to change!
// User requirements can change time to time!

//what kinds of changes that we can expect in above software that we built?
// 1. add more operations like avg, median, max, min etc
// 2. support more than one operation
// 3. keep a history of calculation
// 4. read data from a different file (like excel etc) / database
// 5. error handling
// 6. save the output to a file
// 7. reading the operation input from somewhere else

// to do all these changes, we have to modify the existing code!
// what happens when modifying some working code? - Bugs can be introduced - High Risk!

//SOLID PRINCIPLES

//The above code doesn't have any SOLID/OOP principles applied
// rewrite the code applying SOLID principles
// so that we can makesure our software can be easy to extend when the changes are requested like above.

//REFACTORING