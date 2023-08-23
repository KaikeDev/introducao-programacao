package beecrowd;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni6Uri1174 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DecimalFormat f_02 = new DecimalFormat("0.0");

        double [] A = new double[100] ;
        
        for(int i = 0; i <100; i++){
            A[i] = scan.nextDouble();
           
        }

        for(int i = 0; i <100; i++){
            if(A[i]<=10){
                System.out.println("A["+i+ "] = "+f_02.format(A[i]));
            }
        }
       
        scan.close();

    }
}