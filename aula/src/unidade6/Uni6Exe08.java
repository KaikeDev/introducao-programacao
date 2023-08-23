package unidade6;

import java.util.Scanner;

public class Uni6Exe08 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a quantidade de valores do ");
        int N = scan.nextInt();
        while (N < 0 || N > 20) {
            N = scan.nextInt();
        }

        double[] valores = new double[N];

        for (int i = 0; i < N; i++) {
            System.out.println("Escreva os valores");
            valores[i] = scan.nextDouble();
        }

        scan.close();
        lerValores(valores);
        // mostraValores(valores, N, qtdValores);

    }

    public static void lerValores(double[] vetor) {
        int[] contagemValores = new int[vetor.length];
        int contador = 0;

        for (int i = 0; i < vetor.length; i++) {
            boolean valorExistente = false;

            for (int j = 0; j < contador; j++) {
                if (vetor[i] == vetor[j]) {
                    valorExistente = true;
                    contagemValores[j]++;
                    break;
                }
            }

            if (!valorExistente) {
                contagemValores[contador] = 1;
                contador++;
            }

        }

        System.out.println("Valor \t Frequência");
        for (int j = 0; j < contador; j++) {
            System.out.println(vetor[j] + "\t\t" + contagemValores[j]);
        }

    }

}