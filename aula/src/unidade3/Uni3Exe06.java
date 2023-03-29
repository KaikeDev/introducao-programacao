package unidade3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe06 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DecimalFormat f_02 = new DecimalFormat("0.00");

        System.out.println("Digite o peso do prato do cliente");
        float pesoPrato = scan.nextFloat();

        double totalaPagar = (pesoPrato + 0.750) * 25;
        System.out.println("O valor que o cliente terá que pagar é de: R$ "+f_02.format(totalaPagar) );

        scan.close();
    }
}
