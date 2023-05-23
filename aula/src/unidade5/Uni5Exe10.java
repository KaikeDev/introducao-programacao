package unidade5;

public class Uni5Exe10 {
    
        public static void main(String[] args) {

            int count = 1;
            
            for (int num = 1; count < 10; num++) {
                int sum = num / 100 + num % 100; // separa os dois dígitos de cada lado e soma
                if (sum * sum == num) { // verifica se o quadrado da soma é igual ao número
                    System.out.println(num);
                    count++; // incrementa o contador de números encontrados
                }
                
            }


        }
    }