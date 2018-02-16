import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Scanner;


public class Main {
  public static void main(String args[]) {

    Scanner in = new Scanner(System.in);

    String numCase = in.nextLine();
    int realNumCase = Integer.parseInt(numCase);

    String input;
    int report = 0;
    int parseInput = 0;
    int brojac = 0;

    while(brojac < realNumCase){

    input = in.nextLine();

    if (input.startsWith("donate")){

    input = input.replaceAll("[^\\d.]", "");
    parseInput = Integer.parseInt(input);
    report+= parseInput;
  }  if (input.startsWith("report")){
      System.out.println(report);
    }

    brojac++;

}




    }

  }
