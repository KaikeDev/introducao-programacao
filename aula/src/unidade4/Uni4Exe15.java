package unidade4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni4Exe15 {

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        DecimalFormat f_02 = new DecimalFormat("R$ 0.00");

        System.out.println("Digite a quantidade de meses que o funcionário esta empregado");
        int qtdMeses = scan.nextInt();

        System.out.println("Digite o salário do funcionário");
        double salario = scan.nextDouble();

        double salarioNovo = 0;

        if (qtdMeses > 0 && qtdMeses <= 12) {
            System.out.println("O funcionário receberá um reajuste de 5%");
            salarioNovo = salario + ((salario * 5) / 100);
            System.out.println("O novo salário do funcionário é de: " + f_02.format(salarioNovo));
        } else if (qtdMeses > 12 && qtdMeses <= 48) {
            System.out.println("O funcionário receberá um reajuste de 7%");
            salarioNovo = salario + ((salario * 7) / 100);
            System.out.println("O novo salário do funcionário é de: " + f_02.format(salarioNovo));
        }
        scan.close();
    }
}
