package cwiczenie_8;


import java.util.Arrays;

public class Main8 {
    public static void main(String[] args) {

        final int MIN = 10000;
        final int MAX = 99999;
        int[] rzadWielkosci = {10000, 1000, 100, 10, 1};
        int ileLiczb = 0;

        for (int i = MIN; i <= (MAX); i++) {
            int[] a = new int[5];
            a[0] = (int) (i / rzadWielkosci[0]);
            int rob1 = i;
            double sumaPower = Math.pow(a[0], 5);


            for (int x = 1; x < rzadWielkosci.length; x++) {
                int rob = a[x - 1] * rzadWielkosci[x - 1];
                rob1 -= rob;
                a[x] = (int) (rob1 / rzadWielkosci[x]);

//                System.out.println(rzadWielkosci[x] + "  -  " + a[x]);
                sumaPower += Math.pow(a[x], 5);
            }

            if (sumaPower == i) {

                System.out.println(++ileLiczb+ ". - "+ (int)sumaPower);
            }
        }
        System.out.println("Koniec");
    }
}
