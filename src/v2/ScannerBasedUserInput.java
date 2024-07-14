package v2;

import java.util.Scanner;

public class ScannerBasedUserInput {

  String readOperation() {
    System.out.println("Enter the operation you want to do: ");
    Scanner scanner = new Scanner(System.in);
    return scanner.nextLine();
  }

}
