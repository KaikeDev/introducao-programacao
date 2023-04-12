package unidade4;

import java.util.Scanner;

public class Uni4Exe25 {
    
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        System.out.println("O sistema tem o seguinte menu:");

        System.out.println("1 - Soma de dois números.");
        System.out.println("2 - Diferença entre dois números.");
        System.out.println("3 - Produto entre dois números.");
        System.out.println("4 - Divisão entre dois números (o denominador não pode ser zero).");

        System.out.println("Digite a opção que você deseja");
        int opcao = scan.nextInt();

        switch(opcao){

            case 1:
            System.out.println("Digite o número 1");
            double num1 = scan.nextDouble();
            
            System.out.println("Digite o número 2");
            double num2 = scan.nextDouble();

            double soma = num1 + num2;
            System.out.println("A soma entre os dois números é: "+soma);
            break;

            case 2:
            System.out.println("Digite o número 1");
            double num3 = scan.nextDouble();
            
            System.out.println("Digite o número 2");
            double num4 = scan.nextDouble();

            double subtracao = num3 - num4;
            System.out.println("A subtração entre os dois números é: "+subtracao);
            break;

            case 3:
            System.out.println("Digite o número 1");
            double num5 = scan.nextDouble();
            
            System.out.println("Digite o número 2");
            double num6 = scan.nextDouble();

            double multiplicacao = num5 * num6;
            System.out.println("O produto entre os dois números é: "+multiplicacao);
            break;

            case 4:
            System.out.println("Digite o número 1");
            double num7 = scan.nextDouble();
            
            System.out.println("Digite o número 2");
            double num8 = scan.nextDouble();

            while(num8 ==0){
                System.out.println("O denominador não pode ser igual a 0");
                num8 = scan.nextDouble();
            }
            double divisao = num7 / num8;
            System.out.println("A divisão entre os dois números é: "+divisao);
            break;
            default:
            System.out.println("-ERRO- OPÇÃO INVÁLIDA");
        }

        scan.close();
    }
}
