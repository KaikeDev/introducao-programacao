package unidade3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe14 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DecimalFormat f_02 = new DecimalFormat("Km 0.00");

        System.out.println("Digite a distância percorrida em Km ");
        double distancia = scan.nextDouble();

        System.out.println("Digite o tempo percorrido em horas ");
        double tempo = scan.nextDouble();

        double velocidadeMedia = distancia / tempo;
        double qtdCombustivel = distancia / 12;

        System.out.println("A velocidade média foi de: "+f_02.format(velocidadeMedia) + " e a quantidade de combustível gasta foi de: "+f_02.format(qtdCombustivel));

        scan.close();
    }
}
