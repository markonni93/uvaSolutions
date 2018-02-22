import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;


public class Main {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int numOfCases = in.nextInt();
    int numOfFarmers;
    long farmyard;
    long animals;
    long environmentFriendliness;
    long money;
    long sum = 0;

    while (numOfCases-- > 0) {
      numOfFarmers = in.nextInt();
      sum = 0;

      for (int i = 0; i < numOfFarmers; i++) {
        farmyard = in.nextInt();
        animals = in.nextInt();
        environmentFriendliness = in.nextInt();
        money = farmyard * environmentFriendliness;
        sum += money;
      }
      System.out.println(sum);
    }
  }
}
