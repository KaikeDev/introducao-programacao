import java.util.Scanner;

public class uni2ex05 {

    public static void main(String[] args) throws Exception {
        

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        int num1 = scan.nextInt();

        
        System.out.println("Digite o segundo número");
        int num2 = scan.nextInt();

        System.out.println("Digite o terceiro número");
        int num3 = scan.nextInt();

        System.out.println("Digite o quarto número");
        int num4 = scan.nextInt();
        
        int diferenca = (num1 * num2) - (num3 * num4);
        System.out.println("A diferença do~produto de A e B pelo C e D é: " +diferenca);

        scan.close();
    }
}
