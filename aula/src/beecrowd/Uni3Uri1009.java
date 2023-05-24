package unidade3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Uri1009 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("R$  0.00");
       
        String nomeVendedor = scan.nextLine();
        double salario = scan.nextDouble();
        double vendasMes = scan.nextDouble();
        double salarioFinal = salario + (vendasMes * 0.15);

        System.out.println("TOTAL = " + df_2.format(salarioFinal));
        scan.close();

    }
}
