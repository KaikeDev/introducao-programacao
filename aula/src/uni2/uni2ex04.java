import java.util.Scanner;

public class uni2ex04 {

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a nota 1 ");
        double nota1 = scan.nextInt();
            while (nota1 > 10 || nota1 < 0) {
                System.out.println("Nota 1 deve estar entre 0 e 10");
         nota1 = scan.nextDouble();
            
        }
        System.out.println("Digite a nota 2");
        double nota2 = scan.nextInt();
            while (nota2 > 10 || nota2 < 0) {
                System.out.println("Nota 2 deve estar entre 0 e 10");
                 nota2 = scan.nextDouble();

        }
        double media = ((nota1 *3.5 )+ (nota2*7.5))/11;
        System.out.println("A média é " + media);


        scan.close();
    }
}
