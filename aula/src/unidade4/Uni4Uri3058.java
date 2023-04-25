package unidade4;

import java.util.Scanner;

public class Uni4Uri3058 {

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        while (N < 1 || N > 100) {
            N = scan.nextInt();
        }

        int valorCompra = 0;
        for (int i = 0; i < N; i++) {

            
            double P = scan.nextInt();
            while (P < 0 || P > 1000) {
                P = scan.nextInt();
            }

            int G = scan.nextInt();
            while (G < 0 || G > 1000) {
                G = scan.nextInt();
            }
            
            double preco = P / G;

            if(valorCompra > preco){
                
            }

        }
        System.out.println(valorCompra);
        scan.close();

    }
}
