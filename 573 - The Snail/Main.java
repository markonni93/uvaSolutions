import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
  public static void main(String args[]) {

    Scanner in = new Scanner(System.in);

    Snail snail = new Snail();
    double height;
    double counter = 0;
    int whileCounter = 0;
    boolean climb;
    double fatigueDivision = 0;

    while (true) {
      height = in.nextDouble();

      if (height == 0) {
        break;
      }
      snail.daySnailDistance = in.nextDouble();
      snail.nightSnailDistance = in.nextDouble();
      snail.fatigue = in.nextDouble();
      fatigueDivision = snail.daySnailDistance * (snail.fatigue/100);

      while (true) {

          if (snail.daySnailDistance <= 0) {
            counter -= snail.nightSnailDistance;
          } else if (counter + snail.daySnailDistance > height) {
            climb = true;
            whileCounter = whileCounter + 1;
            break;

          } else {
            counter += snail.daySnailDistance - snail.nightSnailDistance;
          }
          whileCounter++;

          if (counter >= height) {
            climb = true;
            break;
          } else if (counter < 0) {
            climb = false;
            break;
          }
          snail.daySnailDistance -= fatigueDivision;
      }

      if (climb == true) {
        System.out.println("success on day " + whileCounter);
      } else {
        System.out.println("failure on day " + whileCounter);
      }
      whileCounter= 0;
      counter = 0;
    }
  }
  public static class Snail {
    public double daySnailDistance;
    public double nightSnailDistance;
    public double fatigue;
}
}
