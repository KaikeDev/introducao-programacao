package unidade4;

import java.util.Scanner;

public class Uni4Exe14 {

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o dia");
        int dia = scan.nextInt();

        System.out.println("Digite o mês");
        int mes = scan.nextInt();
        System.out.println("Digite o ano");
        int ano = scan.nextInt();

        if (dia >= 1 && dia < 32 && mes >= 1 && mes <= 12 && ano > 0) {

            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                System.out.println("Data válida");
            } else if (mes != 2 && dia < 31) {
                System.out.println("Data válida");
            } else if (mes == 2 && dia < 29) {
                System.out.println("Data válida");
            } else if (dia == 29 && ano % 4 == 0 && !(ano % 100 == 0 && ano % 400 != 0)) {

                System.out.println("Data válida");
            } else {
                System.out.println("Data não válida");
            }
        } else {
            System.out.println("Data não válida");
        }

        scan.close();
    }
}
