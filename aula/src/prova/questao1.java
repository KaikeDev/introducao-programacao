package prova;

import java.util.Scanner;

public class questao1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome = scan.next();

        if (nome.equals("")) {
            System.out.println("Dados inválidos");

        } else {
            int anoNascimento = scan.nextInt();
            if (anoNascimento < 1900) {
                System.out.println("Dados inválidos");
            } else {
                int idade = 2023 - anoNascimento;
                System.out.println("Nome: " + nome + " Idade: "+ idade);
            }
            scan.close();
        }

    }
}