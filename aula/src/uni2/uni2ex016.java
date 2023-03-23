import java.util.Scanner;

public class uni2ex016 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantas garrafas de 350ml você deseja comprar? ");
        int qtd350 = scan.nextInt();
        double litros350 =  qtd350 * 0.350; 


        System.out.println("Quantas garrafas de 600ml você deseja comprar? ");
        int qtd3600 = scan.nextInt();
        double litros600 = qtd3600 * 0.600;


        System.out.println("Quantas garrafas de 2l você deseja comprar? ");
        int qtd2Litros = scan.nextInt();
        double litros2 = qtd2Litros * 2;
        double LitrosTotal = litros350 + litros600 + litros2;
        System.out.println("Você comprou "+LitrosTotal + "litros de refrigerante");

        scan.close();
    }
}
