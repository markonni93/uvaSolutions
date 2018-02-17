import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Scanner;


public class Main {
  public static void main(String args[]) {

    Scanner in = new Scanner(System.in);

    int numCase = in.nextInt();
    int counter = 0;
    int stotineOstatak = 0;
    int desetice = 0;

    while (counter < numCase) {

    int number = in.nextInt();

    number = (((number * 567) / 9 + 7492) * 235) /47 - 498;

    stotineOstatak = number % 100;
    desetice = stotineOstatak / 10;

    if (desetice < 0) {
      desetice = desetice * (-1);
    }

    System.out.println(desetice);

    counter++;
    }
  }
}
