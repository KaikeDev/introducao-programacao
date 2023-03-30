package unidade4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni4Exe17 {

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        DecimalFormat f_02 = new DecimalFormat("R$ 0.00");

        System.out.println("Informe a sua renda anual");
        double rendaAnual = scan.nextDouble();

        while(rendaAnual <=0){
            System.out.println("Renda anual deve ser um valor válido");
            rendaAnual = scan.nextDouble();
        }
        System.out.println("Escreva o número de dependes");
        int dependentes = scan.nextInt();

        double rendaLiquida = 0;
        rendaLiquida = rendaAnual - (((dependentes * 2) * rendaAnual) / 100);
        System.out.println("Renda liquida " + rendaLiquida);

        double impostoPago = 0;
        if (rendaLiquida > 2000) {

            if(rendaLiquida >=2000 && rendaLiquida <5000){
                System.out.println("Imposto de 5% sobre a renda liquída");
                impostoPago = (rendaLiquida * 5) /100;
                System.out.println("Você deve pagar "+f_02.format(impostoPago)+ " de imposto");
            }else if(rendaLiquida >= 5000 && rendaLiquida <=10000){
                System.out.println("Imposto de 10% sobre a renda liquída");
                impostoPago = (rendaLiquida * 10) /100;
                System.out.println("Você deve pagar "+f_02.format(impostoPago)+ " de imposto");
            }else{
                System.out.println("Imposto de 15% sobre a renda liquída");
                impostoPago = (rendaLiquida * 15) /100;
                System.out.println("Você deve pagar "+f_02.format(impostoPago)+ " de imposto");
            }
        } else {
            System.out.println("Não paga imposto");
        }
        scan.close();
    }
}
