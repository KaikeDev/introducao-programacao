package unidade4;

import java.util.Scanner;

public class Uni4Exe10 {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a idade do filho Marquinhos");
        int idadeMarquinhos = scan.nextInt();

        System.out.println("Digite a idade do filho Zezinho");
        int idadeZezinho = scan.nextInt();

        System.out.println("Digite a idade da filha Luluzinha");
        int idadeLuluzinha = scan.nextInt();

        if(idadeMarquinhos > idadeZezinho && idadeLuluzinha > idadeZezinho) {
            System.out.println("O filho caçula é o Zezinho");
        }else if(idadeZezinho > idadeMarquinhos && idadeLuluzinha > idadeMarquinhos){
            System.out.println("O filho caçula é o Marquinhos");
        }else if(idadeZezinho > idadeLuluzinha && idadeMarquinhos > idadeLuluzinha){
            System.out.println("O filho caçula é a Luluzinha");
        }
        scan.close();
    }
}
