package v2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {

    //read numbers.txt file
    FileNumberRepository numberRepository = new FileNumberRepository();
    double[] numbers = numberRepository.read();

    //read user input using scanner
    ScannerBasedUserInput userInput = new ScannerBasedUserInput();
    String operation = userInput.readOperation();

    double result = 0;
    if (operation.equals("add")) {

      AddOperation addOperation = new AddOperation();
      result = addOperation.perform(numbers);

    } else if (operation.equals("mul")) {

      //multiply all the numbers
      MulOperation mulOperation = new MulOperation();
      result = mulOperation.perform(numbers);

    }

    ConsoleOutput output = new ConsoleOutput();
    output.show("The result is: " + result);

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

//homework: read Cleancode by martin fowler

//REFACTORING
//***********************Isolate the possible areas which can change in the future************************
//NAMING plays a major part in quality software development! -> classes, properties, variables, methods etc...

// class names -> Nouns
// method names -> verbs

// Computer -> type();, showOutput();
// Class name should represent the intention of the class (what's inside the class)
//SOLID Principles

// Single Responsibility Principle - One class should have one responsibility (one reason to change)