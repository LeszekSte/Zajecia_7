package Cwiczenia_10;

import Cwiczenie_5.Tablica;

import java.net.Socket;
import java.util.Arrays;
import java.util.Random;

public class Problem {

    final int TABLICA = 10;

    public static void main(String[] args) {
        Problem problem = new Problem();
        int[] tab = problem.generateArray();
        System.out.println(Arrays.toString(tab));
        int[] uniqueElements = problem.getUniqueElements(tab);
        System.out.println(Arrays.toString(uniqueElements));
    }

    private int[] generateArray() {
        int[] tab = new int[TABLICA];
        Random rand = new Random();
        for (int i = 0; i < tab.length; i++) {
            tab[i] = rand.nextInt(10);
        }
        return tab;
    }

    private int[] getUniqueElements(int[] array) {

        int[] unique = new int[TABLICA];
        int emptyIndex = 0;
        boolean zero = true;

        for (int i = 0; i < array.length; i++) {

            if (checkIfContains(array[i], unique, zero)) {
                unique[emptyIndex] = array[i];
                emptyIndex++;
            }
        }
        return unique;
    }

    private boolean checkIfContains(int number, int[] array , boolean zero) {
        boolean contains = true;
        int i = 0;
        while (contains && i < array.length) {

            if (array[i] == number ) {
                contains = false;
                if (number== 0){
                    zero= false;
                    contains = true;
                }
            }
            i++;
        }
        return contains;
    }
}