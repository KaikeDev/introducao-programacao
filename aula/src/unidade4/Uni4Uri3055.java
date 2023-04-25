package unidade4;

import java.util.Scanner;

public class Uni4Uri3055 {
    
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        while(A < 0 || A >100){
            A = scan.nextInt();
        }

        int M = scan.nextInt();
        while(M < 0 || M >100){
            M = scan.nextInt();
        }

        int nota = (M * 2) - A;
        System.out.println(nota);

        scan.close();
    }
}