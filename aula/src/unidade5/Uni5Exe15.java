package unidade5;

import java.util.Scanner;

public class Uni5Exe15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Escreva o nome do aluno");
        String nome = scan.nextLine().toLowerCase();

        while (!nome.equals("fim")) {
            System.out.println("Escreva a primeira nota");
            double nota1 = scan.nextDouble();

            while (0 > nota1 || nota1 > 10) {
                System.out.println("Nota deve ser entre 0 e 10");
                nota1 = scan.nextDouble();
            }

            System.out.println("Escreva a segunda nota");
            double nota2 = scan.nextDouble();

            while (0 > nota2 || nota2 > 10) {
                System.out.println("Nota deve ser entre 0 e 10");
                nota2 = scan.nextDouble();
            }

            double media = 0;
            media = (nota1 + nota2) / 2;
            System.out.println("A média do aluno: " + nome + " foi: " + media);

            System.out.println("Escreva o nome do próximo aluno");
            nome = scan.next();
        }

        scan.close();
    }
}