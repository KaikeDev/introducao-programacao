package unidade3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe08 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DecimalFormat f_02 = new DecimalFormat("R$ 0.00");

        System.out.println("Quantos dólares foram entregues?");
        double qtdDolares = scan.nextDouble();

        System.out.println("Quanto está a cotação do dólar");
        double cotacao = scan.nextDouble();

        double valorReais = qtdDolares * cotacao;
        System.out.println("Você deve devolver "+f_02.format(valorReais));

        scan.close();
    }
}
