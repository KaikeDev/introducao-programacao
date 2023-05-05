package unidade5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe08 {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DecimalFormat f_02 = new DecimalFormat("0.00");

        System.out.println("Escreva a quantidade de números que deseja");
        int n = scan.nextInt();

        double num = 0;
        int qtdPositivo = 0;
        double soma = 0;
        double menor = 0;
        for(int i = 1; i <= n; i++) {

            System.out.println("Digite o "+ i +"° número");
            num = scan.nextDouble();
            if(num > 0 ){
                soma += num;
                qtdPositivo++;
            }else if(num < menor){
                menor = num;
        
            }
        }
        
       
        if (menor == 0) {
            System.out.println("Não foi digitado nenhum número negativo.");
        } else {
            System.out.println("Menor valor negativo: " + menor);
        }

        if (qtdPositivo == 0) {
            System.out.println("Não foi digitado nenhum número positivo.");
        } else {
            double media = soma / qtdPositivo;
            System.out.println("A média dos números psositivos foi de: "+f_02.format(media));
        }
        scan.close();
    }
}
