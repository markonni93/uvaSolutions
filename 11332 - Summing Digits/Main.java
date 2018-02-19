import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Scanner;


public class Main {
  public static void main(String args[]) {

    Scanner in = new Scanner(System.in);

    int numCase = in.nextInt();
    String number;
    char[] realNumber;

    while (numCase-- > 0) {

    number = in.nextLine();


    String[] digits2 = number.split("(?<=.)");

    System.out.println(digits2);

    }
 }
}
