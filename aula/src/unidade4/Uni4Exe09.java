package unidade4;

import java.util.Scanner;

public class Uni4Exe09 {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        System.out.println("Escreve um número inteiro");
        int num1 = scan.nextInt();

        System.out.println("Escreve outro número inteiro");
        int num2 = scan.nextInt();

        if(num1 % num2 == 0 || num2 % num1 == 0) {
            System.out.println("Os números são múltiplos");
        }else{
            System.out.println("Os números não são múltiplos");
        }
        scan.close();
    }
}
