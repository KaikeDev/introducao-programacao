package unidade6;
import java.util.Scanner;

public class Uni6Exe05 {
    public static void main(String[] args) {

        String[] respHomem = new String[5];
        String[] respMulher = new String[5];
        lerRespostas(respHomem, respMulher);
        calcularAfinidade(respHomem, respMulher);

    }

    public static void lerRespostas(String[] respHomem, String[] respMulher) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Responda com SIM, NAO OU IND(INDIFERENTE)");

        for (int i = 0; i < 5; i++) {
            respHomem[i] = scan.nextLine();
            respMulher[i] = scan.nextLine();

        }
        scan.close();
    }

    public static void calcularAfinidade(String[] respHomem, String[] respMulher) {

        int afinidade = 0;
        for (int i = 0; i < 5; i++) {
            if (respHomem[i].equals("SIM") && respMulher[i].equals("SIM")
                    || respHomem[i].equals("NAO") && respMulher[i].equals("NAO") || respHomem[i].equals("IND") && respMulher[i].equals("IND")) {
                afinidade += 3;
            } else if (respHomem[i].equals("IND") && respMulher[i].equals("SIM") ||respHomem[i].equals("IND") && respMulher[i].equals("NAO")) {
                afinidade += 1;
            }else if( respMulher[i].equals("IND") && respHomem[i].equals("SIM") || respMulher[i].equals("IND") && respHomem[i].equals("NAO")){
                afinidade += 1;
            } else if (respHomem[i].equals("SIM") && respMulher[i].equals("NAO")
                    || respHomem[i].equals("NAO") && respMulher[i].equals("SIM")) {
                afinidade -= 2;
            }
            System.out.println("AFINIDADE "+afinidade);
        }
        if (afinidade == 15) {
            System.out.println("A afinidade foi de: " + afinidade);
            System.out.println("Casem!");
        } else if (afinidade >= 10 && afinidade <= 14) {
            System.out.println("A afinidade foi de: " + afinidade);
            System.out.println("Vocês têm muita coisa em comum!");
        } else if (afinidade >= 5 && afinidade <= 9) {
            System.out.println("A afinidade foi de: " + afinidade);
            System.out.println("Talvez não dê certo :(");
        } else if (afinidade >= 0 && afinidade <= 4) {
            System.out.println("A afinidade foi de: " + afinidade);
            System.out.println("Vale um encontro.");

        } else if (afinidade >= -1 && afinidade <= -9) {
            System.out.println("A afinidade foi de: " + afinidade);
            System.out.println("Melhor não perder tempo");
        } else {
            System.out.println("A afinidade foi de: " + afinidade);
            System.out.println("Vocês se odeiam!");
        }
    }
}
