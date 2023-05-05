package unidade5;

import java.util.Scanner;

public class Uni5Exe09 {
    
        public static void main(String[] args) {
    
            Scanner scan = new Scanner(System.in);

            System.out.println("Digite a quatidade de alunos");
            int n = scan.nextInt();

            String nome = " ";
            int idade = 0;

            int qtdAlunos20 = 0;
            for (int i = 1; i <= n; i++) {
                System.out.println("Digite o nome do "+i+ "° aluno");
                nome = scan.next();

                System.out.println("Digite a idade do "+i+ "° aluno");
                idade = scan.nextInt();

                if(idade == 18){
                   System.out.println(nome+ " tem 18 anos");
                }else if(idade > 20){
                    qtdAlunos20++;
                }

            }
            System.out.println("Há "+qtdAlunos20+" alunos com mais de 20 anos na sala");

            scan.close();
        }
        
    }
        

