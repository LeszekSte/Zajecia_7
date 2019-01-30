package Cwiczenie_9;

import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int MIN = 1;
        final int MAX = 20;
        int ilePoziomow;

        do {
            System.out.println("Podaj lizbę z przedziału od " + MIN + " do " + MAX);
            ilePoziomow = scanner.nextInt();

        } while (ilePoziomow<MIN && ilePoziomow > MAX);




        for(int i = 1 ; i <=ilePoziomow;i++){
            String spacja = "";
            String zero = "";

            for (int z = (ilePoziomow-i);z>0;z--){
                spacja+= " ";
            }

            for (int y = 1; y<= (2*(i)-1); y++){
                zero+="0";
            }
            System.out.println(spacja+zero);
        }

    }
}
