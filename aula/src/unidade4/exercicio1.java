package unidade4;

import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome = scan.nextLine().toUpperCase();
        System.out.println(nome.charAt(0) + "" + nome.charAt(6) + "" + nome.charAt(14));
        System.out.println(nome);

        scan.close();

    }

}