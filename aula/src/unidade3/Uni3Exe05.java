package unidade3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DecimalFormat f_02 = new DecimalFormat("0.00");

        System.out.println("Digite o número de frangos que há na granja");
        int numeroFrangos = scan.nextInt();

        double gastoTotal = (numeroFrangos * 4 )+ (numeroFrangos * 7);
        System.out.println("O valor gasto com os frangos é de: R$ "+gastoTotal);
        scan.close();
    }
}
