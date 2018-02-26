import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Scanner;


public class Main {
  public static void main(String args[]) {

    Scanner in = new Scanner(System.in);

    int numOfCases = in.nextInt();
    int counter = 0;
    int numOfStudents = 0;
    int currentStudent = 0;
    int nextStudent = 0;
    int temporary = 0;

    while (numOfCases-- > 0) {
      numOfStudents = in.nextInt();
      currentStudent = 0;

      for (int i = 0; i < numOfStudents; i++) {
        nextStudent = in.nextInt();
        if (currentStudent < nextStudent) {
          currentStudent = nextStudent;
        }
      }      
      counter++;
      System.out.println("Case " + counter + ": " + currentStudent);
    }
  }
}
