package Cwiczenie11;

import java.util.Scanner;

import static Cwiczenie11.Main11.poz;

public class WorkingClass {
    Scanner sc = new Scanner(System.in);


     Expenses[] addNewExpenses (Expenses [] expenses1){
        Main11 main = new Main11();

       String name ="" ;
       double value = 0;

       do {
            System.out.println("Pozycja nr " + (poz+ 1) );
            System.out.println("Podaj nazwę wydatku - ");
            name = sc.nextLine();
           System.out.println("Podaj wartość wydatku - ");

           value = sc.nextDouble();
           sc.nextLine();

            if (value != 0) {
                expenses1 [poz] = new Expenses(name, value);
                poz++;
            }

        }while ( value!=0);



         System.out.println("Koniec");
        return expenses1;
     }

     void wydruk (Expenses [] tab){
         for (int i=0; i<poz; i++) {
             System.out.println((i+1)+". " + tab[i].getName() +", wartość - " + tab[i].getValue());
         }
     }


}
