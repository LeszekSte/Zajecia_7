package Cwiczenie_5;

import java.util.Random;
public class Calc {

    void wczytanieLiczb(int[] ints) {
        Random rand = new Random();
        for (int i = 0; i < ints.length; i++) {
            ints[i] = rand.nextInt(100);
        }
    }

    double averageTab(int[] ints) {
        int sum = 0;
        for (int anInt : ints) {
            sum += anInt;
        }
        return (double) sum / ints.length;
    }

    int lessThenAverage(int[] ints, double average) {
        int sum = 0;
        for (int anInt : ints) {
            if (anInt < average) {
                sum += anInt;
            }
        }
        return sum;
    }

    int biggerThenAverage(int[] ints, double average) {
        int sum = 0;
        for (int anInt : ints) {
            if (anInt > average) {
                sum += anInt;
            }
        }
        return sum;
    }

    void wydruk(int[] ints) {
        for (int anInt : ints) {
            System.out.print(anInt + ", ");
        }
    }

}