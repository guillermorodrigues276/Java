import java.util.Scanner;

public class Uni3Exe13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float altura, comprimento, m2, precoM2, precoTotal;

        // DIMENSÕES

        System.out.println("Qual a altura?");
        altura = input.nextFloat();

        System.out.println("Qual o comprimento?");
        comprimento = input.nextFloat();

        // PREÇO METRO²

        m2 = altura * comprimento;
        precoM2 = 112.5f;

        // TOTAL

        precoTotal = m2 * precoM2;

        System.out.println("O valor é de: " + precoTotal);

        input.close();

    }
}
