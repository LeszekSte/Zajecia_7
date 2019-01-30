package Cwiczenie_5;

import java.lang.reflect.Array;
import java.util.Random;

public class Main5 {
    public static void main(String[] args) {
        Calc calc = new Calc();

        int[] ints = new int[10];
        calc.wczytanieLiczb(ints);
        calc.wydruk(ints);
        double average = calc.averageTab(ints);

        System.out.println("Srednia liczb - "+average);
        System.out.println("Suma liczb mniejszych od średniej\t- "+ calc.lessThenAverage(ints,average));
        System.out.println("Suma liczb wiekszych od średniej\t- "+calc.biggerThenAverage(ints,average ));
    }
}
