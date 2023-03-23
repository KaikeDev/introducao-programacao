import java.util.Scanner;

public class uni2ex09 {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor que a pessoa deu ");
        double valorDolar = scan.nextDouble();

        System.out.println("Digite a cotação do dólar do dia");
        double cotacao = scan.nextDouble();

        double valorReais = valorDolar * cotacao;
        System.out.println("A pessoa irá receber " +valorReais);

        scan.close();
    }
}
