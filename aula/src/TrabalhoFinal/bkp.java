package TrabalhoFinal;

import java.util.Scanner;

public class bkp {
    public static void main(String[] args) {
        new bkp();
    }

    public bkp() {
        Scanner teclado = new Scanner(System.in);
        char[][] tabuleiro = new char[6][7];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                tabuleiro[i][j] = 'B';
            }
        }

        mostrarTabuleiro(tabuleiro);

        System.out.println("Escolha a cor que você quer jogar: V (vermelho) ou A (azul)");
        char corJogador = teclado.nextLine().toUpperCase().charAt(0);
        while (corJogador != 'V' && corJogador != 'A') {
            System.out.println("Cor inválida");
            corJogador = teclado.nextLine().toUpperCase().charAt(0);
        }

        char corComputador = corJogador == 'V' ? 'A' : 'V';

        while (true) {
            if (corJogador == 'V') {
                System.out.println("Digite a coluna que você quer posicionar");
                int coluna = teclado.nextInt() - 1;
                int linha = encontrarLinhaDisponivel(tabuleiro, coluna);

                if (linha == -1) {
                    System.out.println("Coluna inválida ou cheia. Tente novamente.");
                    continue;
                }

                jogada(tabuleiro, corJogador, linha, coluna);
                mostrarTabuleiro(tabuleiro);
                if (verificarVitoria(tabuleiro, corJogador, linha, coluna)) {
                    System.out.println("Jogador " + corJogador + " venceu!");
                    break;
                }
            } else {
                System.out.println("Vez do computador...");
                int colunaComputador = fazerJogadaComputador(tabuleiro);
                int linhaComputador = encontrarLinhaDisponivel(tabuleiro, colunaComputador);
                jogada(tabuleiro, corComputador, linhaComputador, colunaComputador);
                mostrarTabuleiro(tabuleiro);
                if (verificarVitoria(tabuleiro, corComputador, linhaComputador, colunaComputador)) {
                    System.out.println("Jogador " + corComputador + " (computador) venceu!");
                    break;
                }
            }

            corJogador = trocarJogador(corJogador);
        }
    }

    public void mostrarTabuleiro(char[][] tabuleiro) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(tabuleiro[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("--------------");
        for (int i = 0; i < 7; i++) {
            System.out.print((i + 1) + " ");
        }
        System.out.println("\n");
    }

    public char trocarJogador(char corJogador) {
        if (corJogador == 'V') {
            System.out.println("Próxima jogada: Jogador Azul (A)");
            return 'A';
        } else {
            System.out.println("Próxima jogada: Jogador Vermelho (V)");
            return 'V';
        }
    }

    public void jogada(char[][] tabuleiro, char corJogador, int linha, int coluna) {
        tabuleiro[linha][coluna] = corJogador;
    }

    public int encontrarLinhaDisponivel(char[][] tabuleiro, int coluna) {
        for (int i = 5; i >= 0; i--) {
            if (tabuleiro[i][coluna] == 'B') {
                return i;
            }
        }
        return -1;
    }

    public boolean verificarVitoria(char[][] tabuleiro, char corJogador, int linha, int coluna) {
        // Verificar vitória na horizontal
        for (int i = linha; i <= linha + 3; i++) {
            if (i + 3 < 6 && tabuleiro[i][coluna] == corJogador &&
                    tabuleiro[i + 1][coluna] == corJogador &&
                    tabuleiro[i + 2][coluna] == corJogador &&
                    tabuleiro[i + 3][coluna] == corJogador) {
                return true;
            }
        }

        // Verificar vitória na vertical
        for (int i = linha; i >= linha + 3; i--) {
            if (i >= 3 && tabuleiro[i][coluna] == corJogador &&
                    tabuleiro[i - 1][coluna] == corJogador &&
                    tabuleiro[i - 2][coluna] == corJogador &&
                    tabuleiro[i - 3][coluna] == corJogador) {
                return true;
            }
        }

        // Verificar vitória na diagonal descendente
        for (int i = linha, j = coluna; i <= linha + 3 && j >= coluna - 3; i++, j--) {
            if (i >= 3 && j >= 3 && i < 6 && j < 7 &&
                    tabuleiro[i][j] == corJogador &&
                    tabuleiro[i - 1][j - 1] == corJogador &&
                    tabuleiro[i - 2][j - 2] == corJogador &&
                    tabuleiro[i - 3][j - 3] == corJogador) {
                return true;
            }
            return false;

        }

        // Verificar vitória na diagonal ascendente
        for (

                int i = linha, j = coluna; i >= linha - 3 && j <= coluna + 3; i--, j++) {
            if (i >= 3 && i - 3 >= 0 && j >= 0 && i < 6 && j < 7 &&
                    tabuleiro[i][j] == corJogador &&
                    tabuleiro[i - 1][j + 1] == corJogador &&
                    tabuleiro[i - 2][j + 2] == corJogador &&
                    tabuleiro[i - 3][j + 3] == corJogador) {
                return true;
            }
        }

        return false;

    }

    public int fazerJogadaComputador(char[][] tabuleiro) {

        int coluna = (int) (Math.random() * 7);
        while (encontrarLinhaDisponivel(tabuleiro, coluna) == -1) {
            coluna = (int) (Math.random() * 7);
        }
        return coluna;
    }
}