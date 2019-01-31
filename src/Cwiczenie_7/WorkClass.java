package Cwiczenie_7;

public class WorkClass {


    Main7 mm = new Main7();


    int ileDiv(int liczba) {

        int[] tabRob = new int[mm.MAX];
        int ilePodzielników = 0;
        for (int i = (liczba - 1); i == 2; i--) {
            if (liczba % i == 0) {
                ilePodzielników++;
            }
        }


        return ilePodzielników;
    }


}
