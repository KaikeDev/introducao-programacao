package prova2;

import java.util.Arrays;
import java.util.Scanner;

public class KaikeVenturaTuerpe_2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o tamanho do vetor");
        int vetor = scan.nextInt();

        int[] valores1 = new int[vetor];
        int[] valores2 = new int[vetor];
        int[] somaVetores = new int[vetor + vetor];

        int[] ordenarSoma = new int [vetor + vetor];
        lerValores(valores1, valores2);
        somaVetores(valores1, valores2, somaVetores);
        ordenarValores(valores1, valores2, somaVetores, ordenarSoma);
        escreverValores(somaVetores, ordenarSoma);
         
         scan.close();
    }

    public static void lerValores(int[] valores1, int[] valores2) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escreva os valores do primeiro vetor");
        for (int i = 0; i < valores1.length; i++) {
            valores1[i] = scan.nextInt();
        }

        System.out.println("Escreva os valores do segundo vetor");
        for (int i = 0; i < valores2.length; i++) {
            valores2[i] = scan.nextInt();
        }
         scan.close();
    }

    public static void somaVetores(int[] valores1, int[] valores2, int[] somaVetores) {
        int somaVetor1 = 0;
        int somaVetor2 = 0;
        for (int i = 0; i < valores1.length; i++) {
            somaVetor1 += valores1[i];
        }

        for (int i = 0; i < valores2.length; i++) {
            somaVetor2 += valores2[i];
        }

        for (int i = 0; i < valores1.length; i++) {
            somaVetores[i] += somaVetor1;
        }

        for (int i = 0; i < valores2.length; i++) {
            somaVetores[i] += somaVetor2;
        }
       
    }

    public static void ordenarValores(int[] valores1, int[] valores2, int[] somaVetores, int[] ordenar) {
        
        int ordenar1= 0;
        int ordenar2= 0;
        for (int i = 0; i < valores1.length; i++) {
            ordenar1 = valores1[i];
        }

        for (int i = 0; i < valores2.length; i++) {
            ordenar2 = valores2[i];
        }
        

        for(int i = 0; i < somaVetores.length; i++) {
            ordenar[i] = ordenar1;
           
        }
        for(int i = 0; i < somaVetores.length; i++){
             ordenar[i] = ordenar2;
        }

        
        Arrays.sort(ordenar);
    }

    public static void escreverValores(int[] somaVetores, int[] ordenar) {
        System.out.println("Soma dos valores");

            for (int i = 0; i < 1; i++) {
                System.out.println(somaVetores[i]);
            }
    

        System.out.println("Vetor ordenado");
        for (int i = 0; i < somaVetores.length; i++) {
            System.out.print(ordenar[i]);
        }
    }
}