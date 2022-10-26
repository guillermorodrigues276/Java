import java.text.DecimalFormat;

public class Uni5Exe21 {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("##.##");

        double alturaZe, alturaChico, ano;

        alturaZe = 1.10;
        alturaChico = 1.50;
        ano = 0;

        while (alturaZe < alturaChico) {
            alturaZe += 0.03;
            alturaChico += 0.02;
            ano++;
        }

        System.out.println("Altura Chico: " + df.format(alturaChico));
        System.out.println("Altura Zé: " + df.format(alturaZe));
        System.out.println("Serão necessarios " + (df.format(ano)) + " anos");

    }
}