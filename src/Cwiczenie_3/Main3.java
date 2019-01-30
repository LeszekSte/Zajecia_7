package Cwiczenie_3;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program liczy x, w funkcji  ax + b = c");
        double a;
        double b;
        double c;

        do {
            System.out.println("Podaj zmienną a różną od 0");
            a = sc.nextDouble();
        } while (a == 0);

        System.out.println("Podaj zmienną b ");
        b = sc.nextDouble();
        System.out.println("Podaj zmienną c");
        c = sc.nextDouble();

        double x = (c - b) / a;
        System.out.printf("Wartość x w równaniu %.1fx + %.1f = %.1f wynosi %.2f \n", a, b, c, x);
    }
}
