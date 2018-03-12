import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Scanner;


public class Main {

  static int sumOfDigits(String numberInput) {
    int digitSum = 0;

    for (int i = 0; i < numberInput.length(); i++) {
      int digit  = Character.digit(numberInput.charAt(i), 10);
      digitSum += digit;
    }
      return digitSumFinal(digitSum);
  }

  static int digitSumFinal (int digitSum) {
    if (digitSum < 10) {
      return digitSum;
    } else {
      int sum = 0;
      while (digitSum > 0) {
        sum += digitSum%10;
        digitSum /= 10;
      }
      return digitSumFinal (sum);
    }
  }

  public static void main(String args[]) {

    Scanner in = new Scanner(System.in);
    String numberInput;

    while (true) {
      numberInput = in.nextLine();

      if (numberInput.equals("0")) {
        break;
      }

      System.out.println(sumOfDigits(numberInput));

    }
  }
}
