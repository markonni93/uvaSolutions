import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Scanner;


public class Main {
  public static void main(String args[]) {

    Scanner in = new Scanner(System.in);

    int numOfTestCases = in.nextInt();
    int numOfElements;
    int trenutniBroj;
    int sledeciBroj;
    int maxValue = 0;
    int secondMaxValue = 0;

    while (numOfTestCases-- > 0) {
      numOfElements = in.nextInt();

      maxValue = 0;
      secondMaxValue = 0;

      for (int i=0; i < numOfElements; i++){
        sledeciBroj = in.nextInt();

        if (sledeciBroj > maxValue) {
          secondMaxValue = maxValue;
          maxValue = sledeciBroj;
        } else if (sledeciBroj > secondMaxValue) {
          secondMaxValue = sledeciBroj;
        }
      }
    System.out.println(maxValue + " " + secondMaxValue);
    }
  }
}
