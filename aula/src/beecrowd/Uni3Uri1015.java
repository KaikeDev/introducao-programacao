package beecrowd;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Uri1015 {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        DecimalFormat df_4 = new DecimalFormat("0.0000");
      
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();

        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();

        double distancia = Math.sqrt(((x2 - x1) * (x2-x1)) + ((y2 - y1) * (y2 - y1)));
        System.out.println( df_4.format(distancia));

        scan.close();
    }

}
