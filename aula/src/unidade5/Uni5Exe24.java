package unidade5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe24 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DecimalFormat f_02 = new DecimalFormat("0.00");

        System.out.println("Deseja informar o peso de um peixe: s (SIM) / n (NÃO)");
        char resp = scan.nextLine().charAt(0);

        System.out.println("Escreva o limite diário de peso de pesca do dia");
        double limiteDiario = scan.nextDouble();

        double pesoTotal = 0;
        while (resp == 's') {

           

            System.out.println("Escreva o peso do peixe");
            double pesoPeixe = scan.nextDouble();

            pesoTotal += pesoPeixe;
            System.out.println("Peso está em: " + f_02.format(pesoTotal));
            if (pesoTotal > limiteDiario) {
                System.out.println("Limite diário atingido");
                System.exit(resp);
            } 

            System.out.println("Deseja informar o peso de mais um peixe: s (SIM) / n (NÃO)");
            resp = scan.next().charAt(0);

        }
        scan.close();

    }
}