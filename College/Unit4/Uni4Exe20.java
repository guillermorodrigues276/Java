import java.util.Scanner;

public class Uni4Exe20 {
    public static void main(String[] args) {
        // TODO media = (notaProva1+notaProva2*2+notaProva3*3+notaExercicios)/7

        Scanner input = new Scanner(System.in);

        double notaProva1, notaProva2, notaProva3, notaExercicios, media;

        System.out.println("Qual a nota da prova 1? ");
        notaProva1 = input.nextDouble();

        System.out.println("Qual a nota da prova 2? ");
        notaProva2 = input.nextDouble();

        System.out.println("Qual a nota da prova 3? ");
        notaProva3 = input.nextDouble();

        System.out.println("Qual a nota exercicios? ");
        notaExercicios = input.nextDouble();

        media = (notaProva1 + notaProva2 * 2 + notaProva3 * 3 + notaExercicios) / 7;

        if (media >= 9.0) {
            System.out.println();
            System.out.println("A");
            System.out.println("APROVADO");
        } else if (media >= 7.5 && media < 9.0) {
            System.out.println();
            System.out.println("B");
            System.out.println("APROVADO");
        } else if (media >= 6.0 && media < 7.5) {
            System.out.println();
            System.out.println("C");
            System.out.println("APROVADO");
        } else if (media >= 4.0 && media < 6.0) {
            System.out.println();
            System.out.println("D");
            System.out.println("REPROVADO");
        } else if (media < 4.0) {
            System.out.println();
            System.out.println("E");
            System.out.println("REPROVADO");
        } else {
            System.err.println();
            System.err.println("Houve algum erro de formatação.");
        }
        input.close();
    }
}
