package unidade4;

import java.util.Scanner;

public class Uni4Exe03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Escreva um número inteiro");
        int valor1 = scan.nextInt();

        System.out.println("Escreva outro número inteiro");
        int valor2 = scan.nextInt();

        if(valor1 > valor2) {
            System.out.println("O maior número é o número: " + valor1);
        }else{
            System.out.println("O maior número é o número: " + valor2);
        }
        scan.close();
    }
}
