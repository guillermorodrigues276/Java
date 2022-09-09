import java.util.Scanner;

public class Uni4Exe21 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double IMC, massa, altura;

        System.out.println("Qual a massa/Kg?");
        massa = input.nextDouble();
        System.out.println("Qual a altura?");
        altura = input.nextDouble();

        IMC = massa / (altura * altura);

        if (IMC < 18.5) {
            System.out.println();
            System.out.println("Magreza.");
        } else if (IMC > 18.5 && IMC < 24.9) {
            System.out.println();
            System.out.println("Saudável");
        } else if (IMC > 25 && IMC < 29.9) {
            System.out.println();
            System.out.println("Sobrepeso");
        } else if (IMC > 30 && IMC < 34.9) {
            System.out.println();
            System.out.println("Obesidade Grau |");
        } else if (IMC > 35 && IMC < 39.9) {
            System.out.println();
            System.out.println("Obesidade Grau ||");
        } else if (IMC >= 40) {
            System.out.println();
            System.out.println("Obesidade Grau |||");
        } else {
            System.out.println();
            System.out.println("Houve erro de calculo.");
        }
        input.close();
    }
}
