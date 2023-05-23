package unidade5;

public class Uni5Exe21 {

    public static void main(String[] args) {


        double alturaChico = 1.5;
        double alturaZe = 1.1;
        int tempo = 0;

        while(alturaChico > alturaZe) {

            tempo+=1;
            alturaChico+=0.02;
            alturaZe+= 0.03;
        }

        System.out.println("Demorou "+tempo+ " anos para que Zé ultrapassasse a altura de Chico");

    }
}
