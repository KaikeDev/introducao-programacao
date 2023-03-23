import java.text.DecimalFormat;
import java.util.Scanner;

public class uni2ex012 {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        DecimalFormat df_4 = new DecimalFormat("0.0000");
       System.out.println("Digite o primeiro valor de x");
        double x1 = scan.nextDouble();
        
        System.out.println("Digite o primeiro valor de y");
        double y1 = scan.nextDouble();

        System.out.println("Digite o segundo valor de x");
        double x2 = scan.nextDouble();
        
        System.out.println("Digite o segundo valor de y");
        double y2 = scan.nextDouble();

        double distancia = Math.sqrt(((x2 - x1) * (x2-x1)) + ((y2 - y1) * (y2 - y1)));
        System.out.println("A distância entre eles é de: " + df_4.format(distancia));

        scan.close();
    }
    
}
