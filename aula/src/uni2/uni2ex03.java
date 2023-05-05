import java.text.DecimalFormat;
import java.util.Scanner;

public class uni2ex03 {
    
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        DecimalFormat df_4 = new DecimalFormat( "0.000");

        System.out.println("Digite o valor do raio");
        double raio = scan.nextDouble();

        double pi = 3.14159;
        double area = (raio * raio) * pi;

        System.out.println("Valor da área da circunferência " + df_4.format(area));
        scan.close();
    }
}
