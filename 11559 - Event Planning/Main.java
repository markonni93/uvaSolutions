import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;
import java.lang.Object;
import java.util.stream.IntStream;


public class Main {
  public static void main(String args[]) {

    Scanner in = new Scanner(System.in);

    int numOfParticipants = in.nextInt();
    int budget = in.nextInt();
    int numOfHotels = in.nextInt();
    int numOfWeeks = in.nextInt();
    int price = 0;
    int[] numOfBeds = new int[numOfWeeks];
    int finalPrice = 0;
    Boolean beds = null;

    while (numOfHotels-- > 0) {
      price = in.nextInt();
      for (int i = 0; i < numOfWeeks; i++) {
        numOfBeds[i] = in.nextInt();
        if (numOfBeds[i] == 0) {
          beds = false;
        } else {
          beds = true;
        }
      }
      finalPrice = price * numOfParticipants;


      if (beds = false || finalPrice > budget) {
        System.out.println("stay home");
      } else if (beds = true && finalPrice <= budget) {
        System.out.println(finalPrice);
      }
    }
  }
}
