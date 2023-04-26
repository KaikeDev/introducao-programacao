package unidade4;

import java.util.Scanner;

public class Uni4Uri2786 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int L =  scanner.nextInt();
        int C =  scanner.nextInt();

        int piso1 = (L * C) + (L-1 ) * (C-1);
        int piso2 = ((L- 1) * 2) + ((C-1)*2);

        System.out.println(piso1);
        System.out.println(piso2);

        scanner.close();
    }
}