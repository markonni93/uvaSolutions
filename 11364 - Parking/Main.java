import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Scanner;


public class Main {
  public static void main(String args[]) {

    Scanner in = new Scanner(System.in);

    int numOfCases = in.nextInt();

    int min = 1000000;
    int max = 0;

    int numOfStores = 0;
    int storeNumber = 0;
    int temporary = 0;

    while (numOfCases-- > 0) {

      max = 0;
      min = 1000000;

      numOfStores = in.nextInt();
      for (int i = 0; i < numOfStores; i++) {
        storeNumber = in.nextInt();
        if (storeNumber < min) {
          min = storeNumber;
        }
        if (storeNumber > max) {
          max = storeNumber;
        }
      }
      temporary = (max - min) * 2;
      System.out.println(temporary);
    }
  }
}
