import java.io.BufferedInputStream;
import java.io.IOException;

public class Main {
  public static void main(String args[]) throws IOException {
    BufferedInputStream in = new BufferedInputStream(System.in);
    int currentChar;
    boolean provera = false;

    while ((currentChar = in.read()) != -1) {
      if((char)currentChar == '"' && provera==false){
        System.out.print("``");
        provera = !provera;
      } else if ((char)currentChar == '"' && provera==true) {
            System.out.print("''");
            provera = !provera;

      } else{
        System.out.print((char)currentChar);
      }

    }
    in.close();
  }
}
