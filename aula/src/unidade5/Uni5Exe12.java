package unidade5;

import java.util.Scanner;

public class Uni5Exe12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int numero = 1;

        for(int linha = 1; linha <= n; linha++) {
            for(int coluna = 1; coluna <= linha; coluna++) {
             System.out.print(numero + " ");
             numero++;
            }
            System.out.println();
        }

        scan.close();
    }
}
