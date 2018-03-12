import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
  public static void main(String args[]) {

    Scanner in = new Scanner(System.in);

    int numOfCases = in.nextInt();
    int numOfInstructions = in.nextInt();
    in.nextLine();
    boolean[] instructions = new boolean[numOfInstructions];
    String instruction;
    int numberInstruction;
    int p = 0;

    while (numOfCases-- > 0) {

      p = 0;

      for (int i = 0; i < numOfInstructions; i++) {
        instruction = in.next();
        if (instruction.startsWith("L")) {
          instructions[i] = false;
          p--;
        } else if (instruction.startsWith("R")) {
          instructions[i] = true;
          p++;
        } else {
          in.next();
          numberInstruction = in.nextInt();
          instructions[i] = instructions[numberInstruction-1];
          if (instructions[i] == false) {
            p--;
          } else {
            p++;
          }
        }
      }
      System.out.println(p);
    }
  }
}
