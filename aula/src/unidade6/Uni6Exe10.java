package unidade6;

import java.util.Arrays;
import java.util.Scanner;

public class Uni6Exe10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a quantidede de valores que terá no vetor");
        int N = scan.nextInt();

        int[] valor = new int[N];

        int opcaoMenu;

        do {
            System.out.println("Digite a opção que você quer do menu:");
            System.out.println("1 - Incluir valor");
            System.out.println("2 - Pesquisar valor");
            System.out.println("3 - Alterar valor");
            System.out.println("4 - Excluir valor");
            System.out.println("5 - Mostrar valores");
            System.out.println("6 - Ordenar valores");
            System.out.println("7 - Inverter valores");
            System.out.println("8 - Sair do sistema");
            opcaoMenu = scan.nextInt();

            switch (opcaoMenu) {
                case 1:
                    incluirValor(valor);
                    break;
                case 2:
                    pesquisaValor(valor);
                    break;

                case 3:
                    alterarValor(valor);
                    break;

                case 4:
                    excluirValor(valor);
                    break;

                case 5:
                    mostrarValores(valor);
                    break;

                case 6:
                    ordenarValores(valor);
                    break;

                case 7:
                    inverterValores(valor);
                    break;
                case 8:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Digite um número de 1 a 8.");
                    break;

            }
        } while (opcaoMenu != 8);

        System.exit(0);
        scan.close();
    }

    public static void incluirValor(int[] valor) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor a ser incluído:");
        int valorIncluir = scanner.nextInt();

        for (int i = 0; i < valor.length; i++) {
            if (valor[i] == valorIncluir) {
                System.out.println("Valor já está presente no vetor.");
                return;
            }
        }

        for (int i = 0; i < valor.length; i++) {
            if (valor[i] == 0) {
                valor[i] = valorIncluir;
                System.out.println("Valor incluído no vetor.");
                return;
            }
        }

        System.out.println("Não é possível incluir mais valores. O vetor está cheio.");
        return;
    }

    public static void pesquisaValor(int[] valor) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor a ser pesquisado");
        int valorPesquisado = scanner.nextInt();
        for (int i = 0; i < valor.length; i++) {
            if (valorPesquisado == valor[i]) {
                System.out.println("Valor está dentro do vetor");
                return;
            }
            
        }
        System.out.println("Valor não está dentro do vetor");
    }

    public static void alterarValor(int[] valor) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor que você quer alterar");
        int valorAlterar = scan.nextInt();
        int valorTrocar = 0;

        for (int i = 0; i < valorAlterar; i++) {
            if (valorAlterar == valor[i]) {
                System.out.println("Digite o valor que você quer colocar no lugar");
                valorTrocar = scan.nextInt();
                return;
            }
            valorTrocar = valor[i];
        }
        System.out.println("Número não encontrado");
        return;
    }

    public static void excluirValor(int[] valor) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor a ser excluido");
        int excluirValor = scan.nextInt();

        for (int i = 0; i < valor.length; i++) {
            if (excluirValor == valor[i]) {
                System.out.println("Valor excluido");
                valor[i] = 0;
            } else {

            }
        }
        System.out.println("Valor não está dentro do vetor");
        return;

    }

    public static void mostrarValores(int[] valor) {
        System.out.println("Os valores armazenados no vetor são");
        for (int i = 0; i < valor.length; i++) {
            System.out.println(valor[i]);
        }
    }

    public static void ordenarValores(int[] valor) {
        Arrays.sort(valor);
        System.out.println("Valores ordenados");
        for (int i = 0; i < valor.length; i++) {
            System.out.println(valor[i]);
        }
    }

    public static void inverterValores(int[] valor) {
        int temp = 0;
        int[] valores = valor;
        System.out.println("Ordem invertida");
        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < i; j++) {
                temp = valores[i];
                valores[i] = valores[j];
                valores[j] = temp;
            }
        }
        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);
        }
    }
}