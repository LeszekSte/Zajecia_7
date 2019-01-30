package Cwiczenie12;

public class SotowanieBabelkowe {

    int[] bubbleSort(int[] tablica) {
        int n = tablica.length;
        do {
            for (int i = 0; i < n - 1; i++) {
                if (tablica[i] > tablica[i + 1]) {
                    int temp = tablica[i];
                    tablica[i] = tablica[i + 1];
                    tablica[i + 1] = temp;
                }
            }
            n = n - 1;
        } while (n > 1);
        return tablica;
    }
}
