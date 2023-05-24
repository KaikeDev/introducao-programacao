package beecrowd;
import java.util.Scanner;

public class Uni3Uri1016 {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        final int X = 60;
        final int y = 90;
        int km = scan.nextInt();
        int minutos = (60 * km) / 30;
        System.out.println(minutos + " minutos"); 

        scan.close();
    }
}
