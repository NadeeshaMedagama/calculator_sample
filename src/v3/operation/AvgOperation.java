package v3.operation;

public class AvgOperation implements Operation{

  @Override
  public double perform(double[] numbers) {

    double result = 0;

    for (double number : numbers) {
      result += number;
    }

    return result/numbers.length;
  }
}
