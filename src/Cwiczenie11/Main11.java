package Cwiczenie11;

import java.util.Scanner;

public class Main11 {

    static final int MAX_IDEMS  = 100;
    static int poz = 0;

    public static void main(String[] args) {


        WorkingClass workingClass = new WorkingClass();
        Menu menu = new Menu();

        Expenses [] expenses = new Expenses[ MAX_IDEMS];

        System.out.println("Kartoteka wydatków domowych ");
        int wybor;
        boolean ifIsData = false;
        do {
            menu.menu();
            wybor = workingClass.sc.nextInt();
            workingClass.sc.nextLine();
            switch (wybor){
                case 1:
                    workingClass.addNewExpenses(expenses);
                    ifIsData= true;
                    break;
                case 2:
                    if (ifIsData) {
                        workingClass.wydrukWszystkich (expenses);
                    }else info();
                    break;
                case 3:
                    if (ifIsData){
                        workingClass.wydrukUpAve (expenses);
                    }else info();
                    break;
                case 4:
                    if (ifIsData){
                        workingClass.wykresWydatków (expenses);
                    }else info();
                    break;
            }
       }while (wybor !=0);
        System.out.println("Do zobaczenia");

        //System.out.println(expenses[1].getName());



        workingClass.sc.close();

    }
    static void info(){
        System.out.println("Nie wprowadzono danych;");
    }



}
