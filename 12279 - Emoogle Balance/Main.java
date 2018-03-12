import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
  public static void main(String args[]) {

    Scanner in = new Scanner(System.in);

    int numOfEvents = 0;
    int eventDescribe = 0;
    int emoogleShouldGivenTreat = 0;
    int emoogleGivenTreat = 0;
    int emoogleBalance = 0;
    int whileCounter = 0;

    while (true) {
      numOfEvents = in.nextInt();

      if (numOfEvents == 0) {
        break;
      }
      emoogleGivenTreat = 0;
      emoogleShouldGivenTreat = 0;

      while (numOfEvents-- > 0) {
        eventDescribe = in.nextInt();

        if (eventDescribe == 0) {
          emoogleGivenTreat++;
        } else if (eventDescribe > 0) {
          emoogleShouldGivenTreat++;
        }
      }
      whileCounter++;

      emoogleBalance = emoogleShouldGivenTreat - emoogleGivenTreat;

      System.out.println("Case " + whileCounter + ": " + emoogleBalance);
    }
  }
}
