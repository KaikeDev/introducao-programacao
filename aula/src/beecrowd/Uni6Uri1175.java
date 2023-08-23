    package beecrowd;

    import java.util.Scanner;

    public class Uni6Uri1175 {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            
            int [] N = new int[20];
            int [] Y = new int[20];

            for(int i = 0; i < 20; i++){
                N[i] = scan.nextInt();
            }

            for(int i = 0; i < 20; i++){
                Y[i] = N[19-i];
                System.out.println("N["+i+"] = " +Y[i]);
            }
            
        }
    }