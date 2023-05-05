package unidade5;

import java.util.Scanner;

public class Uni5Exe05 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o números que termos que deseja calcular");
        int n = scan.nextInt();
        while (n < 2) {
            n = scan.nextInt();
        }

        int num1 = 8;
        int numPar = 0;
        int numImpar = 8;
        System.out.println(num1);
        
        for (int i = 0; i < n; i++) {

            
            if (i % 2 == 0) {
                numPar =  (numImpar + 2) ;
                System.out.println(numPar);
               

            } else {
                
                numImpar = (numPar - 2) * 2;
                System.out.println(numImpar);
                
            }

        }
        scan.close();

    }
}
