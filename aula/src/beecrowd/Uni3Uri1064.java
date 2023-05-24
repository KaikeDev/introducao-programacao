package unidade3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Uri1064 {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        DecimalFormat f_01 = new DecimalFormat("0.0");

        int qtdPositivos = 0;
        double soma = 0;

        double num1 = scan.nextDouble();
        if (num1 >= 0) {
            qtdPositivos = 1;
            soma = num1;
        }
        double num2 = scan.nextDouble();
        if (num2 >= 0) {
            qtdPositivos += 1;
            soma += num2;
        }
        double num3 = scan.nextDouble();
        if (num3 >= 0) {
            qtdPositivos += 1;
            soma += num3;
        }
        double num4 = scan.nextDouble();
        if (num4 >= 0) {
            qtdPositivos += 1;
            soma += num4;
        }
        double num5 = scan.nextDouble();
        if (num5 >= 0) {
            qtdPositivos += 1;
            soma += num5;
        }
        double num6 = scan.nextDouble();
        if (num6 >= 0) {
            qtdPositivos += 1;
            soma += num6;
        }

        while (num1 < 0 && num2 < 0 && num3 < 0 && num4 < 0 && num5 < 0 && num6 < 0) {
            System.out.println("Digite um valor positivo");
            num1 = scan.nextDouble();
            qtdPositivos = 1;
            soma = num1;
        }

        double media = soma / qtdPositivos;
        System.out.println(qtdPositivos + " valores positivos");
        System.out.println(f_01.format(media));

        scan.close();

    }
}