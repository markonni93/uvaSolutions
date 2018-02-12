import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Scanner;


public class Main {
public static void main(String args[]) {


        Scanner in = new Scanner(System.in);

        int t = in.nextInt();


        for (int i = 0; i < t; i++) {
                int prvibroj = in.nextInt();
                int drugibroj = in.nextInt();

                if (prvibroj < drugibroj) {
                        System.out.println("<");
                } else if (prvibroj == drugibroj) {
                        System.out.println("=");
                } else{
                        System.out.println(">");
                }
        }


}
}
