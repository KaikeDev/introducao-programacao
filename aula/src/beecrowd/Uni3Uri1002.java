package beecrowd;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Uri1002 {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DecimalFormat f_04 = new DecimalFormat("0.0000");
        double raio = scan.nextDouble();
        final double n = 3.14159;
        double area = n* (raio*raio);

        System.out.println("A=" +f_04.format(area));

        scan.close();

    }
}
