import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Scanner;


public class Main {
  public static void main(String args[]) {

    Scanner in = new Scanner(System.in);

    int caseNum = in.nextInt();
    int salary1;
    int salary2;
    int salary3;
    int salaryaverage = 0;
    int brojac = 0;



    for(int i = 0; i < caseNum; i++){
      salary1 = in.nextInt();
      salary2 = in.nextInt();
      salary3 = in.nextInt();
      brojac++;

    if ((salary1 > salary2 && salary1 < salary3) ||
       (salary1 < salary2 && salary1 > salary3)) {
      salaryaverage=salary1;
    }else if ((salary2 > salary1 && salary2 < salary3) ||
       (salary2 < salary1 && salary2 > salary3)) {
      salaryaverage=salary2;
    }else if ((salary3 > salary1 && salary3 < salary2) ||
       (salary3 < salary1 && salary3 > salary2)) {
      salaryaverage=salary3;
    }else if (salary1 ==salary2 && salary1==salary3 && salary2==salary3) {
      salaryaverage=salary1;
    }
    System.out.println("Case " + brojac + ": " + salaryaverage);

  }

  }

}
