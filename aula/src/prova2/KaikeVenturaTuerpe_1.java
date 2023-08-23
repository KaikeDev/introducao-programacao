package prova2;

import java.util.Scanner;

public class KaikeVenturaTuerpe_1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite qual chapa você quer votar");
        System.out.println("1= voto para a Chapa1");
        System.out.println("2= voto para a Chapa2");
        System.out.println("3= voto nulo");
        System.out.println("0= encerrar votação");

        int voto = scan.nextInt();

        int votosChapa1 = 0;
        int votosChapa2 = 0;
        int votosNulos = 0;
        int totalVotos = 0;
        while (voto != 0) {

            switch (voto) {

                case 0:
                    System.out.println("Votação encerrada");
                    break;

                case 1:
                    votosChapa1++;
                    totalVotos++;
                    break;

                case 2:
                    votosChapa2++;
                    totalVotos++;
                    break;

                case 3:
                    votosNulos++;
                    totalVotos++;
                    break;

                default:
                    System.out.println("Opção incorreta");

            }
            System.out.println("Digite qual chapa você quer votar");
            System.out.println("1= voto para a Chapa1");
            System.out.println("2= voto para a Chapa2");
            System.out.println("3= voto nulo");
            System.out.println("0= encerrar votação");
            voto = scan.nextInt();

        }

        if (totalVotos == 0) {
            System.out.println("Não houveram votos para a chapa2");
        } else {
            System.out.println("Total de votos para a chapa1: " + votosChapa1);
            System.out.println("Percentual de votos para a chapa1: " + (votosChapa1 * 100) / totalVotos);
        }

        if (votosChapa2 == 0) {
            System.out.println("Não houveram votos para a chapa2");
        } else {
            System.out.println("Total de votos para a chapa2: " + votosChapa2);
            System.out.println("Percentual de votos para a chapa2: " + (votosChapa2 * 100) / totalVotos);
        }

        if (votosNulos == 0) {
            System.out.println("Não houveram votos nulos");
        } else {
            System.out.println("Total de votos nulos: " + votosNulos);
            System.out.println("Percentual de votos nulos: " + (votosNulos * 100) / totalVotos);
        }


            if (votosChapa1 > votosChapa2) {
                System.out.println("CHAPA1 VENCEDORA");
            } else if (votosChapa2 > votosChapa1) {
                System.out.println("CHAPA2 VENCEDORA");
            } else {
                System.out.println("EMPATE NA VOTAÇÃO");
            
        }
        
        scan.close();
    }
}