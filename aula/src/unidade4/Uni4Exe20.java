package unidade4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni4Exe20 {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        DecimalFormat f_02 = new DecimalFormat("0.00");

        System.out.println("Digite a nota da primeira prova do aluno");
        double notaProva1 = scan.nextDouble();

        System.out.println("Digite a nota da segunda prova do aluno");
        double notaProva2 = scan.nextDouble();

        System.out.println("Digite a nota da terceira prova do aluno");
        double notaProva3 = scan.nextDouble();

        System.out.println("Digite a nota da média dos exercícios do aluno");
        double notaExercicios = scan.nextDouble();

        double media = (notaProva1 + notaProva2 * 2 + notaProva3 * 3 + notaExercicios) / 7;

        char conceito = ' ';

        if (media >= 9) {
            conceito = 'A';
        } else if (media >= 7.5 && media < 9) {
            conceito = 'B';
        } else if (media >= 6 && media < 7.5) {
            conceito = 'C';
        } else if (media >= 4 && media < 6) {
            conceito = 'D';
        } else {
            conceito = 'E';
        }

        if (conceito == 'A' || conceito == 'B' || conceito == 'C') {
            System.out.println("A media do aluno foi: " + f_02.format(media));
            System.out.println("O conceito foi: " + conceito);
            System.out.println("Aluno está aprovado");
        } else {
            System.out.println("A media do aluno foi: " + f_02.format(media));
            System.out.println("O conceito foi: " + conceito);
            System.out.println("Aluno está reprovado");
        }

        scan.close();
    }
}
