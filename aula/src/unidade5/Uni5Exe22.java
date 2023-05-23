package unidade5;

import java.text.DecimalFormat;

public class Uni5Exe22 {

    public static void main(String[] args) {

       
        double percentual = 0.015;
        double salarioInicial = (2000 * percentual) + 2000;
        double salarioAtual = salarioInicial;
        DecimalFormat f_02 = new DecimalFormat("0.00");
        int tempo = 1997;

        while(tempo <= 2023){

            percentual = percentual * 2;
            salarioAtual  = (salarioAtual* percentual) + salarioAtual ;
            System.out.println(percentual);
            
            tempo += 1;
        }

        
        System.out.println(tempo);
        System.out.println("O salário atual do funcionário é de: "+f_02.format(salarioAtual));
    }
}