package unidade3;

import java.text.DecimalFormat;
import java.util.Scanner;

import javax.swing.plaf.FontUIResource;

public class uni3ex011 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DecimalFormat f_02 = new DecimalFormat(" 0.00");

        System.out.println("Digite o valor da temperatura em C°");
        double temperaturaC = scan.nextDouble();

        
        double temperaturaF = 1.8 * temperaturaC +32 ;
        System.out.println("A temperatura em celsius é de: " + f_02.format(temperaturaF));
        scan.close();
    }
}
