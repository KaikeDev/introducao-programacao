package aula.POO.Lista1.questao1;

public class Retangulo {

    double lado;
    double altura;

    double calcularArea() {
        return lado * altura;
    }

    double calcularPerimetro() {
        return (lado * 2) + (altura * 2);
    }
}
