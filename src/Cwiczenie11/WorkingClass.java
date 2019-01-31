package Cwiczenie11;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

import static Cwiczenie11.Main11.poz;

public class WorkingClass {
    Scanner sc = new Scanner(System.in);


    Expenses[] addNewExpenses(Expenses[] expenses1) {
        Main11 main = new Main11();

        String name = "";
        double value = 0;
        System.out.println("0 - w nazwie i wartości - wyjscie do MENU");
        do {
            System.out.println("Pozycja nr " + (poz + 1) + " Podaj nazwę wydatku - ");
            name = sc.nextLine();
            System.out.println("Podaj wartość wydatku - ");

            value = sc.nextDouble();
            sc.nextLine();

            if (value < 0) {
                System.out.println("Wartość wydatków nie może być mniejsza od zera");
            } else if (value > 0) {
                expenses1[poz] = new Expenses(name, value);
                poz++;
            }
        } while (value != 0);
        return expenses1;
    }

    void wydrukUpAve(Expenses[] tab) {
        double aver = sumWydatkow(tab) / poz;
        System.out.printf("Wydatki powyżej średniej wydatków - %.2fzł\n", aver);
        for (int i = 0; i < poz; i++) {
            if (aver < tab[i].getValue()) {
                infoExpense(1, tab[i]);
                //  System.out.println((i + 1) + ". " + tab[i].getName() + ",\t - " + tab[i].getValue());
            }
        }
        System.out.println();
    }

    void wydrukWszystkich(Expenses[] tab) {
        for (int i = 0; i < poz; i++) {
            infoExpense(i, tab[i]);

        }
        System.out.println();
    }

    double sumWydatkow(Expenses[] tab) {
        double sum = 0;
        for (int i = 0; i < poz; i++) {
            sum += tab[i].getValue();
        }
        return sum;
    }


    void wykresWydatków(Expenses[] tab) {
        double procentowo = 0;
        double suma = sumWydatkow(tab);
        System.out.println("Wykres procentowy\n");
        for (int i = 0; i < poz; i++) {
            procentowo = tab[i].getValue() / suma;
            //infoExpense(i, tab[i]);
            System.out.println("Poz. - " + i + " - " + ileGwiazdek(procentowo));
        }
        System.out.println();
    }

    String ileGwiazdek(double procent) {
        final int MAX = 50;
        String gwiazdki = "";
        int ileGwiazd = (int) (procent * MAX);
        for (int i = 0; i < ileGwiazd; i++) {
            gwiazdki += "*";
        }
        return gwiazdki;
    }

    void infoExpense(int poz, Expenses expenses) {
        System.out.println((poz + 1) + ". " + expenses.getName() + ", \t - " + expenses.getValue() + "zł");
    }


}
