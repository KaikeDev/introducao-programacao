package unidade5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe18 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DecimalFormat f_02 = new DecimalFormat("0.00");

        System.out.println("Escreva qual canal as pessoas da casa estavam assistindo ");
        int canal = scan.nextInt();
        int contador4 = 0;
        int contador5 = 0;
        int contador9 = 0;
        int contador12 = 0;
        int totalPessoas = 0;

        while (canal != 0) {

            System.out.println("Digite o número de pessoas que estão assistindo a TV");
            int numPessoas = scan.nextInt();
             
            if (canal == 4) {
                contador4+=numPessoas;
                
            } else if (canal == 5) {
                contador5 +=numPessoas;
                
            } else if (canal == 9) {
                contador9 += numPessoas;
            } else if (canal == 12) {
                contador12 += numPessoas;

            }else{
                System.out.println("Canal inválido");
                numPessoas = 0;
            }

            totalPessoas += numPessoas;
            System.out.println("Escreva qual canal as pessoas da casa estavam assistindo");
            canal = scan.nextInt();

        }
    
       
        System.out.println(f_02.format(((double)contador4 / totalPessoas)*100) + " estavam assistindo ao canal 4");
        System.out.println(f_02.format(((double) contador5 / totalPessoas) * 100) + " estavam assistindo ao canal 5");
        System.out.println(f_02.format((( double)contador9 / totalPessoas) *100) + " estavam assistindo ao canal 9");
        System.out.println(f_02.format(((double) contador12 / totalPessoas)*100) + " estavam assistindo ao canal 12");
        scan.close();

    }
}