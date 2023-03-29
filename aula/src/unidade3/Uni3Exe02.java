package unidade3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat f_02 = new DecimalFormat("0.00");

        System.out.println("Digite o preço do par de sapatos");
        float precoPar = scan.nextFloat();

        double desconto = precoPar * 0.12;
        double precoNovo = precoPar - desconto;
        System.out.println("O valor do desconto é de R$ " + f_02.format(desconto));
        System.out.println("O preço do par de sapatos com desconto é R$ " + f_02.format(precoNovo));
        scan.close();
    }

}
