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
    Address[] addresses = new Address[10];
    int max = 0;
    int whileCounter = 0;

    while (numOfCases-- > 0) {

      for (int i = 0; i < addresses.length; i++) {
        Address address = new Address();
        address.webAdress = in.next();
        address.value = in.nextInt();
        addresses[i] = address;
      }
      max = 0;
      for (int i = 0; i < addresses.length; i++) {
          if (addresses[i].value > max) {
            max = addresses[i].value;
          }
        }

      whileCounter++;
      System.out.println("Case " + "#" + whileCounter + ":");
      for (int j = 0; j < addresses.length; j++) {
        if (max == addresses[j].value) {
          System.out.println(addresses[j].webAdress);
        }
      }
    }
  }
  public static class Address {
    public String webAdress;
    public int value;
  }
}
