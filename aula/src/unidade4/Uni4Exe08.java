package unidade4;

import java.util.Scanner;

public class Uni4Exe08 {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        System.out.println("Escreva uma letra");
        char letra = scan.nextLine().charAt(0);

        if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
            System.out.println("A letra: "+letra+ " é uma vogal");
        }else{
            System.out.println("A letra: "+letra+ " não é uma vogal");
        }
        scan.close();
        
    }
}
