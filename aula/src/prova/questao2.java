package prova;

import java.text.DecimalFormat;
import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DecimalFormat f_02 = new DecimalFormat("0.00");

        char codigoHotel = scan.nextLine().toUpperCase().charAt(0);
        double precoInicial = scan.nextDouble();

        double desconto = 0;
        double precoFinal = 0;
        switch (codigoHotel) {
            case 'A':
            while ( precoInicial > 1500) {
                precoInicial = scan.nextDouble();
            }
                desconto = precoInicial * 0.05;
                precoFinal = precoInicial - desconto;
                System.out.println("Hotel: Trivago");
                System.out.println("Desconto " + f_02.format(desconto));
                System.out.println("Preço Total " + f_02.format(precoFinal));
                break;

            case 'B':
            while ( precoInicial > 800) {
                precoInicial = scan.nextDouble();
            }
                desconto = precoInicial * 0.10;
                precoFinal = precoInicial - desconto;
                System.out.println("Hotel: Booking");
                System.out.println("Desconto " + f_02.format(desconto));
                System.out.println("Preço Total " + f_02.format(precoFinal));
                break;

            case 'C':

            while ( precoInicial > 2000) {
                precoInicial = scan.nextDouble();
            }
                desconto = precoInicial * 0.10;
                precoFinal = precoInicial - desconto;
                System.out.println("Hotel: Hotel Urbano");
                System.out.println("Desconto " + f_02.format(desconto));
                System.out.println("Preço Total " + f_02.format(precoFinal));
                break;

                case 'D':
                while ( precoInicial < 50 || precoInicial > 800) {
                    precoInicial = scan.nextDouble();
                }
                desconto = precoInicial * 0.15;
                precoFinal = precoInicial - desconto;
                System.out.println("Hotel: Decolar");
                System.out.println("Desconto " + f_02.format(desconto));
                System.out.println("Preço Total " + f_02.format(precoFinal));
                break;

                case 'E':
                while ( precoInicial < 50 || precoInicial > 800) {
                    precoInicial = scan.nextDouble();
                }
        
                desconto = precoInicial * 0.20;
                precoFinal = precoInicial - desconto;
                System.out.println("Hotel: Airbnb");
                System.out.println("Desconto " + f_02.format(desconto));
                System.out.println("Preço Total " + f_02.format(precoFinal));
                break;

                case 'F':
                System.out.println("Hotel: Outros");
                System.out.println("Desconto: Não há desconto");
                break;

                default:
                System.out.println("Código inválido");
        }

        scan.close();
    }
}
