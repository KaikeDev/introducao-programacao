package unidade5;

import java.util.Scanner;

public class Uni5Exe30{
    
        public static void main(String[] args) {
            
            Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor inicial (N): ");
        int n = scanner.nextInt();

        System.out.print("Digite o decremento (K): ");
        int k = scanner.nextInt();

        System.out.print("Digite o tamanho da mochila (M): ");
        int m = scanner.nextInt();

        int somaElementosNaMochila = 0;
        int somaElementosForaDaMochila = 0;

        System.out.print("Elementos a serem colocados na mochila: ");

        int valorAtual = n;
        while (m >= valorAtual && valorAtual > 0) {
            System.out.print(valorAtual + " ");
            somaElementosNaMochila += valorAtual;
            valorAtual -= k;
        }

        System.out.print("\nElementos que entraram na mochila: ");

        valorAtual = n;
        while (m >= valorAtual && valorAtual > 0) {
            System.out.print(valorAtual + " ");
            valorAtual -= k;
        }

        System.out.print("\nElementos que ficaram fora da mochila: ");

        valorAtual = n - k;
        while (valorAtual > 0) {
            System.out.print(valorAtual + " ");
            somaElementosForaDaMochila += valorAtual;
            valorAtual -= k;
        }

        System.out.println("\nSoma dos elementos que entraram na mochila: " + somaElementosNaMochila);
        System.out.println("Soma dos elementos que não entraram na mochila: " + somaElementosForaDaMochila);
        scanner.close();
    }
    }