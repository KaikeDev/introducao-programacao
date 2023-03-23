package unidade3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Uri1008 {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("U$ 0.00");
       
        int numFunc = scan.nextInt();
        int numHoras = scan.nextInt();
        double valHoras = scan.nextDouble();
       
        double salario = numHoras * valHoras;

        System.out.println("NUMBER = " +numFunc );
        System.out.println("SALARY = " + df_2.format(salario));
        scan.close();

    }
}
