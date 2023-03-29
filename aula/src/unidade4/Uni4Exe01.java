package unidade4;

import java.util.Scanner;

public class Uni4Exe01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com as horas trabalhadas no mês");
        int horasMes = scan.nextInt();

        System.out.println("Entre com o valor pago por hora");
        double horasValor = scan.nextDouble();

        double salarioTotal = horasMes * horasValor;

        if (horasMes > 160) {
            double salarioExtra = (horasMes - 160) * (horasValor / 2);
            salarioTotal = salarioTotal + salarioExtra;
        }

        System.out.println("O salário total é de: " + salarioTotal);
        scan.close();

    }
}