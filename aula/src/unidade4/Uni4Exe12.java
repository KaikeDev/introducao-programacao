package unidade4;

import java.util.Scanner;

public class Uni4Exe12 {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro lado do triângulo");
        double lado1 = scan.nextDouble();

        System.out.println("Digite o segundo lado do triângulo");
        double lado2 = scan.nextDouble();

        System.out.println("Digite o terceiro lado do triângulo");
        double lado3 = scan.nextDouble();

        if (lado1 < (lado2 + lado3) && lado2 < (lado1 + lado3) && lado3 < (lado1 + lado2)) {

            if (lado1 == lado2 && lado1 == lado3) {

                System.out.println("É um triângulo equilátero");
            } else if (lado1 == lado2 && lado1 != lado3 || lado1 == lado3 && lado1 != lado2
                    || lado2 == lado3 && lado2 != lado1) {

                System.out.println("É um triângulo Isósceles");
            }else{
                System.out.println("É um triângulo Escaleno");
            }
        } else {
            System.out.println("Não formam um triângulo");
        }

        scan.close();
    }
}
