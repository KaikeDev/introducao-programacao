package unidade3;

import java.util.Scanner;

public class Uni3Uri1101 {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        int M = scan.nextInt();
        int N = scan.nextInt();
        int soma = 0 ;
        while(M > 0 && N > 0){

            soma = 0;
            if(M >N){
                for(int i = N; i <= M; i++){

                    soma += N;
                    System.out.println(N);
                    N++;
                    
                } 
                System.out.println("Sum="+soma);
              }else {
                for(int i = M; i <= N; i++){

                    soma += M;
                    System.out.println(M);
                    M++;
              
                }
                System.out.println("Sum="+soma);
            }
            M = scan.nextInt();
            N = scan.nextInt();
        }
       
        scan.close();
        
    }
}