package unidade5;

import java.text.DecimalFormat;

public class Uni5Exe04 {
    public static void main(String[] args) {

        DecimalFormat f_02  = new DecimalFormat("0.00");
        
         double S = 0;
         double denominador = 2;
         for (int i = 1; i <= 20; i++) {
         
         
         double numerador = 2* i +1;
         S += numerador / denominador;
         
         
         denominador = denominador +(20 - 1)* 4;
         }
         System.out.println("A soma é igual a: " + S);
         
    }

}
