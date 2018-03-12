import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;
import java.lang.Object;
import java.util.stream.IntStream;


public class Main {
  public static void main(String args[]) {

    Scanner in = new Scanner(System.in);

    int numOfParticipants = 0;
    int budget = 0;
    int numOfHotels = 0;
    int numOfWeeks = 0;
    int price = 0;
    int priceMin = 10000000;
    int temporaryPrice = 0;
    int numOfBeds = 0;
    int checkNumOfBeds = 0;
    int finalPrice = 0;

    while (in.hasNextLine()) {

      numOfParticipants = in.nextInt();
      budget = in.nextInt();
      numOfHotels = in.nextInt();
      numOfWeeks = in.nextInt();

      priceMin = 10000000;

    while (numOfHotels-- > 0) {

      price = in.nextInt();

      checkNumOfBeds = 0;
      finalPrice = 0;

      for (int i = 0; i < numOfWeeks; i++) {
        numOfBeds = in.nextInt();

        if (numOfBeds == 0) {
          checkNumOfBeds++;
        }
      }
      finalPrice = numOfParticipants * price;

      if (finalPrice <= budget && finalPrice < priceMin && checkNumOfBeds == 0 && numOfBeds >= numOfParticipants) {
        priceMin = finalPrice;
      }
      System.out.println(priceMin);
    }

    if (priceMin <= budget) {
      System.out.println(priceMin);
    } else {
      System.out.println("stay home");
    }
  }
 }
}
