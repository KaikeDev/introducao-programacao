package unidade5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe32 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Escreva qual dia da semana cai o primeiro dia do mês");
        int p = scan.nextInt();

        System.out.println("Escreva quantos dias o mês possui");
        int n = scan.nextInt();

        System.out.println("Dom Seg Ter Qua Qui Sex Sab");

        int espacos = p - 1;

        while (espacos > 0) {
            System.out.print("    ");
            espacos--;
        }

        int dia = 1;

        while(dia <= n){
            System.out.printf("%3d ", dia);

            if(p == 7){
                System.out.println();
                p = 1;
            }else{
                p++;
            }
            dia++;
        }
        scan.close();
    }
}