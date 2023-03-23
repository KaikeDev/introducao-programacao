import java.util.Scanner;

public class uni2ex02 {
    public static void main(String[] args) throws Exception {
        

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        int num1 = scan.nextInt();

        
        System.out.println("Digite o segundo número");
        int num2 = scan.nextInt();
        
        int multi = num1 * num2;
        System.out.println("A multiplicação do número 1: " + num1 + " e do número 2: " +num2 + " é: " + multi);

        scan.close();
    }
}
