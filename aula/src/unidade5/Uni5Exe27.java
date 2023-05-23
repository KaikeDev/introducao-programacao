package unidade5;

import java.util.Scanner;

public class Uni5Exe27 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int resp = 0;
        int maiorDia = 0;
        int pecasTotaisManha = 0;
        int pecasTotaisTarde = 0;

        int pecasTotais = 0;
        int pecasTotaisDiaAnterior = 0;

        while (resp != 2) {
           
            System.out.println("Digite o dia do mês");
            int dia = scan.nextInt();
            while (dia < 0 || dia > 30) {
                System.out.println("Dia inválido ");
                dia = scan.nextInt();
            }

            System.out.println("Digite o número de peças produzidas pelo funcionário no turno da manhã");
            int pecasManha = scan.nextInt();
            pecasTotaisManha += pecasManha;

            System.out.println("Digite o número de peças produzidas pelo funcionário no turno da tarde");
            int pecasTarde = scan.nextInt();
            pecasTotaisTarde += pecasTarde;

            pecasTotais = pecasManha + pecasTarde;
            double totalGanhoDia = 0;
            if ( dia <= 15 ) {
                if(pecasTarde >= 30 && pecasManha >= 30 && pecasTotais > 100){
                    totalGanhoDia = pecasTotais * 0.80;
                    System.out.println("Total recebecido no dia: " + totalGanhoDia);
                }else{
                    totalGanhoDia = pecasTotais * 0.5;
                    System.out.println("Total recebecido no dia: " + totalGanhoDia);
                }
                
            } else {
                    totalGanhoDia = (pecasManha * 0.4) + (pecasTarde * 0.3);
                System.out.println("Total recebecido no dia: " + totalGanhoDia);
            }
            
             if (pecasTotais > pecasTotaisDiaAnterior) {
                 pecasTotaisDiaAnterior = pecasTotais;
                 maiorDia = dia;
             }

            System.out.println("Novo funcionário (1.sim 2.não)");
            resp = scan.nextInt();
            while(resp < 1 || resp > 2) {
            System.out.println("Resposta inválida");
                resp = scan.nextInt();

            }

        }

        System.out.println("O dia que ocorreu a maior produção foi o dia: " + maiorDia);

        if (pecasTotaisManha > pecasTotaisTarde) {
            System.out.println("O funcionário produziu mais no período da manha, total: " + pecasTotaisManha);
        } else {
            System.out.println("O funcionário produziu mais no período da tarde, total: " + pecasTotaisTarde);
        }

        scan.close();
    }
}