package beecrowd;
import java.util.Scanner;

public class Uni3Uri1019 {

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
    
        int horas = N / 3600;
        N %= 3600;
        int minutos = N / 60;
        N %= 60;

        System.out.println( horas+ ":" + minutos+ ":" + N);
       
        scan.close();
    }
}

