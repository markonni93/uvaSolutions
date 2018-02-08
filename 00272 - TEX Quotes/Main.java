import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        //int n = in.nextInt();
        System.out.println("Unesite recenicu");

        ArrayList<String> list = new ArrayList<String>();


        while (list.size() <60) {
	      list.add(in.next());
      }

        for(int i=0; i<list.size(); i++){
          System.out.print(list.get(i) + " ");
          }


    }
}
