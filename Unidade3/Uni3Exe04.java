import java.util.Scanner;

public class Uni3Exe04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double nota1 = input.nextDouble();
        double nota2 = input.nextDouble();
        double nota3 = input.nextDouble();
        double mediaPonderada;
        int produto1 = 5;
        int produto2 = 3;
        int produto3 = 2;

        int somaProduto = produto1 + produto2 + produto3;

        mediaPonderada = (nota1 * 5 + nota2 * 3 + nota3 * 2) / somaProduto;

        System.out.println("A media ponderada é:" + mediaPonderada);

        input.close();

    }
}
