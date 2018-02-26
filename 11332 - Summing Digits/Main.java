import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Scanner;


public class Main {
  public static void main(String args[]) {

    Scanner in = new Scanner(System.in);

    int sum = 0;
    int length = 0;
    int control = 0;
    Boolean test = true;

    while (true) {

      int number = in.nextInt();

      if (number == 0) {
        break;
      }

      sum = 0;
      control = 0;

      String digits = Integer.toString(number);
      for (char c: digits.toCharArray()) {
        sum += c - '0';
      }
      System.out.println(sum);
      //System.out.println(control);
    }
  }
}
