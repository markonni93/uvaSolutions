import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Scanner;


public class Main {

  static int digitsFromName (String name) {
    int nameSum = 0;

    for (int i = 0; i < name.length(); i++) {
      char currentCharacater=name.charAt(i);
      if (Character.isAlphabetic(currentCharacater)) {
        if (Character.isUpperCase(currentCharacater)) {
           nameSum += (currentCharacater-'A' + 1);
         } else {
           nameSum += (currentCharacater-'a' + 1);
           }
      }
    }
      return finalSumName(nameSum);
  }

  static int finalSumName (int nameSum) {
    if (nameSum < 10) {
      return nameSum;
    } else {
      int sum = 0;
      while (nameSum > 0) {
        sum += nameSum%10;
        nameSum /= 10;
      }
      return finalSumName(sum);
    }
  }

  public static void main(String args[]) {

    Scanner in = new Scanner(System.in);
      String name;
      double max;
      double min;

      while (in.hasNextLine()) {
      name = in.nextLine();

      double firstInput = digitsFromName(name);
      double secondInput = digitsFromName(in.nextLine());

      if (firstInput > secondInput) {
        max = firstInput;
        min = secondInput;
      } else {
        max = secondInput;
        min = firstInput;
      }

      double count = (min / max) * 100;

      System.out.printf("%.2f %%\n",count);
    }
  }
}
