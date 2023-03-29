package unidade4;

import java.util.Scanner;

public class Uni4Exe02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um valor inteiro maior do que 0");
        int valor = scan.nextInt();

        while (valor <= 0) {
            System.out.println("O valor digitado precisa ser maior que 0");
            valor = scan.nextInt();
        }
        if(valor % 2 ==0){
            System.out.println("O número: " + valor+ " é par");
        }else{
            System.out.println("O número: " + valor+ " é impar");
        }

        scan.close();
    }
}
