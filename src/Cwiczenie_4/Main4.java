package Cwiczenie_4;

import java.util.Scanner;
import java.util.SortedMap;

public class Main4 {
    public static void main(String[] args) {
        final int MIN = 0;
        final int MAX = 100;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program wywietla:\n" +
                "tekst \"Fizz\" dla liczb podzielnych przez 3\n" +
                "tekst \"Buzz\" dla liczb podzielnych przez 5\n" +
                "tekst \"FizzBuzz\" dla liczb podzielnych zarówno przez 3 jak i 5.\n");

        int liczba;

        do {
            System.out.println("Podaj liczbe z zakresu od " + MIN + " do " + MAX);
            liczba = scanner.nextInt();
        } while (!(MIN<=liczba  && liczba <+ MAX));

        boolean div3 = liczba % 3 == 0;
        boolean div5 = liczba % 5 == 0;
        String text3 = "";
        String text5 = "";
        boolean druk = false;

        if (div3) {
            text3 = "Fizz";
            druk =true;
        }
        if (div5) {
            text5 = "Buzz";
            druk =true;
        }
        if (druk) {
            System.out.println(liczba + " - " + text3 + text5);
        }
    }


}




