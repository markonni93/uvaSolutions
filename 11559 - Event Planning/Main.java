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
    int numOfBeds = 0;
    Boolean check = null;

    while (numOfHotels-- > 0) {
      price = in.nextInt();

      for (int i = 0; i < numOfWeeks; i++) {
        numOfBeds = in.nextInt();
        for (int j = 0; j < numOfWeeks; j++) {

          check = null;
          while (numOfBeds-- > 0){
            if (numOfBeds == 0) {
              check = false;
            } else {
              check = true;
            }
          }
        }
      }

      System.out.println(numOfBeds);
    }


    }
  }
