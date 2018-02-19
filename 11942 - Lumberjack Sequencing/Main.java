import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String args[]) {

      Scanner in = new Scanner(System.in);

      int numGroup = in.nextInt();

      int[] lumberjackArray = new int[10];
      int counter = 0;
      int countAscen = 0;
      int countDescen = 0;

      System.out.println("Lumberjacks:");

      while (counter++ < numGroup) {



      for (int i = 0; i < 10; i++){
      lumberjackArray[i]= in.nextInt();
      }

      for (int j = 0; j < lumberjackArray.length-1; j++) {
        if (lumberjackArray[j] > lumberjackArray[j+1]) {
          countDescen++;
      } if (lumberjackArray[j] < lumberjackArray[j+1] ) {
          countAscen++;
      }


      if(countAscen == 9) {
        System.out.println("Ordered");
        countAscen = 0;
      } else if (countDescen == 9) {
        System.out.println("Ordered");
        countDescen = 0;
      } else if (countAscen != 9 || countDescen != 9){
        System.out.println("Unordered");
      }


      break;
}


}
}
}
