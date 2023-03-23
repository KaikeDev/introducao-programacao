package unidade3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class uni3ex010 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DecimalFormat f_02 = new DecimalFormat(" 0.00");

        System.out.println("Digite o valor do primeiro cateto");
        double cateto1 = scan.nextDouble();

        System.out.println("Digite o valor do segundo cateto");
        double cateto2 = scan.nextDouble();

        double hipotenusa = Math.sqrt((cateto1 * cateto1) + (cateto2 * cateto2));
        System.out.println("O valor da hipotenusa é de: " + f_02.format(hipotenusa));

        scan.close();
    }
}
