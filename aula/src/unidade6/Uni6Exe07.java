package unidade6;
import java.util.Arrays;
import java.util.Scanner;

public class Uni6Exe07 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Escreva a quantidade de valores");
        int N = scan.nextInt();
        while (N < 0 || N > 20) {
            N = scan.nextInt();
        }
        int[] valores = new int[N];

        lerValores(N, valores);
        ordenaValores(valores);
        escreveValores(valores);
        scan.close();

    }

    public static void lerValores(int N, int[] valores) {

        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < N; i++) {
            int numero = 0;
            numero = scan.nextInt();
            while (existeNumero(valores, i, numero)) {
                System.out.println("Digite outro valor");
                numero = scan.nextInt();
            }
            valores[i] = numero;
            // System.out.println("Valor número"+numero);
            // System.out.println("valor "+valores[i]);
        }
        scan.close();
    }

    public static boolean existeNumero(int[] valores, int i, int numero) {
        for (int j = 0; j < i; j++) {
            if (valores[j] == numero) {
                return true;
            }
        }
        return false;
    }

    public static void ordenaValores(int[] valores) {

        Arrays.sort(valores);

    }

    public static void escreveValores(int[] valores) {
        System.out.println("Ordem crescente");
        for (int i = 0; i < valores.length; i++) {

            System.out.println(valores[i]);
        }
    }
}
