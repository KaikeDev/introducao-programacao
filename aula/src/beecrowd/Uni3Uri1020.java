package beecrowd;

import java.util.Scanner;

public class Uni3Uri1020 {

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        int idade = scan.nextInt();

        int anos = idade / 365;
        int meses =   (idade%= 365) /30;
        idade =  (idade%= 365)%30;
       

        System.out.println( anos + " ano (s)");
        System.out.println(meses +" mes (es)");
        System.out.println(idade + " dia (s)");
        scan.close();
    }
}