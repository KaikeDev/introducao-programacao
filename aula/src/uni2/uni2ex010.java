
import java.time.Duration;
import java.util.Scanner;

public class uni2ex010 {

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        Duration total = Duration.ofSeconds(N);
        int horas = total.toHoursPart();
        int minutos = total.toMinutesPart();
        int segundo = total.toSecondsPart();
        System.out.println(horas + ":" + minutos + ":" + segundo);

        scan.close();
    }
}