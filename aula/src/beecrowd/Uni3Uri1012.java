package beecrowd;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Uri1012 {
    public static void main(String[] args) throws Exception {
        

        Scanner scan = new Scanner(System.in);
        DecimalFormat f_03 = new DecimalFormat("0.000");
    
        double A = scan.nextDouble();
        double B = scan.nextDouble();
        double C = scan.nextDouble();

        double areaTrianRetan = (A * C) /2 ;

       
        double pi = 3.14159;
        double areaCirculo = (C * C) * pi;

        
        double areaTrapezio = ((A +  B) *C) / 2;
        double areaQuadrado = B * B;
        double areaRetangulo = A * B;

        System.out.println("TRIANGULO: " + f_03.format(areaTrianRetan));
        System.out.println("CIRCULO: " + f_03.format(areaCirculo));
        System.out.println("TRAPEZIO: " + f_03.format(areaTrapezio));
        System.out.println("QUADRADO: " + f_03.format(areaQuadrado));
        System.out.println("RETANGULO: " + f_03.format(areaRetangulo));

        scan.close();
    }
}
