import java.util.Scanner;

public class uni2ex011 {
    public static void main(String[] args) throws Exception {
        

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o número A");
        float numA = scan.nextFloat();

        
        System.out.println("Digite o número B");
        float numB = scan.nextFloat();

        System.out.println("Digite o número C");
        float numC = scan.nextFloat();

        float areaTrianRetan = (numA * numC) /2 ;
        System.out.println("A área do triângulo retângulo é de: " + areaTrianRetan);

        System.out.println("---------------------------------------");
        float pi = (float) 3.14159;
        float areaCirculo = (numC * numC) * pi;
        System.out.println("A área do círculo é de: " + areaCirculo);

        
        System.out.println("---------------------------------------");
        float areaTrapezio = ((numA +  numB) *numC) / 2;
        System.out.println("A área do trapezio é de: " + areaTrapezio);

        System.out.println("---------------------------------------");
        float areaQuadrado = numB * numB;
        System.out.println("A área do quadrado é de: " + areaQuadrado);

        System.out.println("---------------------------------------");
        float areaRetangulo = numA * numB;
        System.out.println("A área do retângulo é de: " + areaRetangulo);

        scan.close();
    }

}
