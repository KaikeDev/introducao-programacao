package unidade5;
import java.util.Scanner;

public class Uni5Exe33 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int voto = 0;
        int votos1 = 0;
        int votos2 = 0;
        int votos3 = 0;
        int votos4 = 0;
        int votosNulos = 0;
        int votosBranco = 0;
        int totalVotos = 0;

        System.out.println("Digite o código do candidato (1, 2, 3, 4, 5=Nulo, 6= Branco)");
        voto = scan.nextInt();
        while (voto < 0 || voto > 6) {
            System.out.println("Opção incorreta");
            voto = scan.nextInt();
        }
        do {

            if (voto == 1) {
                votos1++;
                totalVotos++;
            } else if (voto == 2) {
                votos2++;
                totalVotos++;
            } else if (voto == 3) {
                votos3++;
                totalVotos++;
            } else if (voto == 4) {
                votos4++;
                totalVotos++;
            } else if (voto == 5) {
                votosNulos++;
                totalVotos++;
            } else if (voto == 6) {
                votosBranco++;
                totalVotos++;
            }

            System.out.println("Digite o código do candidato");
            voto = scan.nextInt();
            while (voto < 0 || voto > 6) {
                System.out.println("Opção incorreta");
                voto = scan.nextInt();
            }

        } while (voto != 0);

      
        System.out.println("O candidato 1 recebeu: " + votos1 + " votos");
        System.out.println("O candidato 2 recebeu: " + votos2 + " votos");
        System.out.println("O candidato 3 recebeu: " + votos3 + " votos");
        System.out.println("O candidato 4 recebeu: " + votos4 + " votos");
        System.out.println("Tivemos : " + votosNulos + " votos nulos");
        System.out.println("Tivemos : " + votosBranco + " votos em branco");
        System.out.println("O percentual de votos nulos foi de: "+ (votosNulos* 100) /totalVotos + " %");
        System.out.println("O percentual de votos brancos foi de: "+(votosBranco* 100) /totalVotos+ " %");
        scan.close();
    }
}