package beecrowd;
import java.util.Scanner;

public class Uni4Uri1387 {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        int L = scan.nextInt();
        while(L < 0 || L >5){
            L = scan.nextInt();
        }

        int R = scan.nextInt();
        while(R < 0 || R >5){
            R= scan.nextInt();
        }

        int soma = 0;
        while (L != 0 && R != 0) {

            soma = L + R;
            System.out.println(soma);
            L = scan.nextInt();
            while(L < 0 || L >5){
                L = scan.nextInt();
            }

            R = scan.nextInt();
            while(R < 0 || R >5){
                R = scan.nextInt();
            }
        }

        scan.close();
    }
}