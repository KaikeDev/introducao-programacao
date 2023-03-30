package unidade4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni4Exe18 {

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        DecimalFormat f_02 = new DecimalFormat("R$ 0.00");

        System.out.println("Digite o dia do pagamento");
        int diaPagamento = scan.nextInt();

        System.out.println("Digite o valor da prestação");
        double valorPrestacao = scan.nextDouble();

        int diaVencimento = 10;

        int atrasoPagamento = diaPagamento - diaVencimento;

        if (atrasoPagamento <= 0) {
            System.out.println("Você ganhou 10% de desconto");
            valorPrestacao -= ((valorPrestacao * 10) / 100);
            System.out.println("O valor da sua prestação é de " + f_02.format(valorPrestacao) + " agora");
        } else if (atrasoPagamento > 0 && atrasoPagamento <= 5) {
            System.out.println("O seu pagamento atrasou "+atrasoPagamento+ " dias");
            System.out.println("Você perdeu o desconto, sua prestação custará: " + f_02.format(valorPrestacao));
        } else if (atrasoPagamento > 5) {
           // atrasoPagamento = atrasoPagamento -5;
            valorPrestacao += ((atrasoPagamento * 2) * valorPrestacao) / 100;
            System.out.println("O seu pagamento atrasou "+atrasoPagamento+ " dias");
            System.out.println("Nova prestação custa: " + valorPrestacao);
        }
        scan.close();
    }
}
