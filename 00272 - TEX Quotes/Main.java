import java.io.BufferedInputStream;
import java.io.IOException;

public class Main {
  public static void main(String args[]) throws IOException {
    BufferedInputStream in = new BufferedInputStream(System.in);
    int currentChar;
    boolean provera = false;

    while ((currentChar = in.read()) != -1) {
      char c = (char) currentChar;
      if(c == '"'){
        if (provera) {
          System.out.print("''");
        } else {
          System.out.print("``");
        }
        provera = !provera;
      } else{
        System.out.print(c);
      }
    }
    in.close();
  }
}
