package unidade5;

import java.util.Scanner;

public class Uni5Exe07 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número de valores");
        int n = scan.nextInt();

        double maior = Double.NEGATIVE_INFINITY; // inicializa com o menor valor possível
        double menor = Double.POSITIVE_INFINITY; // inicializa com o maior valor possível

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite o " + i + "º número: ");
            double num = scan.nextDouble();
            if (num > maior) {
                maior = num;
            }
            if (num < menor) {
                menor = num;
            }
        }

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);

        scan.close();

    }

}