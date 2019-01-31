package Cwiczenie_7;

import java.util.Arrays;

public class Liczba {
    private int liczba;
    private  int[] dzielniki;

    public int getLiczba() {
        return liczba;
    }

    public void setLiczba(int liczba) {
        this.liczba = liczba;
    }

    public int[] getDzielniki() {
        return dzielniki;
    }

    public void setDzielniki(int[] dzielniki) {
        this.dzielniki = dzielniki;
    }

    public Liczba(int liczba, int[] dzielniki) {
        this.liczba = liczba;
        this.dzielniki = dzielniki;
    }

    public Liczba() {
    }

    @Override
    public String toString() {
        return "Liczba{" +
                "liczba=" + liczba +
                ", dzielniki=" + Arrays.toString(dzielniki) +
                '}';
    }
}
