package unidade4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni4Exe27 {

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        DecimalFormat f_02 = new DecimalFormat("0.00");

        System.out.println("Escreva a hora de chegada");
        int horaChegada = scan.nextInt();
        while (horaChegada < 0 || horaChegada >= 24) {
            System.out.println("Horário não permitido");
            horaChegada = scan.nextInt();
        }

        System.out.println("Escreva o minuto de chegada");
        int minutoChegada = scan.nextInt();
        while (minutoChegada < 0 || minutoChegada >= 60) {
            System.out.println("Horário não permitido");
            minutoChegada = scan.nextInt();
        }

        System.out.println("Escreva a hora de saida");
        int horaSaida = scan.nextInt();
        while (horaSaida < 0 || horaSaida >= 24) {
            System.out.println("Horário não permitido");
            horaSaida = scan.nextInt();
        }

        System.out.println("Escreva o minuto de saida");
        int minutoSaida = scan.nextInt();
        while (minutoSaida < 0 || minutoSaida >= 60) {
            System.out.println("Horário não permitido");
            minutoSaida = scan.nextInt();
        }

        int horaTotal = 0;
        int minutoTotal = 0;
        double totalPagar = 0;

        if (horaSaida >= horaChegada && minutoChegada > minutoSaida) {

            int horaMinuto = (horaSaida * 60) - (horaChegada * 60);
            horaTotal = horaMinuto / 60;
            minutoTotal = (60 - minutoChegada) + minutoSaida;

        } else if (horaSaida >= horaChegada && minutoChegada < minutoSaida) {

            int horaMinuto = (horaSaida * 60) - (horaChegada * 60);
            horaTotal = horaMinuto / 60;
            minutoTotal = minutoSaida - minutoChegada;

        } else if (horaSaida > horaChegada && minutoChegada == minutoSaida) {
            int horaMinuto = (horaSaida * 60) - (horaChegada * 60);
            horaTotal = horaMinuto / 60;
            minutoTotal = minutoChegada - minutoSaida;

        } else {

            System.out.println("Horário tem que ser no mesmo dia");
        }

        if(horaTotal== 0 && minutoTotal== 0){
            System.out.println("Você ficou " + horaTotal + " horas e " + minutoTotal + " minutos estacionado");
        }else{
            if (horaTotal >= 0 && horaTotal < 1 && minutoTotal <= 29
                || horaTotal >= 0 && horaTotal < 1 && minutoTotal > 29) {
            totalPagar = 1 * 5;
            System.out.println("Você ficou " + horaTotal + " horas e " + minutoTotal + " minutos estacionado");
            System.out.println("O total a pagar é de: " + f_02.format(totalPagar));

        } else if (horaTotal >= 1 && horaTotal <= 1 && minutoTotal <= 29) {
            totalPagar = 1 * 5;
            System.out.println("Você ficou " + horaTotal + " horas e " + minutoTotal + " minutos estacionado");
            System.out.println("O total a pagar é de: " + f_02.format(totalPagar));
        } else if (horaTotal >= 1 && horaTotal <= 1 && minutoTotal > 29) {
            totalPagar = 2 * 5;
            System.out.println("Você ficou " + horaTotal + " horas e " + minutoTotal + " minutos estacionado");
            System.out.println("O total a pagar é de: " + f_02.format(totalPagar));
        } else if (horaTotal >= 2 && horaTotal < 3 && minutoTotal <= 29) {
            totalPagar = 2 * 5;
            System.out.println("Você ficou " + horaTotal + " horas e " + minutoTotal + " minutos estacionado");
            System.out.println("O total a pagar é de: " + f_02.format(totalPagar));
        } else if (horaTotal >= 2 && horaTotal < 3 && minutoTotal > 29) {
            totalPagar = 3 * 7.5;
            System.out.println("Você ficou " + horaTotal + " horas e " + minutoTotal + " minutos estacionado");
            System.out.println("O total a pagar é de: " + f_02.format(totalPagar));

        } else if (horaTotal >= 3 && horaTotal < 4 && minutoTotal <= 29) {
            totalPagar = 3 * 7.5;
            System.out.println("Você ficou " + horaTotal + " horas e " + minutoTotal + " minutos estacionado");
            System.out.println("O total a pagar é de: " + f_02.format(totalPagar));

        } else if (horaTotal >= 3 && horaTotal < 4 && minutoTotal > 29) {
            totalPagar = 4 * 7.5;
            System.out.println("Você ficou " + horaTotal + " horas e " + minutoTotal + " minutos estacionado");
            System.out.println("O total a pagar é de: " + f_02.format(totalPagar));

        } else if (horaTotal >= 4 && horaTotal < 5 && minutoTotal <= 29) {
            totalPagar = 4 * 7.5;
            System.out.println("Você ficou " + horaTotal + " horas e " + minutoTotal + " minutos estacionado");
            System.out.println("O total a pagar é de: " + f_02.format(totalPagar));

        } else if (horaTotal >= 4 && horaTotal < 5 && minutoTotal > 29) {
            totalPagar = 5 * 10;
            System.out.println("Você ficou " + horaTotal + " horas e " + minutoTotal + " minutos estacionado");
            System.out.println("O total a pagar é de: " + f_02.format(totalPagar));
        } else if (horaTotal >= 5) {
            totalPagar = horaTotal * 10;
            System.out.println("Você ficou " + horaTotal + " horas e " + minutoTotal + " minutos estacionado");
            System.out.println("O total a pagar é de: " + f_02.format(totalPagar));

        }

        }
        
        scan.close();
    }

}
