package unidade6;
import java.util.Scanner;

public class Uni6Exe02 {

        public static void main(String[] args) {
            double[] valores = lerValores();
            double media = calcularMedia(valores);
            informarMaioresQueMedia(valores, media);
        }
        
        public static double[] lerValores() {
            double[] valores = new double[12];
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Digite os 12 valores reais:");
            for (int i = 0; i < valores.length; i++) {
                valores[i] = scanner.nextDouble();
            }
            scanner.close();
            return valores;
           
        }
        
        public static double calcularMedia(double[] valores) {
            double soma = 0;
            for (double valor : valores) {
                soma += valor;
            }
            return soma / valores.length;
        }
        
        public static void informarMaioresQueMedia(double[] valores, double media) {
            System.out.println("Valores maiores que a média:");
            for (double valor : valores) {
                if (valor > media) {
                    System.out.println(valor);
                }
            }
        }
    }
    