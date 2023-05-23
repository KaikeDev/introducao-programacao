package unidade5;
import java.util.Scanner;

public class Uni5Exe25 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int D = 0;
        int E = 0;

        while(true){
            System.out.println("Quem fez o ponto nessa jogada? Digite 'd' para o jogador da Direita e 'e' para jogador da Esquerda");

           
            char ponto = scan.next().charAt(0);

            if(ponto == 'd'){
                D++;
            }else if(ponto == 'e'){
                E++;
            }else{
                System.out.println("Nenhum jogador fez ponto");
            }
        
            if((E >=21 || D >=21) && Math.abs(D - E) >= 2){
                break;
            }

            System.out.println("O jogador da direita tem "+ D+ " ponto");
            System.out.println("O jogador da esquerda tem "+ E+ " pontos");

        }


        if (D >E ) {
            System.out.println("Jogador do lado direito venceu!");
        } else {
            System.out.println("Jogador do lado esquerdo venceu!");
        }


        scan.close();
        
    }
}