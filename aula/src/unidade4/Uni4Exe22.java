package unidade4;

import java.util.Scanner;

public class Uni4Exe22 {
    
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        System.out.println("Nós temos 3 cursos disponíveis");
        System.out.println("1 - Ciência da Computação, 2 - Licenciatura da Computação e 3 - Sistemas de Informação");
        System.out.println("Digite o número do curso que você deseja");
        int numCurso = scan.nextInt();

        switch(numCurso) {
            case 1:
            System.out.println("Bacharel em Ciência da Computação");
            break;

            case 2:
            System.out.println("Licenciado em Computação");
            break;

            case 3:
            System.out.println("Bacharel em Sistemas de Informação");

            break;
            default:
            System.out.println("Nenhum curso cadastrado");
        }
        scan.close();
    }
}
