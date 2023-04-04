package unidade4;

import java.util.Scanner;

public class Uni4Exe21 {

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o peso da pessoa em KG");
        double pesoPessoa = scan.nextDouble();

        System.out.println("Digite a altura da pessoa em Metros");
        double alturaPessoa = scan.nextDouble();

        double imc = pesoPessoa / (Math.pow(alturaPessoa, 2));

        if (imc < 18.5) {
            System.out.println("Magreza");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Saudável");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Sobrepeso");
        }else if(imc >= 30 && imc < 34.9){
            System.out.println("Obesidade Grau I");
        }else if (imc >= 35 && imc < 39.9){
            System.out.println("Obesidade Grau II (severa)");
        }else if(imc >=40){
            System.out.println("Obesidade Grau III (mórbida)");
        }

        scan.close();
    }
}
