package v2;

public class AddOperation {

  double perform(double[] numbers) {

    double result = 0;
    //add all the numbers
    for (double number : numbers) {
      result += number;
    }

    return result;
  }

}
