package v3.input;

import java.util.Scanner;

public class ScannerBasedUserInput implements UserInput{

  public String readOperation() throws UserInputException{
    System.out.println("Enter the operation you want to do: ");
    Scanner scanner = new Scanner(System.in);
    String value = scanner.nextLine();

    if (value.isEmpty()) {
      throw new UserInputException("User input was empty");
    }

    return value;
  }

}
