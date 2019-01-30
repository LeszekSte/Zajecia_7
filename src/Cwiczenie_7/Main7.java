package Cwiczenie_7;

public class Main7 {
    public static void main(String[] args) {
        int[] tab = {2, 3, 5, 7};
        int suma = 1;

        for (int liczba : tab) {
            suma *= liczba;
        }
        System.out.println(suma);
    }
}
