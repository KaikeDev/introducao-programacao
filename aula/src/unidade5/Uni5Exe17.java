package unidade5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe17 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DecimalFormat f_02 = new DecimalFormat("0.00");

        System.out.println("Informe o número de inscrição do atleta");
        int numeroInscricao = scan.nextInt();

        int contador = 0;
        int inscricaoAlta = 0;
        int inscricaoBaixa = 0;
        double alturaMinima = 0;
        double alturaMaxima = 0;
        double mediaAltura = 0;

        while (numeroInscricao != 0) {

            System.out.println("Informe a altura do atleta ");
            double alturaAtleta = scan.nextDouble();

            if (alturaAtleta > alturaMaxima) {
                alturaMaxima = alturaAtleta;
                inscricaoAlta = numeroInscricao;
               
            }else if(alturaAtleta < alturaMaxima) {
                alturaMinima = alturaAtleta;
                inscricaoBaixa = numeroInscricao;
                
            }
            contador++;
             mediaAltura = (mediaAltura+ alturaAtleta);

            System.out.println("Informe o número de inscrição do atleta");
            numeroInscricao = scan.nextInt();
        }

        System.out.println(inscricaoAlta + " teve a altura mais alta, com: " + alturaMaxima);
        System.out.println(inscricaoBaixa + " teve a altura mais baixa, com: " + alturaMinima);
        mediaAltura /= contador;
        System.out.println("A média de altura foi de: "+f_02.format(mediaAltura));

        scan.close();
    }
}