package unidade4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni4Exe07 {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        DecimalFormat f_02 = new DecimalFormat("R$ 0.00");

        System.out.println("Escreva o peso da carta em gramas ");
        double peso = scan.nextDouble();

        while(peso <=0){
            System.out.println("Peso digitado errado");
            peso = scan.nextDouble();
        }
        double valorPagar = 0;

        if (peso <= 50) {
            valorPagar = 0.45;
        } else {
            double pesoExcedido = peso - 50;
            double qtdAdicional = (pesoExcedido / 20) + 1;
            valorPagar = 0.45 + 0.45 * qtdAdicional;
        }

        System.out.println("Custo do selo é de: " + f_02.format(valorPagar));
        scan.close();
    }
}