package unidade4;

import java.util.Scanner;

public class Uni4Exe04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número");
        double num = scan.nextDouble();

        while (num <= 0) {
            System.out.println("Número digitado precisa ser maior que 0");
            num = scan.nextDouble();
        }

        if (num != (int) num) {
            System.out.println("Foram digitadas casas decimais");
        }else{
            System.out.println("Não foram digitadas casas decimais");
        }
        scan.close();
    }
}
