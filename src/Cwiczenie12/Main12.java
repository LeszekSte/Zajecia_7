package Cwiczenie12;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main12 {
    public static void main(String[] args) {

        int [] tab = {10,15,4,34};
        SotowanieBabelkowe sort = new SotowanieBabelkowe();
        System.out.println(Arrays.toString(tab));

        sort.bubbleSort(tab);
        System.out.println(Arrays.toString(tab));
    }
}
