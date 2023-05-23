package unidade5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe19 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DecimalFormat f_02 = new DecimalFormat("0.00");

        System.out.println("Escreva o valor da compra");
        double valorCompra = scan.nextDouble();
        while (valorCompra < 0) {
            System.out.println("Valor digitado incorreto");
            valorCompra = scan.nextDouble();
        }

        double desconto20 = 0;
        double desconto15 = 0;
        double totalrecebido = 0;
        while (valorCompra != 0) {

            if (valorCompra > 500) {
                desconto20 = valorCompra * 0.80;
                System.out.println("20% de desconto na compra");
                System.out.println("Novo valor da compra " + desconto20);
                totalrecebido += desconto20;
            } else {

                desconto15 = valorCompra * 0.85;
                System.out.println("15% de desconto na compra");
                System.out.println("Novo valor da compra " + desconto15);
                totalrecebido += desconto15;
            }

            System.out.println("Escreva o valor da próxima compra");
            valorCompra = scan.nextDouble();
            while (valorCompra < 0) {
                System.out.println("Valor digitado incorreto");
                valorCompra = scan.nextDouble();
            }

        }

        System.out.println("A loja recebeu: " + f_02.format(totalrecebido) + " no final do dia");
        scan.close();
    }
}