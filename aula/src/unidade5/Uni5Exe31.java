package unidade5;

import java.util.Scanner;

public class Uni5Exe31 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor a ser calculado");
        int valor = scan.nextInt();
        while(valor < 0){
            System.out.println("Valor inválido ");
            valor = scan.nextInt();
        }

        int numPrimo = 2;

        while (valor > 1) {

            valor = Math.abs(valor);
            if (valor % numPrimo == 0) {
                System.out.print("Número: " + valor);
                System.out.println(" Decomposição " + numPrimo);
                valor /= numPrimo;
            } else {
                numPrimo++;
            }
            
        }
        System.out.println("Número: "+valor);
        scan.close();
    }
}