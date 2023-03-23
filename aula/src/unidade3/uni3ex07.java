package unidade3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class uni3ex07 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DecimalFormat f_02 = new DecimalFormat("0.00");
        System.out.println("Quantas latas de 350ml você quer");
        int lata350 = scan.nextInt();

        System.out.println("Quantas garrafas de 600ml você quer");
        int garrafa600 = scan.nextInt();

        System.out.println("Quantas garrafas de 2 litros você quer");
        int garraf2Litros = scan.nextInt();

        double litrosTotais = ((lata350 * 0.350) + (garrafa600 * 0.600)) + garraf2Litros;
        System.out.println("A quantidade de litros comprado foi de: " +f_02.format(litrosTotais)+ "litros");
        scan.close();
    }

}