package unidade5;

import java.util.Scanner;

public class Uni5Exe01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numeroRepeticoes = 20;

        for (int i = 0; i < numeroRepeticoes; i++) {

            System.out.println(" ");
            System.out.println("Escreva um número");
            int numero = scan.nextInt();
            if (numero % 2 == 0) {
                System.out.println("O número é par");
            } else {
                System.out.println("O número é impar");
            }
        }
        scan.close();

    }
}