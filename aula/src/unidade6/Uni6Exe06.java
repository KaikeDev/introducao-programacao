package unidade6;

import java.util.Scanner;

public class Uni6Exe06 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor");
        int N = scan.nextInt();
        double[] valores = new double[N];
        lerValores(valores, N);

        System.out.print("Digite o valor a ser buscado: ");
        double valorBusca = scan.nextDouble();
        boolean encontrado = verificaValores(valores, valorBusca);
        if (encontrado) {
            System.out.println("Valor está dentro do vetor");
        } else {
            System.out.println("Valor não está dentro do vetor");
        }

        scan.close();
    }

    public static void lerValores(double[] valores, int N) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < N; i++) {
            valores[i] = scanner.nextDouble();
        }
        scanner.close();
    }

    public static boolean verificaValores(double[] valores, double valorBusca) {

        for (double elemento : valores) {
            if (elemento == valorBusca) {
                return true;
            }
        }
        return false;

    }
}