package unidade5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe20 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DecimalFormat f_02 = new DecimalFormat("0.00");

        System.out.println("Digite a massa incial do material, em KG");
        double massaInicial = scan.nextDouble();

        double massaFinal = massaInicial;
        int tempo = 0;

        while(massaFinal >= 0.0005){
            massaFinal = massaFinal /2  ;
            tempo += 50;
        }
        
        System.out.println("A massa incial do material foi de: "+massaInicial);
        System.out.println("A massa final do material foi de: "+f_02.format(massaFinal));
        System.out.println("O tempo gasto foi de: "+tempo+ " segundos");
        scan.close();
    }
}