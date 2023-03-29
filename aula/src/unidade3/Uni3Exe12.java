package unidade3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe12 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DecimalFormat f_02 = new DecimalFormat("R$ 0.00");

        System.out.println("Digite o nome do funcionário");
        String nome = scan.nextLine();

        System.out.println("Digite o número de horas trabalhadas mensal");
        int horasTrabalhadas = scan.nextInt();

        System.out.println("Digite o número de dependentes do funcionário");
        int dependentes = scan.nextInt();

        double salarioBruto = (10 * horasTrabalhadas) + (60 * dependentes);
        double salarioFinal = (salarioBruto * 0.865);
        System.out.println("O funcionário: " + nome + " tem o salário bruto de: "+f_02.format(salarioBruto) +" e o seu salário liquído é de: " + f_02.format(salarioFinal));

        scan.close();
    }
}
