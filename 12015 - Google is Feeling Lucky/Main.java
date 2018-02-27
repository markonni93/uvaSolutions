import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
  public static void main(String args[]) {

    Scanner in = new Scanner(System.in);

    int numOfCases = in.nextInt();
    String[] webAddress = new String[10];
    int[] value = new int[10];
    int max = 0;
    int whileCounter = 0;

    while (numOfCases-- > 0) {

      for (int i = 0; i < webAddress.length; i++) {
        webAddress[i] = in.next();
        value[i] = in.nextInt();
      }
      max = 0;
      for (int i = 0; i < value.length; i++) {
          if (value[i] > max) {
            max = value[i];
          }
        }

      whileCounter++;
      System.out.println("Case " + "#" + whileCounter + ":");
      for (int j = 0; j < value.length; j++) {
        if (max == value[j]) {
          System.out.println(webAddress[j]);
        }
      }
    }
  }
}
