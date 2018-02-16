import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Scanner;


public class Main {
  public static void main(String args[]) {

    Scanner in = new Scanner(System.in);

    String input;
    int brojac = 0;

    while (true) {
      input = in.nextLine();
      if (input.startsWith("Hajj")) {
        input = "Hajj-e-Akbar";
        brojac++;

      } else if (input. startsWith("Umrah")) {
        input = "Hajj-e-Asghar";
        brojac++;
      } else if (input.equals("*")) {
        break;
      }
      System.out.println("Case " + brojac + ": " + input);
    }
  }
}
