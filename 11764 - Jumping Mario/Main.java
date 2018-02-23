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
    int trenutniStub;
    int sledeciStub;

    while (testcase-- > 0) {
      numOfWalls = in.nextInt();

      highJumps = 0;
      lowJumps = 0;

      trenutniStub = in.nextInt();

      for (int i = 1; i < numOfWalls; i++) {
        sledeciStub = in.nextInt();
        if (trenutniStub > sledeciStub) {
          lowJumps++;
        } else if (trenutniStub < sledeciStub) {
          highJumps++;
        }
        trenutniStub = sledeciStub;
      }
      brojac++;
      System.out.println("Case " + brojac + ": " + highJumps + " " + lowJumps);
    }
  }
}
