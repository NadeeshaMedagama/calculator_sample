package v3.operation;

public class MulOperation implements Operation{

  public double perform(double[] numbers) {

    double result = 1;
    for (double number: numbers) {
      result *= number;
    }

    return result;
  }


}
