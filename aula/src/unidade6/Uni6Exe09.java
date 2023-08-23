package unidade6;

import java.util.Scanner;

public class Uni6Exe09 {
    public static void main(String[] args) {

        int[] clientes = new int[30];
        int[] clientesSexo = new int[30];
        int[] clientesNota = new int[30];
        int[] clientesIdade = new int[30];
        // int notas = 0;
        double media = 0;
        double mediaHomem = 0;
        int notaMaisJovem = 0;
        int mulherJovem = Integer.MAX_VALUE;
        int mulheresAcimaMedia50Anos = 0;
        int notaHomem = 0;
        int qtdNotaHomem = 0;

        lerInformações(clientes, clientesSexo, clientesNota, clientesIdade);
        mediaCinema(clientes, clientesNota, media);
        mediaHomens(clientes, clientesNota, clientesSexo, mediaHomem, notaHomem, qtdNotaHomem);
        notaMulherJovem(clientes, clientesSexo, clientesIdade, clientesNota, mulherJovem, notaMaisJovem);
        notaMais50(clientes, clientesSexo, clientesIdade, clientesNota, media, mulheresAcimaMedia50Anos);
    }

    public static void lerInformações(int[] clientes, int[] clientesSexo, int[] clientesNota, int[] clientesIdade) {
        // lendo sexo e notas e idade
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < clientes.length; i++) {

            System.out.println("Qual o seu sexo? (1=feminino 2=masculino)");
            clientesSexo[i] = scan.nextInt();

            while (clientesSexo[i] < 1 || clientesSexo[i] > 2) {
                System.out.println("Sexo inválido");
                clientesSexo[i] = scan.nextInt();
            }
            int notas = 0;
            System.out.println("De uma nota para o cinema");
            notas = scan.nextInt();
            while (notas < 0 || notas > 10) {
                System.out.println("Nota inválida");
                notas = scan.nextInt();
            }

            clientesNota[i] += notas;
            System.out.println("Qual a sua idade");
            clientesIdade[i] = scan.nextInt();
        }
        scan.close();
    }

    public static void mediaCinema(int[] clientes, int[] clientesNota, double media) {
        // calculando média
        int notasTotais = 0;
        for (int i = 0; i < clientes.length; i++) {
            notasTotais = clientesNota[i] + notasTotais;
        }
        media = notasTotais / clientes.length;
        System.out.println("Média do cinema " + media);
    }

    public static void mediaHomens(int[] clientes, int[] clientesNota, int[] clientesSexo, double mediaHomem,
            int notaHomem, int qtdNotaHomem) {
        // calculando média homem
        for (int i = 0; i < clientes.length; i++) {
            if (clientesSexo[i] == 1) {
                notaHomem += clientesNota[i];
                qtdNotaHomem++;
            }
        }

        mediaHomem = notaHomem / qtdNotaHomem;
        System.out.println("Média de notas dos homens do cinema " + mediaHomem);
    }

    public static void notaMulherJovem(int[] clientes, int[] clientesSexo, int[] clientesIdade, int[] clientesNota,
            int mulherJovem, int notaMaisJovem) {
        // nota mulher mais jovem

        for (int i = 0; i < clientes.length; i++) {
            // mulher mais jovem
            if (clientesSexo[i] == 2 && clientesIdade[i] < mulherJovem) {
                mulherJovem = clientesIdade[i];
                notaMaisJovem = clientesNota[i];
            }
        }
        System.out.println("Nota mulher mais jovem " + notaMaisJovem);

    }

    public static void notaMais50(int[] clientes, int[] clientesSexo, int[] clientesIdade, int[] clientesNota,
            double media, int mulheresAcimaMedia50Anos) {
        // mluheres com mais de 50 anos com nota acima da média

        for (int i = 0; i <= clientes.length; i++) {

            if (clientesSexo[i] == 2 && clientesIdade[i] > 50) {
                if (clientesNota[i] > media) {
                    mulheresAcimaMedia50Anos++;
                }
            }
        }
        System.out.println("Mulherer com mais de 50 anos com nota acima da média: " + mulheresAcimaMedia50Anos);

    }
}