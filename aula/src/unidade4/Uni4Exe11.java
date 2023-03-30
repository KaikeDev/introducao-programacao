package unidade4;

import java.util.Scanner;

public class Uni4Exe11 {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        System.out.println("Escreva o ano de nascimento do primeiro filho");
        int anoNascimento1 = scan.nextInt();

        System.out.println("Escreva o ano de nascimento do segundo filho");
        int anoNascimento2 = scan.nextInt();

        System.out.println("Escreva o ano de nascimento do terceiro filho");
        int anoNascimento3 = scan.nextInt();

        if (anoNascimento1 == anoNascimento2 && anoNascimento1 == anoNascimento3) {
            System.out.println("TRIGÊMEOS");
        } else if (anoNascimento1 == anoNascimento2 && anoNascimento1 != anoNascimento3
                || anoNascimento1 == anoNascimento3 && anoNascimento1 != anoNascimento2
                || anoNascimento2 == anoNascimento3 && anoNascimento2 != anoNascimento1) {
            System.out.println("GÊMEOS");
        } else {
            System.out.println("APENAS IRMÃOS");
        }
        scan.close();
    }
}
