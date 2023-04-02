package unidade4;

import java.util.Scanner;

public class Uni4Exe19 {
    
        public static void main(String[] args) throws Exception {

            Scanner scan = new Scanner(System.in);

            System.out.println("Escreva o X");
            double X = scan.nextDouble();

            System.out.println("Escreva o Y");
            double Y = scan.nextDouble();

            if(X == 0 && Y == 0) {
                System.out.println("Quadrante 0");
            }else if(X > 0 && Y > 0) {
                System.out.println("Quadrante 1");
            }else if(X > 0 && Y < 0) {
                System.out.println("Quadrante 2");
            }else if(X < 0 && Y < 0) {
                System.out.println("Quadrante 3");
            }else{
                 System.out.println("Quadrante 4");
            }

            scan.close();
        }
}
