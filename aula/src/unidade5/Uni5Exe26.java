package unidade5;
import java.util.Scanner;

public class Uni5Exe26 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double kmTrecho = 0;
        int valorAcima = 0;
        int qtdTrecho = 0;
        int valorConcorda = 0;

        System.out.println("Qual o valor que Astolfo se nega a pagar?");
        double valor = scan.nextDouble();

        double  valorPedagio = 0;
        while(valorPedagio >= 0){
            System.out.println("Quanto custa o pedágio?");
             valorPedagio = scan.nextDouble();

             if(valorPedagio >= 0){
                System.out.println("Quantos KM tem o trecho?");
                kmTrecho = scan.nextDouble();
                if(valorPedagio >= valor){
                    valorAcima++;
                }
                if(kmTrecho > 150 && valorPedagio < valor){
                    valorConcorda++;
                 }
                 qtdTrecho++;
             }else{

             }
            
            

        }


        System.out.println("Trechos que Astolfo se nega a pagar: "+valorAcima);
        System.out.println("Trechos informados: "+qtdTrecho);
        System.out.println("Trechos acima de 150km que ele aceita pagar: "+valorConcorda);
        scan.close();

    }
}