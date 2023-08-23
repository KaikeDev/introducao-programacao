package aula.POO.Lista1.questao1;

public class App {

    public static void main(String[] args) {
        
        Retangulo retangulo = new Retangulo();
        retangulo.altura = 3;
        retangulo.lado = 4;

       System.out.println("Área do retangulo "+ retangulo.calcularArea()); 
        System.out.println("Perimetro do retangulo "+ retangulo.calcularPerimetro());
    }
}
