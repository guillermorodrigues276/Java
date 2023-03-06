import java.util.Scanner;

public class Uni4Exe24 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2, num3, opcao;

        System.out.println("Entre com 3 valores em sequência.");
        System.out.println();

        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();

        System.out.println();
        System.out.println("O primeiro valor é: " + num1);
        System.out.println();
        System.out.println("O segundo valor é: " + num2);
        System.out.println();
        System.out.println("O terceiro valor é " + num3);
        System.out.println();

        System.out.println("Escolha uma opção: ");
        System.out.println();
        System.out.println("1 - os 3 valores em ordem crescente");
        System.out.println();
        System.out.println("2 - os 3 valores em ordem decrescente");
        System.out.println();
        System.out.println("3 - os 3 valores de forma que o maior valor fique no meio");
        System.out.println();

        opcao = input.nextInt();

        switch (opcao) {
            case 1:
                if (num1 < num2 && num2 < num3) {
                    System.out.println(num1 + " " + num2 + " " + num3);
                } else if (num1 < num3 && num3 < num2) {
                    System.out.println(num1 + " " + num3 + " " + num2);
                } else if (num2 < num1 && num1 < num3) {
                    System.out.println(num2 + " " + num1 + " " + num3);
                } else if (num2 < num3 && num3 < num1) {
                    System.out.println(num2 + " " + num3 + " " + num1);
                } else if (num3 < num1 && num1 < num2) {
                    System.out.println(num3 + " " + num1 + " " + num2);
                } else if (num3 < num2 && num2 < num1) {
                    System.out.println(num3 + " " + num2 + " " + num1);
                }
                break;
            case 2:
                if (num1 > num2 && num2 > num3) {
                    System.out.println(num1 + " " + num2 + " " + num3);
                } else if (num1 > num3 && num3 > num2) {
                    System.out.println(num1 + " " + num3 + " " + num2);
                } else if (num2 > num1 && num1 > num3) {
                    System.out.println(num2 + " " + num1 + " " + num3);
                } else if (num2 > num3 && num3 > num1) {
                    System.out.println(num2 + " " + num3 + " " + num1);
                } else if (num3 > num1 && num1 > num2) {
                    System.out.println(num3 + " " + num1 + " " + num2);
                } else if (num3 > num2 && num2 > num1) {
                    System.out.println(num3 + " " + num2 + " " + num1);
                }
                break;
            case 3:
                if (num1 > num2 && num1 > num3) {
                    System.out.println(num2 + " " + num1 + " " + num3);
                } else if (num2 > num1 && num2 > num3) {
                    System.out.println(num1 + " " + num2 + " " + num3);
                } else if (num3 > num1 && num3 > num2) {
                    System.out.println(num1 + " " + num3 + " " + num2);
                }
                break;
            default:
                System.out.println("Opção inválida!");
        }
        input.close();
    }
}
