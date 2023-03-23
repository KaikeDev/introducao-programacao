
import java.util.Scanner;

public class uni2ex08 {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o código de uma peça 1");
        int codPeca1 = scan.nextInt();

        System.out.println("Digite o número de peças 1");
        double numPecas1 = scan.nextDouble();

        System.out.println("Digite o valor unitário de cada peça 1");
        double valorUnitario1 = scan.nextDouble();

        System.out.println("Digite o código de uma peça 2");
        int codPeca2 = scan.nextInt();

        System.out.println("Digite o número de peças 2");
        double numPecas2 = scan.nextDouble();

        System.out.println("Digite o valor unitário de cada peça 2");
        double valorUnitario2 = scan.nextDouble();

        double totalPagarPeca1 = numPecas1 * valorUnitario1;

        double totalPagarPeca2 = numPecas2 * valorUnitario2;

        double totalPagar = totalPagarPeca1 + totalPagarPeca2;

        System.out.println("O total a ser pago pelas duas peças é de " + totalPagar);

        scan.close();
    }
}
