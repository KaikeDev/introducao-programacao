package unidade5;
import java.util.Scanner;

public class Uni5Exe14 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int percentual_10 = 0;
       int percentual_10_20 = 0;
       int percentual_20 = 0;

        for (int i = 1; i <= 3; i++) {

            System.out.println("Escreva os dados da " + i + "° mercadoria");
            System.out.println("Nome:");
            String nomeMercadoria = scan.next();
            System.out.println("Preço de compra");
            double precoCompra = scan.nextDouble();
            System.out.println("Preço de venda");
            double precoVenda = scan.nextDouble();

            double lucro = (precoVenda - precoCompra) / precoCompra *100;
            if(lucro <10){
                percentual_10++;
            }else if(lucro >= 10 && lucro <=20){
                percentual_10_20++;
            }else{
                percentual_20++;
            }
            System.out.println("Dados da mercadoria: "+nomeMercadoria);
            System.out.println("Valor de compra "+precoCompra);
            System.out.println("Valor de venda "+precoVenda);
            System.out.println("Lucro da mercadoria "+lucro);
        }

        System.out.println(percentual_10+ " mercadorias tiveram um lucro inferior a 10%");
        System.out.println(percentual_10_20+ " mercadorias tiveram um lucro entre 10% e 20%");
        System.out.println(percentual_20+ " mercadorias tiveram um lucro superior a 20%");

        scan.close();

    }
}