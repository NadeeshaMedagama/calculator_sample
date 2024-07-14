package v3.output;

public class ConsoleOutput implements Output{

  public void show(String message) {
    System.out.println(message);
  }

}
