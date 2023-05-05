package unidade5;

public class Uni5Exe03 {
    public static void main(String[] args) {

        double soma = 0.0; // Variável para armazenar a soma dos termos

        for (int i = 1; i <= 100; i++) {
            soma += 1.0 / i; // Adiciona o valor do termo i à soma
        }
        
        System.out.println("A soma da série é: " + soma);
    }
}
