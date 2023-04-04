package unidade4;

import java.util.Scanner;

public class Uni4Exe24 {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        System.out.println("Escreva 3 valores");
        double valor1 = scan.nextDouble();
        double valor2 = scan.nextDouble();
        double valor3 = scan.nextDouble();

        System.out.println("Opções disponíveis: ");
        System.out.println("se opção = 1, escreva os 3 valores em ordem crescente");
        System.out.println("se opção = 2, escreva os 3 valores em ordem decrescente");
        System.out.println("se opção = 3, escreva os 3 valores de forma que o maior valor fique no meio");

        System.out.println("Digite a opção que você quer");
        int opcaoDesejada = scan.nextInt();

        switch(opcaoDesejada){
            case 1:
            if(valor1> valor2 && valor1 > valor3 && valor2 > valor3){
                System.out.println("Ordem crescente ");
                System.out.println(valor3);
                System.out.println(valor2);
                System.out.println(valor1);
            }else if(valor1> valor2 && valor1 > valor3 && valor3 > valor2){
                System.out.println("Ordem crescente ");
                System.out.println(valor2);
                System.out.println(valor3);
                System.out.println(valor1);
            }else if(valor2> valor1 && valor2 > valor3 && valor1 > valor3){
                System.out.println("Ordem crescente ");
                System.out.println(valor3);
                System.out.println(valor1);
                System.out.println(valor2);
            }else if(valor2> valor1 && valor2 > valor3 && valor3 > valor1){
                System.out.println("Ordem crescente ");
                System.out.println(valor1);
                System.out.println(valor3);
                System.out.println(valor2);
            }else if(valor3> valor1 && valor3 > valor2 && valor1 > valor2){
                System.out.println("Ordem crescente ");
                System.out.println(valor2);
                System.out.println(valor1);
                System.out.println(valor3);

            }else if(valor3> valor1 && valor3 > valor2 && valor2 > valor1){
                System.out.println("Ordem crescente ");
                System.out.println(valor1);
                System.out.println(valor2);
                System.out.println(valor3);
            }

            case 2:
            if(valor1> valor2 && valor1 > valor3 && valor2 > valor3){
                System.out.println("Ordem decrescente ");
                System.out.println(valor1);
                System.out.println(valor2);
                System.out.println(valor3);
            }else if(valor1> valor2 && valor1 > valor3 && valor3 > valor2){
                System.out.println("Ordem decrescente ");
                System.out.println(valor1);
                System.out.println(valor3);
                System.out.println(valor2);
            }else if(valor2> valor1 && valor2 > valor3 && valor1 > valor3){
                System.out.println("Ordem decrescente ");
                System.out.println(valor2);
                System.out.println(valor1);
                System.out.println(valor3);
            }else if(valor2> valor1 && valor2 > valor3 && valor3 > valor1){
                System.out.println("Ordem decrescente ");
                System.out.println(valor2);
                System.out.println(valor3);
                System.out.println(valor1);
            }else if(valor3> valor1 && valor3 > valor2 && valor1 > valor2){
                System.out.println("Ordem decrescente ");
                System.out.println(valor3);
                System.out.println(valor1);
                System.out.println(valor2);

            }else if(valor3> valor1 && valor3 > valor2 && valor2 > valor1){
                System.out.println("Ordem decrescente ");
                System.out.println(valor3);
                System.out.println(valor2);
                System.out.println(valor1);
            }

            case 3:

            if(valor1> valor2 && valor1 > valor3 && valor2 > valor3){
                System.out.println("Ordem crescente ");
                System.out.println(valor3);
                System.out.println(valor1);
                System.out.println(valor2);
            }else if(valor1> valor2 && valor1 > valor3 && valor3 > valor2){
                System.out.println("Ordem crescente ");
                System.out.println(valor2);
                System.out.println(valor1);
                System.out.println(valor3);
            }else if(valor2> valor1 && valor2 > valor3 && valor1 > valor3){
                System.out.println("Ordem crescente ");
                System.out.println(valor3);
                System.out.println(valor2);
                System.out.println(valor1);
            }else if(valor2> valor1 && valor2 > valor3 && valor3 > valor1){
                System.out.println("Ordem crescente ");
                System.out.println(valor1);
                System.out.println(valor2);
                System.out.println(valor3);
            }else if(valor3> valor1 && valor3 > valor2 && valor1 > valor2){
                System.out.println("Ordem crescente ");
                System.out.println(valor2);
                System.out.println(valor3);
                System.out.println(valor1);

            }else if(valor3> valor1 && valor3 > valor2 && valor2 > valor1){
                System.out.println("Ordem crescente ");
                System.out.println(valor1);
                System.out.println(valor3);
                System.out.println(valor2);
            }

        }
        scan.close();

    }

}
