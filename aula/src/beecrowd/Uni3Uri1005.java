package beecrowd;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Uri1005 {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        DecimalFormat f_05  = new DecimalFormat("0.00000");
        double A = scan.nextDouble();
        while(A<0 || A >10){
            A = scan.nextDouble();
        }
        double B = scan.nextDouble();
        while(B<0 || B >10){
            A = scan.nextDouble();
        }
        double MEDIA = ((A*3.5)+(B*7.5))/11;

        System.out.println("MEDIA = " +f_05.format(MEDIA));

        scan.close();
    }
}
