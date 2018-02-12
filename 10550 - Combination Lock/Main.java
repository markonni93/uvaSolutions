import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Scanner;


public class Main {

public static void main(String args[]) {


        Scanner in = new Scanner(System.in);

        int brojac;

        if (args.length == 0) {
                //radim program normalno
        } else if (args[0].equals("-t")) {
                testClockwise(0, 0, 0);
                testClockwise(0, 30, 90);
                testClockwise(30, 0, 270);
                testClockwise(10, 25, 225);
                testClockwise(25,10, 135);
                System.out.println("Radimo testove i ovo je kraj");
        }

        while(true) {

                int pocetnaPozicijaBrojaca = in.nextInt();
                int x = in.nextInt();
                int y = in.nextInt();
                int c = in.nextInt();

                if(pocetnaPozicijaBrojaca==0 && x==0 && y==0 && c == 0) {
                        break;
                }

                int trenutnoStanje = clockwise(pocetnaPozicijaBrojaca,x);
                int trenutnoStanje2 = clockwise(x,y);
                int trenutnoStanje3 = clockwise(y,c);

                brojac = 720 + trenutnoStanje + 360 + (360 - trenutnoStanje2) + trenutnoStanje3;

                System.out.println(brojac);

        }




}

public static boolean testClockwise(int a, int b, int expected) {
        int result = clockwise(a, b);
        if (result != expected) {
                System.out.printf("Ovo nije dobro, a=%d, b=%d, expected=%d izlaz %d\n", a, b, expected, result);
                return false;
        }
        return true;
}

public static int clockwise (int a, int b){

        int brojStepeni;
        if (a >= b) {
                brojStepeni = (a-b)*9;
                return brojStepeni;
        } else {
                brojStepeni = (a+40-b)*9;
                return brojStepeni;
        }


}

}
