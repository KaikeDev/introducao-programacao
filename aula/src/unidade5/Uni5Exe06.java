package unidade5;

import java.text.DecimalFormat;

import java.util.Scanner;

public class Uni5Exe06 {
   

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            DecimalFormat f_02 = new DecimalFormat("0.00");
            double soma = 0;
            for(int i = 1; i <=20; i++){

                System.out.println("Digite a altura da pessoa "+i);
                double altura = scan.nextDouble();

                 soma += altura;
            }

            double mediaAltura = soma / 20;
            System.out.println("A média de altura das 20 pessoa foi de: "+ f_02.format(mediaAltura));
            scan.close();

        }
}
