package Cwiczenie11;

import java.util.Scanner;

public class Main11 {

    static final int MAX_IDEMS  = 100;
    static int poz = 0;

    public static void main(String[] args) {


        WorkingClass workingClass = new WorkingClass();

        Expenses [] expenses = new Expenses[ MAX_IDEMS];

        System.out.println("Podaj nazwę oraz wartość  wydatku - [ Wartość \"0\" - koniec programu ]");
        workingClass.addNewExpenses(expenses);
        //System.out.println(expenses[1].getName());
        workingClass.wydruk(expenses);


        workingClass.sc.close();
    }
}
