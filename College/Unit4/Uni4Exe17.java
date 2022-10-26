import java.util.Scanner;

public class Uni4Exe17 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double rendaAnual, rendaLiquida;
        int numeroDependentes;

        System.out.println("Introduza sua renda anual:");
        rendaAnual = input.nextDouble();

        System.out.println("Introduza o numero de dependentes:");
        numeroDependentes = input.nextInt();

        rendaLiquida = rendaAnual * (0.02 * numeroDependentes);

        // VALORES INSERIOS:
        // RENDA ANUAL DE:
        // 48000
        // 51000
        // 150000
        // 200000
        // 300000
        // DEPENDENTES: 2

        if (rendaLiquida < 2000) {
            System.out.println();
            System.out.println("Não paga imposto");
        } else if (rendaLiquida >= 2000 && rendaLiquida < 5000) {
            System.out.println();
            System.out.println("O imposto de renda será de 5%");
        } else if (rendaLiquida > 5000 && rendaLiquida < 10000) {
            System.out.println();
            System.out.println("O imposto de renda será de 10%");
        } else if (rendaLiquida > 10000) {
            System.out.println();
            System.out.println("O imposto de renda será de 15%");
        } else {
            System.out.println();
            System.out.println("Ocorreu algum erro.");
        }

        input.close();

    }
}
