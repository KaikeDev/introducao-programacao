package unidade3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Uri1010 {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        DecimalFormat f_02 = new DecimalFormat("R$ 0.00");

        int codPeca1 = scan.nextInt();
         int numPecas1 = scan.nextInt(); 
         double valorUnitario1 = scan.nextDouble();

        
        int codPeca2 = scan.nextInt();
        int numPecas2 = scan.nextInt();
        double valorUnitario2 = scan.nextDouble();

        double totalPagarPeca1 = numPecas1 * valorUnitario1;

        double totalPagarPeca2 = numPecas2 * valorUnitario2;

        double totalPagar = totalPagarPeca1 + totalPagarPeca2;

        System.out.println("VALOR A PAGAR: " + f_02.format(totalPagar));

        scan.close();
    }
}
