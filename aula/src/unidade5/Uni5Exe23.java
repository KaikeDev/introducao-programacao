package unidade5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe23 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DecimalFormat f_02 = new DecimalFormat("0.00");

        System.out.println("Deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)");
        char resp = scan.nextLine().charAt(0);

        while (resp == 's') {

            double totalVendas = 0;
            double salarioVendedor = 0;
            System.out.println("Qual o nome do vendedor?");
            String nome = scan.next();

            System.out.println("Quantos produtos o vendedor " + nome + " vendeu?");
            int numProdutosVendidos = scan.nextInt();

            if(numProdutosVendidos > 0 ){

                while (numProdutosVendidos != 0) {
                    System.out.println("Escreva o preço do produto vendido");
                    double precoProduto = scan.nextDouble();
                    System.out.println("Escreva a quantidade vendida desse produto");
                    int qtdVendida = scan.nextInt();

                    totalVendas = (precoProduto * qtdVendida) + totalVendas;
                    
                    numProdutosVendidos--;
    
                }
                salarioVendedor += (totalVendas * 30) / 100;
    
                System.out.println("O vendedor " + nome + " vendeu um total de: " + totalVendas
                        + " e obteve um salário de: " + f_02.format(salarioVendedor));
                
            }else{
                System.out.println("Números de produtos digitado incorreto");
            }
            System.out.println("Deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)");
                resp = scan.next().charAt(0);
            
        }

        scan.close();

    }
}
