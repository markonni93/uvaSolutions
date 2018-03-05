import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Scanner;


public class Main {
  public static void main(String args[]) {

    Scanner in = new Scanner(System.in);

    int numOfCases = in.nextInt();
    int row = 0;
    int collumn = 0;
    int result = 0;

    while (numOfCases-- > 0) {
      row = in.nextInt();
      collumn = in.nextInt();

      row = row / 3;
      collumn = collumn / 3;

      result = row * collumn;

      System.out.println(result);
    }
  }
}
