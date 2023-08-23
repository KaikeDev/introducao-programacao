package unidade6;

import java.util.Scanner;

public class Uni6Exe01 {

    public static void main(String[] args) {

        int [] numeros = new int[10];
        lerNumero(numeros);
        escreveNumero(numeros);
        
    }
        public static void  lerNumero(int[] numeros){
            Scanner scan = new Scanner(System.in);
            for(int i = 0; i < 10; i++){
                numeros[i]= scan.nextInt();
            }
            scan.close();
        }

            public static void escreveNumero(int[] numeros){
                System.out.println("Números ordem inversa:");
                for(int i = numeros.length - 1; i >= 0; i--){
                   System.out.println(numeros[i]);
                }
        }
}