package beecrowd;

import java.util.Scanner;

public class Uni6Uri1173 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int V = scan.nextInt();
        int[] N = new int[10];
        N[0] = V;

        
        for (int i = 1; i < 10; i++) {
            N[i] = 2 * N[i-1];
            
        }

        for(int i = 0; i < 10; i++) {
            System.out.println("N[" + i + "] = " + N[i]);

        }
        scan.close();
    }
}
