package unidade3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe09 {
        public static void main(String[] args) {
    
            Scanner scan = new Scanner(System.in);
            DecimalFormat f_02 = new DecimalFormat(" 0.00");

            System.out.println("Digite o valor do raio");
            double raio = scan.nextDouble();
            System.out.println("Digite o valor da altura");
            double altura = scan.nextDouble();


           double volume = Math.PI * (raio * raio) * altura; 
           System.out.println("O volume é de: "+f_02.format(volume));

           scan.close();
        }
}
