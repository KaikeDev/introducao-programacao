package unidade5;
import java.util.Scanner;

public class Uni5Exe29 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Escreva o valor");
        int valor = scan.nextInt();

        while(valor < 0){
            System.out.println("Valor inválido");
            valor = scan.nextInt();
        }

        int nota1 = 0;
        int nota2 = 0;
        int nota5 = 0;
        int nota10 = 0;
        int nota20 = 0;

        while(valor >0){
            nota20 = valor / 20;
            valor %= 20;

            nota10 = valor / 10;
            valor %= 10;

            nota5 = valor / 5;
            valor %= 5;


            nota2 = valor / 2;
            valor %= 2;

            nota1 = valor / 1;
            valor %= 1;

        }

        System.out.println("Notas de 20: " + nota20);
        System.out.println("Notas de 10: " + nota10);
        System.out.println("Notas de 5: " + nota5);
        System.out.println("Notas de 2: " + nota2);
        System.out.println("Notas de 1: " + nota1);
        scan.close();
    }
}