package v3.operation;

public class AddOperation implements Operation{

  public double perform(double[] numbers) {

    double result = 0;
    //add all the numbers
    for (double number : numbers) {
      result += number;
    }

    return result;
  }

}

/**
 * public class AnyOperation implements Operation {
 *
 *
 *   public double add(double[] numbers) {
 *
 *     //logic to add numbers
 *
 *   }
 *
 *   public double mul(double[] numbers) {
 *
 *     //logic to mul numbers
 *   }
 *
 *
 * }
 *
 * //NOT CLOSED FOR MODIFICATION
 * //NOT OPEN FOR EXTENSION
 *
 * // POWER ADAPTORS/EXTENSIONS?
 *
 */
