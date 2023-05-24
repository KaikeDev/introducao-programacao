package unidade4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni4Uri1038 {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        DecimalFormat f_02 = new DecimalFormat("R$ 0.00") ;

        int  codigo = scan.nextInt();
        int  quantidade = scan.nextInt();

        if(codigo == 1){
            double valorConta = quantidade * 4;
            System.out.println("Total: "+f_02.format(valorConta));
        }else if(codigo == 2){
            double valorConta = quantidade * 4.50;
            System.out.println("Total: "+f_02.format(valorConta));
        }else if(codigo == 3){
            double valorConta = quantidade * 5;
            System.out.println("Total: "+f_02.format(valorConta));
        }else if(codigo == 4){
            double valorConta = quantidade * 2;
            System.out.println("Total: "+f_02.format(valorConta));
        }else if(codigo == 5){
            double valorConta = quantidade * 1.50;
            System.out.println("Total: "+f_02.format(valorConta));
        }
        

    }
}