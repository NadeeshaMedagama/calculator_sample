package v3;

import v3.input.UserInput;
import v3.input.UserInputException;
import v3.operation.Operation;
import v3.operation.OperationFactory;
import v3.output.Output;
import v3.repository.NumberRepository;
import v3.repository.NumberRepositoryException;

public class CalculatorApp {

  private final NumberRepository numberRepository; //contract
  private final UserInput userInput; //contract
  private final Output output; //contract

  // *******************CONSTRUCTOR INJECTION********************* //
  public CalculatorApp(
    NumberRepository numberRepository,
    UserInput userInput,
    Output output
    ) {
    this.numberRepository = numberRepository;
    this.userInput = userInput;
    this.output = output;
  }

  public void execute() throws CalculatorAppException {

    try {
      double[] numbers = numberRepository.read();

      //read user input using scanner
      String operation = userInput.readOperation();

      OperationFactory operationFactory = new OperationFactory();
      Operation operationObj = operationFactory.getInstance(operation);

      double result = operationObj.perform(numbers);

      output.show("The result is: " + result);
    } catch (NumberRepositoryException | UserInputException e) {

      //if you want without throwing this exception to the caller, you can run a different code path. ex: retry
      throw new CalculatorAppException("Failed to execute the calcuator app", e);
    }
  }


}
