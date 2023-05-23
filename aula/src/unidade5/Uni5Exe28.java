package unidade5;
import java.util.Scanner;

public class Uni5Exe28 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Deseja registrar um voto? s (SIM) / n (NÃO)?");
        char resp = scan.next().charAt(0);

        int votos1 = 0;
        int votos2 = 0;
        int votos3 = 0;
        int votos4 = 0;
        int totalVotos = 0;

        while(resp == 's'){

            System.out.println("Digite o código do conjunto: 1: Nenhum de Nós, 2: CPM22, 3: Skank, 4: Jota Quest");
            int conjunto = scan.nextInt();

            while(conjunto < 1 || conjunto > 4){
                System.out.println("Resposta inválida");
                conjunto = scan.nextInt();
            }

            if(conjunto == 1){
                votos1++;
                totalVotos++;
            }else if(conjunto == 2){
                votos2++;
                totalVotos++;
            }else if(conjunto == 3){
                votos3++;
                totalVotos++;
            }else if(conjunto == 4){
                votos4++;
                totalVotos++;
            }


            System.out.println("Mais um voto : s (SIM) / n (NÃO)?");
            resp = scan.next().charAt(0);
        }

        System.out.println("O grupo Nenhum de Nós recebeu "+votos1+ " votos");
        System.out.println("O grupo CPM22 recebeu "+votos2+ " votos");
        System.out.println("O grupo Skank recebeu "+votos3+ " votos");
        System.out.println("O grupo Jota Quest recebeu "+votos4+ " votos");

        System.out.println(" ");

        System.out.println("O percentual de votos do grupo Nenhum de Nós foi "+(votos1 * 100) /totalVotos + "%");
        System.out.println("O percentual de votos do grupo CPM22 foi "+(votos2 * 100) /totalVotos + "%");
        System.out.println("O percentual de votos do grupo Skank foi "+(votos3 * 100) /totalVotos+ "%");
        System.out.println("O percentual de votos do grupo Jota Quest foi "+(votos4 * 100) /totalVotos+ "%");

        if(votos1 > votos2 && votos1> votos3 && votos1 > votos4 ) {
            System.out.println("Conjunto: Nenhum de Nós, foi o vencedor ");
        }else if(votos2 > votos1 && votos2> votos3 && votos2 > votos4){
            System.out.println("Conjunto: CPM22, foi o vencedor ");
        }else if(votos3 > votos1 && votos3> votos2 && votos3 > votos4){
            System.out.println("Conjunto: Skank, foi o vencedor ");
        }else if(votos4 > votos1 && votos4> votos2 && votos4 > votos3){
            System.out.println("Conjunto: Jota Quest, foi o vencedor ");
        }
        scan.close();
    }
}