package beecrowd;

import java.util.Scanner;

public class Uni6Uri2766 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] nome = new String[10];

        for (int i = 0; i < 10; i++) {
            nome[i] = scan.next();
        }

        System.out.println(nome[2]);
        System.out.println(nome[6]);
        System.out.println(nome[8]);
        scan.close();
    }
}