import java.text.DecimalFormat;
import java.util.Scanner;

public class uni2ex07 {

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");
        System.out.println("Digite o nome do vendedor");
        String nomeVendedor = scan.nextLine();

        System.out.println("Digite o salário do vendedor");
        double salario = scan.nextDouble();

        System.out.println("Digite o total de vendas em dinheiro efetuadas pelo vendedor no mês");
        double totVendas = scan.nextDouble();

        double comissao = totVendas * 15 / 100;
        double totalReceber = salario + comissao;
        System.out.println("O vendedor " + nomeVendedor + "tem um total a receber de " +df_2.format(totalReceber));

        scan.close();
    }

}
