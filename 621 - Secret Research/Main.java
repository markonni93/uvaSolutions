import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Scanner;


public class Main {
  public static void main(String args[]) {


      Scanner in = new Scanner(System.in);

      int caseNum = in.nextInt();
      in.nextLine();
      int counter = 0;

      String input;

      while (counter < caseNum) {

      input = in.nextLine();
      //System.out.println(input);

      if (input.equals("1") || input.equals("4") || input.equals("78")) {
          System.out.println("+");
      } else if (input.endsWith("35")) {
        System.out.println("-");
      } else if (input.startsWith("9") && input.endsWith("4")){
        System.out.println("*");
      } else {
        System.out.println("?");
      }
      counter++;
    }
  }
}
