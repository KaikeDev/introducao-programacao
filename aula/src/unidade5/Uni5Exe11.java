package unidade5;

public class Uni5Exe11 {

    public static void main(String[] args) {

        int hora = 16;
        int qtdQuebrada = 0;
        int totalQuebrado = 0;

        for (int i = 1; i <= hora; i++) {

            if (i == 1) {
                qtdQuebrada = 1;
            } else if (i == 2) {
                qtdQuebrada = 3;
            } else {
                qtdQuebrada = 3 * qtdQuebrada;
               
            }
            totalQuebrado += qtdQuebrada;

        }

        System.out.println("São quebrados "+totalQuebrado+ " biscoitos no final de cada dia");
    }
}
