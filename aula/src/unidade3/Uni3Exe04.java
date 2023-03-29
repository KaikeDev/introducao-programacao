package unidade3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DecimalFormat f_02 = new DecimalFormat("0.00");

        System.out.println("Digite a primeira nota do aluno");
        float nota1 = scan.nextFloat();
        while (nota1 < 0 || nota1 > 10) {
            System.out.println("A nota deve ser entre 0 e 10");
            nota1 = scan.nextFloat();
        }

        System.out.println("Digite a segunda nota do aluno");
        float nota2 = scan.nextFloat();
        while (nota2 < 0 || nota2 > 10) {
            System.out.println("A nota deve ser entre 0 e 10");
            nota2 = scan.nextFloat();
        }

        System.out.println("Digite a segunda nota do aluno");
        float nota3 = scan.nextFloat();

        while (nota3 < 0 || nota3 > 10) {
            System.out.println("A nota deve ser entre 0 e 10");
            nota3 = scan.nextFloat();
        }

        double media = ((nota1 * 5) + (nota2 * 3) + (nota3 * 2)) / 10;
        System.out.println("A media é de " + f_02.format(media));

        scan.close();
    }

}
