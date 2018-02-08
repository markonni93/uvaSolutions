import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        //int n = in.nextInt();
        System.out.println("Unesite recenicu");

        ArrayList<String> list = new ArrayList<String>();


        while (list.size() <10) {
	      list.add(in.next());
      }

      for (int i = 0; i < list.size(); i++) {

        //treba sada pronaci znakove iz unete recenice i gde god da se oni nalaze
        //zameniti sa onim drugim znakom i preneti u drugu ArrayLis i potom je
        //istampati

        }


        for(int i=0; i<list.size(); i++){
          System.out.print(list.get(i) + " ");
          }


    }
}
