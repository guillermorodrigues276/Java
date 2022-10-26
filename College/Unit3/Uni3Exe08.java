import java.util.Scanner;

public class Uni3Exe08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Qual o valor que deseja trocar?");
        double valorDolar = input.nextDouble();

        float cotacaoDolar = 5.17f;
        double valorReal;

        valorReal = (valorDolar / cotacaoDolar);

        System.out.printf("TOTAL - R$ %.2f%n", valorReal);

        input.close();

    }
}