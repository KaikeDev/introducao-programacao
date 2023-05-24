package beecrowd;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Uri1051 {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        DecimalFormat f_02 = new DecimalFormat("R$ 0.00");

        double salario = scan.nextDouble();

        if(salario > 0 && salario <=2000){
            System.out.println("Isento");
        }else if(salario >2000 && salario <= 3000){
            double imposto = (salario - 2000) * 0.08;
            System.out.println(f_02.format(imposto));
        }else if(salario > 3000 && salario < 4500){
            double imposto = (salario - 2000) * 0.08;
            System.out.println(f_02.format(imposto));
        }else{
        double imposto = (salario - 2000)* 0.28;
        System.out.println(f_02.format(imposto));
        }

        scan.close();
    }
}
