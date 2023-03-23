import java.text.DecimalFormat;
import java.util.Scanner;

public class uni2ex06 {

    public static void main(String[] args) throws Exception {
    
        Scanner scan = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");
        System.out.println("Digite o número do funcionário");
        int numFunc = scan.nextInt();

        System.out.println("Digite o número de horas trabalhadas pelo funcionário");
        int numHoras = scan.nextInt();

        System.out.println("Digite qual o valor que o funcionárior recebe por hora");
        int valHoras = scan.nextInt();
       
        double salario = numHoras * valHoras;
        System.out.println("O funcionário " +numFunc + "tem salário igual a: " + df_2.format(salario));
        scan.close();
    }
}
