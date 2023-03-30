package unidade4;

import java.util.Scanner;

public class Uni4Exe16 {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        System.out.println("Escreva a idade dos dois homens");
        int idadeHomem1 =scan.nextInt();
        int idadeHomem2 =scan.nextInt();

        System.out.println("Escreva a idade das duas mulheres");
        int idadeMulher1 =scan.nextInt();
        int idadeMulher2 =scan.nextInt();

        int somaIdade = 0;
        int multiplicaçãoIdade = 0;
        if(idadeHomem1 > idadeHomem2 && idadeMulher1 > idadeMulher2){
            somaIdade = idadeHomem1 + idadeMulher2;
            multiplicaçãoIdade = idadeHomem2 * idadeMulher1;
        }else if (idadeHomem2 > idadeHomem1 && idadeMulher2 > idadeMulher1){
            somaIdade = idadeHomem2 + idadeMulher1;
            multiplicaçãoIdade = idadeHomem1 * idadeMulher2;
        }else if(idadeHomem1 > idadeHomem2 && idadeMulher2 > idadeMulher1){
            somaIdade = idadeHomem1 + idadeMulher1;
            multiplicaçãoIdade = idadeHomem2 * idadeMulher2;
        }else{
            somaIdade = idadeHomem2 + idadeMulher2;
            multiplicaçãoIdade = idadeHomem1 * idadeMulher1;
        }

        System.out.println("A soma das idades do homem mais velho com a mulher mais nova é: "+somaIdade);
        System.out.println("A multiplicação das idades do homem mais novo com a mulher mais velha é: "+multiplicaçãoIdade);
        scan.close();
    }
}
