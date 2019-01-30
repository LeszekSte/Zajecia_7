package Cwiczenie_2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        int x = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Podaj liczbę ");
            x = scanner.nextInt();
            if (x * x < 100) {
                sum += x;
            }
        } while (x * x < 100);
        System.out.println("Moduł z dzielenia sum%2 -  " + sum % 2);

    }

}
