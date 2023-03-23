package unidade3;

import java.util.Scanner;

public class uni3ex016 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor da compra");
        double valorCompra = scan.nextInt();

        System.out.println("Digite o valor pago pelo cliente");
        double valorPago = scan.nextInt();

        while (valorCompra > valorPago) {
            System.out.println("Valor pago menor do que o valor da compra, favor pagar a conta de forma correta");
            valorPago = scan.nextInt();
        }

        double troco = valorPago - valorCompra;

        double nota100 = troco / 100.0;
        troco %= 100.0;

        double nota10 = troco / 10.0;
        troco %= 10.0;

        double nota1 = troco;

        System.out.println("Notas de 100: " + nota100);
        System.out.println(" notas de 10: " + nota10);
        System.out.println(" notas de 1: " + nota1);

        scan.close();
    }
}
