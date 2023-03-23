package unidade3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class uni3ex015 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DecimalFormat f_02 = new DecimalFormat("Km 0.00");
        System.out.println("Digite um número");
        int numero = scan.nextInt();
        int centena = 0, dezena = 0, unidade = 0;
        if (numero > 999) {
            System.out.println("Digite um número com no máximo 3 digitos");
            numero = scan.nextInt();
        }
        /*
         * if (numero > 99) {
         * centena = numero/100;
         * }
         * if(numero >9 ){
         * dezena = centena/10;
         * }
         */

        centena = numero / 100;
        dezena = (numero % 100) / 10;
        unidade = (numero %100) % 10;

        System.out.println(centena + " Centena(s) " + dezena + " dezena(s) " + unidade + " unidade(s)");

        scan.close();
    }
}
