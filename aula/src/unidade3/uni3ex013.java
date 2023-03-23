package unidade3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class uni3ex013 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DecimalFormat f_02 = new DecimalFormat("R$ 0.00");

       final  float valorAzulejo = (float)12.50;

       //pegando a altura da parede
       System.out.println("Digite a altura da parede");
       double altura = scan.nextDouble();

       //Pegando o comprimento da parede
       System.out.println("Digite o comprimento da parede");
       double comprimento = scan.nextDouble();

       // calculando a área da parede
       double areaParede = altura * comprimento;

       double valorGasto = (areaParede * valorAzulejo)*9;
       System.out.println("O valor gasto com azulejos é de: "+valorGasto);

       scan.close();
    }
}
