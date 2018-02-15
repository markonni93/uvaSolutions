import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Scanner;


public class Main {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    int a;
    int b;
    int c;
    int d;

    if (args.length == 0) {
      while (true) {
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        d = in.nextInt();
        if (a == 0 && b == 0 && c == 0 && d == 0) {
          break;
        }
        System.out.println(1440 + clockwise(a, b) - clockwise(b, c) + clockwise(c, d));
      }
    } else if (args[0].equals("-t")) {
      testClockwise(0, 0, 0);
      testClockwise(0, 30, 90);
      testClockwise(30, 0, 270);
      testClockwise(10, 25, 225);
      testClockwise(25,10, 135);
      System.out.println("Radimo testove i ovo je kraj");
    }
  }

  public static boolean testClockwise(int a, int b, int expected) {
    int result = clockwise(a, b);
    if (result != expected) {
      System.out.printf("Ovo nije dobro, a=%d, b=%d, expected=%d izlaz %d\n",
          a, b, expected, result);
      return false;
    }
    return true;
  }

  /**

*/
  public static int clockwise(int a, int b) {
    return a >= b ? (a - b) * 9 : (a + 40 - b) * 9;
  }
}
