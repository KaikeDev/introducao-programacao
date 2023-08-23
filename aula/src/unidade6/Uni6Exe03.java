package unidade6;

import java.util.Scanner;

public class Uni6Exe03 {

    public static void main(String[] args) {

        double[] valores = lerValores();
        calcularParimpar(valores);
        ajustarValores(valores);

    }

    public static double[] lerValores() {
        Scanner scan = new Scanner(System.in);
        double[] valores = new double[12];

        for (int i = 0; i < valores.length; i++) {
            valores[i] = scan.nextDouble();
        }
        scan.close();
        return valores;
    }

    public static void calcularParimpar(double[] valores) {
        
        for (int i = 0; i < valores.length; i++) {
            if (i % 2 == 0) {
                valores[i] *= 1.02;      
            }else{
                valores[i] *= 1.05;
            }
        }

    }
        public static void ajustarValores(double[] valores){
            System.out.println("Valores finais");
            for(double valor : valores){
                System.out.println(valor);
            }
        }
        
    }
