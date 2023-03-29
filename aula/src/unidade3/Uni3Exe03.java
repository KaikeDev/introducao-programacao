package unidade3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DecimalFormat f_02 = new DecimalFormat("0.00");
        System.out.println("Digite o preço do litro da gasolina");
        float precoGasolina = scan.nextFloat();

        System.out.println("Digite o valor do pagamento");
        float valorPago = scan.nextFloat();

        float litros = valorPago / precoGasolina;
        System.out.println("Você conseguiu colocar " + f_02.format(litros) + " litros de gasolina");

        scan.close();
    }
}
