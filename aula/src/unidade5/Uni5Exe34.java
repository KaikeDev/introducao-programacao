package unidade5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe34 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DecimalFormat f_02 = new DecimalFormat("0.00$");

        int resp = 0;
        double valorTotal = 0; 
        double numDiaria = 0;
        int contasEncerradas = 0;
        System.out.println("Qual opção você vai querer? (1) encerrar a conta de um hóspede; (2) verificar número de contas encerradas; (3) sair.");
         resp = scan.nextInt();

       do {

         switch(resp) {

            case 1:
            System.out.println("Qual o nome do hóspede?");
            String nome = scan.next();
            System.out.println("Escreva o número de diárias");
             numDiaria = scan.nextDouble();
             while(numDiaria <= 0){
                System.out.println("Valor incorreto");
                numDiaria = scan.nextDouble();
             }
            if(numDiaria < 15) {
                 valorTotal =  50 + (7.5 * numDiaria);
                 System.out.println("O hóspede "+nome+ " terá que pagar: "+f_02.format(valorTotal));
                 contasEncerradas++;

            }else if(numDiaria == 15) {
                valorTotal =  50 + (6.5 * numDiaria);
                System.out.println("O hóspede "+nome+ " terá que pagar: "+f_02.format(valorTotal));
                contasEncerradas++;


            }else{
                valorTotal =  50 + (5 * numDiaria);
                System.out.println("O hóspede "+nome+ " terá que pagar: "+f_02.format(valorTotal));
                contasEncerradas++;

            }
            
            break;

            case 2:
            System.out.println(contasEncerradas +" Contas encerradas");
         }
       

        System.out.println("Qual opção você vai querer? (1) encerrar a conta de um hóspede; (2) verificar número de contas encerradas; (3) sair.");
         resp = scan.nextInt();
       } while (resp != 3);

       scan.close();
    }
}