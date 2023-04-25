package unidade4;

import java.util.Scanner;

public class Uni4Uri1546 {

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        for (int i = 1; i <= N; i++) {

            int K = scan.nextInt();
            for (int j = 1; j <= K; j++) {

                int tipoFeedback = scan.nextInt();

                switch (tipoFeedback) {

                    case 1:
                        System.out.println("Rolien");
                        break;

                    case 2:
                        System.out.println("Naej");
                        break;

                    case 3:
                        System.out.println("Elehcim");
                        break;

                    case 4:
                        System.out.println("Odranoel");
                        break;
                }

            }
        }
        scan.close();
    }
}
