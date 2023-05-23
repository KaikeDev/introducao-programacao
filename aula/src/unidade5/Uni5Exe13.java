package unidade5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe13 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DecimalFormat f_02 = new DecimalFormat("0.00");

        System.out.println("Digite a quantidade de paradas feitas:");
        int qtdParadas = scan.nextInt();
        double distanciaTotal = 0.0;
        double combustivelTotal = 0.0;

        for(int i = 1; i <= qtdParadas; i++) {

            System.out.println("Parada: "+i);
            System.out.println("Digite o valor do odômetro");
            double valorOdometro = scan.nextDouble();

            System.out.println("Digite a quantidade de combistível comprado");
            double qtdComprado = scan.nextDouble();

            double distaciaPercorrida = valorOdometro - distanciaTotal;
            double quilometragemParada = distaciaPercorrida / qtdComprado;
            System.out.println("Quilometragem obtida por litro de combustível nessa parada: "+f_02.format(quilometragemParada));
            distanciaTotal = valorOdometro;
            combustivelTotal += qtdComprado; 

        }

        double quilometragemMedia = distanciaTotal / combustivelTotal;
        System.out.println("Quilometragem média obtida por litro de combustível foi de: "+f_02.format(quilometragemMedia));

        scan.close();
    }
}