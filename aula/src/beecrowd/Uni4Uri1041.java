package unidade4;

import java.util.Scanner;

public class Uni4Uri1041 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double eixoX = scan.nextDouble();
        double eixoY = scan.nextDouble();

        if (eixoX > 0 && eixoY > 0) {
            System.out.println("Q1");
        } else if (eixoX < 0 && eixoY > 0) {
            System.out.println("Q2");
        } else if (eixoX < 0 && eixoY < 0) {
            System.out.println("Q3");
        } else if (eixoX > 0 && eixoY < 0) {
            System.out.println("Q4");
        } else if (eixoX == 0 && eixoY == 0) {
            System.out.println("Origem");
        } else if (eixoX == 0 && eixoY > 0 || eixoY < 0) {
            System.out.println("Eixo Y");
        } else if (eixoX > 0 || eixoX < 0 && eixoY == 0) {
            System.out.println("Eixo X");
        }

        scan.close();
    }
}
