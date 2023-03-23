package unidade3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class uni3ex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat f_02 = new DecimalFormat("0.00");
        System.out.println("Digite a largura do retângulo");
        float largura = scan.nextFloat();

        System.out.println("Digite o comprimento do retângulo");
        float comprimento =  scan.nextFloat();

        float area = largura * comprimento;
        System.out.println("A área do retângulo é de: " +f_02.format(area));
        
        scan.close();
    }
}
