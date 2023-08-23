package TrabalhoFinal;
import java.util.Scanner;

public class Liga4Thi {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char[][] tabuleiro = new char[6][7];
        boolean validaCor = false;
        char corJogador = 'V';
        char corMaquina = 'A';
        boolean turnoJogador = true;

        while(!validaCor) {
            System.out.println("Informe a cor:");
            corJogador = Character.toUpperCase(teclado.next().charAt(0));
            if (corJogador == 'A') {
                corMaquina = 'V';
                validaCor = true;
                break;
            } else if (corJogador == 'V') {
                corMaquina = 'A';
                validaCor = true;
                break;
            }
            System.out.println("Cor inválida!");
        }

        resetaTabuleiro(tabuleiro);

        while(true) {
            imprimeTabuleiro(tabuleiro);
            if (turnoJogador == true) {
                System.out.println("Informe a coluna:");
                int coluna = teclado.nextInt();

                if(jogar(tabuleiro, coluna, corJogador)){
                    if (checaVitoria(tabuleiro)) {
                        imprimeTabuleiro(tabuleiro);
                        System.out.println("Jogador venceu! Deseja jogar novamente? (aperte N para sair).");
                        char sair = Character.toUpperCase(teclado.next().charAt(0));
                         if (sair == 'N') {
                             break;
                         }
                        resetaTabuleiro(tabuleiro);
                    }
                turnoJogador = false;
                } else {
                    System.out.println("Movimento inválido. Tente novamente.");
                }
            } else {
                if(jogar(tabuleiro, geraAleatorio(), corMaquina)){
                    if (checaVitoria(tabuleiro)) {
                        imprimeTabuleiro(tabuleiro);
                        System.out.println("A máquina venceu!");
                        break;
                    }
                turnoJogador = true;
                } else {
                    System.out.println("Movimento inválido. Tente novamente.");
                }
            }
        } 
        teclado.close();
    }

    public static void resetaTabuleiro(char[][] tabuleiro) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                tabuleiro[i][j] = 'B';
            }
        }
    }

    public static void imprimeTabuleiro(char[][] tabuleiro) {
        for (char[] linha : tabuleiro) {
            System.out.print("|");
            for (char coluna : linha) {
                System.out.print(coluna);
                System.out.print("|");
            }
            System.out.println();
        }
        System.out.println("---------------");
        System.out.println("|1|2|3|4|5|6|7|");
        System.out.println();
    }

    public static boolean jogar(char[][] tabuleiro, int coluna, char cor) {
        if (coluna <= 0 || coluna >= 8) 
            return false;

        for (int i = 5; i >= 0; i--) {
            if(tabuleiro[i][coluna - 1] == 'B') {
                tabuleiro[i][coluna - 1] = cor;
                return true;
            }
        }
        return false;
    }

    public static boolean checaVitoria(char[][] tabuleiro) {
        for (int linha = 0; linha < 6; linha++) {
            for (int coluna = 0; coluna < 7; coluna++) {
                if (tabuleiro[linha][coluna] != 'B' && checaDirecoes(tabuleiro, linha, coluna))
                return true;
            }
        }
        return false;
    }

    public static boolean checaDirecoes(char[][] tabuleiro, int linha, int coluna) {
        int[][] direcoes = {{1,0}, {0,1}, {1,1}, {1,-1}};

        for (int[] direcao : direcoes) {
            if (checaDirecao(tabuleiro, linha, coluna, direcao[0], direcao[1]))
                return true;
        }
        return false;
    }

    public static boolean checaDirecao(char[][] tabuleiro, int linha, int coluna, int diagonalLinha, int diagonalColuna) {
        char base = tabuleiro[linha][coluna];
        for (int i = 1; i < 4; i++) {
            int ni = linha + diagonalLinha * i;
            int nj = coluna + diagonalColuna * i;

            if (ni < 0 || ni >= 6 || nj < 0 || nj >= 7 || tabuleiro[ni][nj] != base) {
                return false;
            }
        }
        return true;
    }

    public static int geraAleatorio() {
        int minimo = 1;
        int maximo = 7;
        int range = maximo - minimo + 1;
        int aleatorio = (int) (Math.random() * range) + minimo;
        return aleatorio;
    }
}
