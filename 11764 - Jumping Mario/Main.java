import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Scanner;


public class Main {
  public static void main(String args[]) {

    Scanner in = new Scanner(System.in);

    while(true){

    int numOfCue = in.nextInt();

    if (numOfCue == 0) {
      break;
    }

    int counter = 0;
    int coordinateX;
    int coordinateY;
    int divisionX;
    int divisionY;

    divisionX = in.nextInt();
    divisionY = in.nextInt();

    while (counter < numOfCue) {

    coordinateX = in.nextInt();
    coordinateY = in.nextInt();

    if(coordinateX == divisionX || coordinateY == divisionY) {
      System.out.println("divisa");
    } else if (coordinateX < divisionX && coordinateY < divisionY) {
      System.out.println("SO");
    } else if (coordinateX > divisionX && coordinateY < divisionY) {
      System.out.println("SE");
    } else if (coordinateX > divisionX && coordinateY > divisionY) {
      System.out.println("NE");
    } else if (coordinateX < divisionX && coordinateY > divisionY) {
      System.out.println("NO");
    }
    counter++;
   }
  }
 }
}
