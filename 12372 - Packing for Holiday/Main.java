import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Scanner;


public class Main {
  public static void main(String args[]) {

    Scanner in = new Scanner(System.in);

    int numCase = in.nextInt();
    int counter = 0;
    int L;
    int W;
    int H;
    int printCounter = 0;
    String print = "";

//ovde moze slobodno i ovo while(counter++ < numCase)
    while(counter < numCase){
//TODO ovde ti fale da su ove linije uvucene za po jos jedno tab mesto
    L = in.nextInt();
    W = in.nextInt();
    H = in.nextInt();

      //ovo je super, osim sto ti ne treba ova provera u else, mislim ako je ovo prvo dobro, onda jedino sto ti preostane jeste da nije
    if (L <= 20 && W <= 20 && H <= 20) {
        print = "good";
    } else if (L > 20 || W > 20 || H > 20) { // tako da ti ovo ovde if ne treba, treba samo else
        print = "bad";
    }
      //cisto radi vezbe probaj da uradis gornji if i kao ternary operator https://alvinalexander.com/java/edu/pj/pj010018
      //nesto tipa ovako 
      //print = (uslov) ? jeste : nije;
      
      
      // i ovde print counter moze da se sredi i ubaci u system.out.println, ili da se koristi System.out.printf
     printCounter++;
     System.out.println("Case " + printCounter + ": " + print);
     counter++;
    }
  }
}
