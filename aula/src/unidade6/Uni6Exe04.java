package unidade6;

import java.util.Scanner;

public class Uni6Exe04 {
    public static void main(String[] args) {

        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] vetor3 = new int[10];
        lerValores(vetor1, vetor2);
        somaVetores(vetor1, vetor2, vetor3);
        mostraValores(vetor3); 

    }

    public static void lerValores(int[] vetor1, int[] vetor2) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite os números do primeiro vetor");
        for (int i = 0; i < 10; i++) {
            vetor1[i] = scan.nextInt();

        }

        System.out.println("Digite os números do segundo vetor");
        for (int i = 0; i < 10; i++) {
            vetor2[i] = scan.nextInt();
        }
        scan.close();
    }

    public static void somaVetores(int[] valores1, int[] valores2, int[] valores3) {

        for (int i = 0; i < valores1.length; i++) {
            valores3[i] = valores1[i] + valores2[i];
        }
    }

    public static void mostraValores(int[] valores1) {
        System.out.println("Soma dos valores");
        for (int valor : valores1) {
            System.out.println("Soma dos elementos na posição " + valores1.length + " é: " + valor);
        }
    }
}