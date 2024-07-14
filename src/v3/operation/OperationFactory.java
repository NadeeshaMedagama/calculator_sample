package v3.operation;

public class OperationFactory {

  public Operation getInstance(String input) {

    Operation operationObj = null;

    if (input.equals("add")) {
      operationObj = new AddOperation();
    } else if (input.equals("mul")) {
      operationObj = new MulOperation();
    } else if (input.equals("avg")) {
      operationObj = new AvgOperation();
    }

    return operationObj;
  }

}