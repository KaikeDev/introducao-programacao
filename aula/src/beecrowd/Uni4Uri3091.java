package beecrowd;
import java.util.Scanner;

public class Uni4Uri3091 {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        while (A < 1 || A > 100000) {
            A = scan.nextInt();
        }

        int B = scan.nextInt();
        while (B < 1 || B > 100000) {
            B = scan.nextInt();
        }

        int resto = A % B;
        System.out.println(resto);

        scan.close();
    }
}
