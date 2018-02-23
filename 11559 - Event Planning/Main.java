import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;
import java.lang.Object;
import java.util.stream.IntStream;


public class Main {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);

    //while (in.hasNextLine()) {

      int numOfPart = in.nextInt();
      int budget = in.nextInt();
      int hotels = in.nextInt();
      int weeks = in.nextInt();
      int price = 0;
      int[] beds = new int[weeks];
      Boolean hasFive = null;
      long provera = 0;

      while (hotels-- > 0) {
        price = in.nextInt();
        hasFive = null;
        for (int i = 0; i < beds.length; i++) {
          beds[i] = in.nextInt();
          hasFive = IntStream.of(beds).anyMatch(num -> num == 0);
          }
          if (hasFive == false) {
          provera = numOfPart * price;
        }
      }

      System.out.println(provera);

      if (provera <= budget && hasFive == false) {
        System.out.println(provera);
      } else {
        System.out.println("stay home");
      }
    }
  }
//}
