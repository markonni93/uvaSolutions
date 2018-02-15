import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Scanner;


public class Main {
  public static void main(String args[]) {

    Scanner in = new Scanner(System.in);

    int brojac = 0;
    String unos;
    String result;

    while (in.hasNextLine()) {
      unos = in.nextLine();

      if (unos.equals("#")) {
        break;
      }

      switch (unos) {
        case "HELLO":
          result = "ENGLISH";
          break;
        case "HOLA":
          result = "SPANISH";
          break;
        case "HALLO":
          result = "GERMAN";
          break;
        case "BONJOUR":
          result = "FRENCH";
          break;
        case "CIAO":
          result = "ITALIAN";
          break;
        case "ZDRAVSTVUJTE":
          result = "RUSSIAN";
          break;
        default:
          result = "UNKNOWN";
          break;

      }
      System.out.printf("Case %d: %s\n", ++brojac, result);
    }
  }
}
