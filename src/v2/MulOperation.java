package v2;

public class MulOperation {

  double perform(double[] numbers) {

    double result = 1;
    for (double number: numbers) {
      result *= number;
    }

    return result;
  }


}
