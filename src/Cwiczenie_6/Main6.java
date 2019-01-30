package Cwiczenie_6;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        System.out.println("Ile chcesz wprowadzić liczb min.2  ");
        Scanner scanner = new Scanner(System.in);
        int[] liczby = new int[scanner.nextInt()];
        String liczbaWydruk = "";

        for (int i = 0; i < liczby.length; i++) {
            System.out.println("Podaj " + (i + 1) + " liczbę");
            liczby[i] = scanner.nextInt();
            liczbaWydruk += liczby[i];
        }

        boolean palindrom = true;
        String nie = "";
        int arraylenhg2 = (int) (liczby.length / 2) + liczby.length % 2;
        int i = 0;

        do {
            if (liczby[i] != liczby[(liczby.length - 1) - i]) {
                palindrom = false;
                nie = "nie";
            }
            ++i;
        } while (palindrom && i <= arraylenhg2);

        System.out.println("Liczba " + liczbaWydruk + " to " + nie + " palindrom");
    }
}

