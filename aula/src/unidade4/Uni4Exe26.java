package unidade4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni4Exe26 {

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        DecimalFormat f_02 = new DecimalFormat("0.00");

        System.out.println("Escolha uma opção:");
        System.out.println(" 'T': calcular a área de um triângulo de base b e altura h");
        System.out.println("'Q': calcular a área de um quadrado de lado l");
        System.out.println("'R': calcular a área de um retângulo de base b e altura h");
        System.out.println(" 'C': calcular a área de um círculo de raio r");

        char opcao = scan.nextLine().toUpperCase().charAt(0);

        switch (opcao) {
            case 'T':
                System.out.println("Escreva a base de um triângulo");
                double base = scan.nextDouble();

                System.out.println("Escreva a altura de um triângulo");
                double altura = scan.nextDouble();

                double areaTriangulo = (base * altura) / 2;
                System.out.println("Área do triângulo: "+f_02.format(areaTriangulo));

                break;

                case 'Q':
                System.out.println("Escreva o lado do quadrado");
                double lado = scan.nextDouble();
                double areaQuadrado = lado * lado ;
                System.out.println("A área do quadrado é: "+f_02.format(areaQuadrado)); 
                break;

                case 'R':
                System.out.println("Escreva a base do retângulo");
                double baseRetangulo = scan.nextDouble();
        
                System.out.println("Escreva a altura do retângulo");
                double alturaRetangulo = scan.nextDouble();
                double areaRetangulo = baseRetangulo * alturaRetangulo;
                System.out.println("A área do retângulo é: "+f_02.format(areaRetangulo));
                break;

                case 'C':
                System.out.println("Escreva o raio do círculo");
                double raioCirculo = scan.nextDouble();

                double areaCirculo = Math.pow(raioCirculo, 2)* Math.PI ;
                System.out.println("Área do circulo é: "+f_02.format(areaCirculo));

                break;
                default:
                System.out.println("Opção inválida");
        }
        scan.close();
    }

}
