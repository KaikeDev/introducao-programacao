package beecrowd;
import java.util.Scanner;

public class Uni4Uri2444 {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        int V = scan.nextInt();
        while (V < 0 || V > 100) {
            V = scan.nextInt();
        }

        int T = scan.nextInt();
        while (T < 0 || T > 1000) {
            T = scan.nextInt();
        }

        int Ai = 0;
        int F = V;
        for (int i = 0; i < T; i++) {

            Ai -= Ai ;
            Ai = scan.nextInt();
            while (Ai > 100 || Ai < -100) {
                Ai = scan.nextInt();
            }
            F += Ai;      
            if(F >100){
                F = 100;
            }      
            if(F < 0 ){
                F = 0;
            }
        }

        System.out.println(F);

        scan.close();
    }
}