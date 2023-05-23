package unidade5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe16 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DecimalFormat f_02 = new DecimalFormat("0.00");

        System.out.println("Digite a altura da pessoa");
        double altura = scan.nextDouble();

        double alturaMulheres = 0;
        double alturaGrupo = 0;

        double mediaAlturaMulheres = 0;
        double mediaAlturaGrupo = 0;
        int contadorMulheres = 0;
        int contadorGrupo = 0;

        while (altura != 0) {

            System.out.println("Digite o sexo da pessoa");
            char sexo = scan.next().charAt(0);
            char sexoMaiusculo = Character.toUpperCase(sexo);

            if (sexoMaiusculo == 'F') {
                alturaMulheres += altura;
                contadorMulheres++;

            } else if (sexoMaiusculo == 'M'){
                contadorGrupo++;
            }else {
                System.out.println("Sexo digitado inválido");
            }
            alturaGrupo = altura+alturaGrupo;
            

            System.out.println("Digite a altura da próxima pessoa");
            altura = scan.nextDouble();

        }

       
                
        int contadorFinal = contadorMulheres + contadorGrupo;
        System.out.println("qtd grupo "+ contadorFinal);
        System.out.println("soma grupo "+alturaGrupo);
        mediaAlturaMulheres = alturaMulheres / contadorMulheres;
        mediaAlturaGrupo = alturaGrupo / contadorFinal;

        System.out.println("A média de altura das mulheres foi: " + f_02.format(mediaAlturaMulheres));
        System.out.println("A média de altura do grupo foi: " + f_02.format(mediaAlturaGrupo));

        scan.close();

    }
}