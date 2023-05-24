package beecrowd;
import java.util.Scanner;

public class Uni3Uri1046 {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        int horaInicial = scan.nextInt();
        while (horaInicial < 0) {
            horaInicial = scan.nextInt();
        }

        int horaFinal = scan.nextInt();

        while (horaFinal > 24) {
            horaFinal = scan.nextInt();
        }

        int duracao = 0;
        if (horaFinal > horaInicial) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = (24 - horaInicial) + horaFinal;
        }

        System.out.println("O JOGO DUROU " +duracao+ " HORA(S)");
        scan.close();
    }
}
