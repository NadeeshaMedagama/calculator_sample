package v3;

import v3.input.ScannerBasedUserInput;
import v3.input.UserInput;
import v3.input.UserInputException;
import v3.output.ConsoleOutput;
import v3.output.Output;
import v3.repository.FileNumberRepository;
import v3.repository.NumberRepository;
import v3.repository.NumberRepositoryException;
import v3.repository.SqlNumberRepository;

import java.io.IOException;
import java.sql.SQLException;

public class Main {

  public static void main(String[] args) {

    //log the start event -> INFO

    //Creating required objects (we can get rid of all these 'new' keywords by using a dependency injection framework like Spring.)
    NumberRepository numberRepository = new FileNumberRepository();
    UserInput userInput = new ScannerBasedUserInput();
    Output output = new ConsoleOutput();

    //Injecting the objects and creating the CalculatorApp Object
    CalculatorApp calculatorApp = new CalculatorApp(
      numberRepository,
      userInput,
      output
    );

    //execute the calculator
    try {

      calculatorApp.execute();

    } catch (CalculatorAppException e) {
      //todo: instead of using sysout, use a logger ERROR
      System.out.println("An exception occurred while executing the code. " + e.getMessage());
    }

    //log the finish event - INFO

  }
}

//
// Abstraction + Polymorphism
// AddOperation, MulOperation, AvgOperation ....
// Operation -> interface/abstract
// put related stuff in one package
//SOLID ->
  //single responsibility principle -> a class should have one responsibility
  // (a class should have only one reason to change)
// is main class single responsible?

// Workers + Coordinators (getting work done from other classes)
// Orchestra
// Factory Method design pattern
// what is a design pattern
// what is a factory? to create objects

// SOLID
  // Open Close principle - A class should be open for extension but closed for modification.

// Dependency inversion principle -> Depend on abstractions

// if we are going to read numbers from a database instead of a file.
// FileNumberRepository -> SqlNumberRepository

// Main class is "depending" on FileNumberRepository
// L -> Liskov Substitution principle

// ******EXCEPTION HANDLING*****
// what is a syntax error? -> not exceptions
// what is an exception??
// debugging
// what is a logger?? - Any industry level program should have a logger
// logger is a storage that we can use to store the events of an application
// what are events? - starting, finishing, errors, warnings, any other important scenario
// usually we use log files -> text files
// use cloud storage to keep log files (cloudwatch in amazon aws)
// need to use a logger library for this (ex: log4j, slf4j)

// we need to generalize the exceptions thrown from interfaces
// to do that we need to introduce CUSTOM EXCEPTION CLASSES

// CHECKED
// UNCHECKED EXCEPTIONS