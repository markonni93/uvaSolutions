import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Scanner;


public class Main {
  public static void main(String args[]) {

    Scanner in = new Scanner(System.in);

    int testcase = in.nextInt();
    int numOfWalls;
    int lowJumps = 0;
    int highJumps = 0;
    int brojac = 0;

    while (testcase-- > 0) {
      numOfWalls = in.nextInt();
      int[] height = new int[numOfWalls];

      for (int i = 0; i < height.length; i++) {
        height[i] = in.nextInt();
      }

      highJumps = 0;
      lowJumps = 0;

      for (int j = 0; j < height.length - 1; j++) {
        if (height[j] > height[j + 1]) {
          lowJumps++;
        } else if (height[j] < height[j + 1]) {
          highJumps++;
        } else if (height[j] == height[j + 1]) {
          highJumps = highJumps;
          lowJumps = lowJumps;
        }
      }
      brojac++;
      System.out.println("Case " + brojac + ": " + highJumps + " " + lowJumps);
    }
  }
}
