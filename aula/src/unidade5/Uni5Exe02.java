package unidade5;

public class Uni5Exe02 {
    public static void main(String[] args) {

        int somaPares = 0;
        int somaImpares = 0;

        int num = 0;
        for (int i = 0; i <= 100; i++) {

            num = i;
            if (i % 2 == 0) {
                somaPares += num;

            } else {
                somaImpares += num;
            }
            num = 0;
        }
        System.out.println("A soma dos números pares é: " + somaPares);
        System.out.println("A soma dos números impares é: " + somaImpares);
    }
}
