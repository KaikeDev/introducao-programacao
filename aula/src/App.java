import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int soma = num1 + num2;
        System.out.println("A soma do número 1: " + num1 + "e do número 2: " +num2 + " é: " + soma);


    }
}
