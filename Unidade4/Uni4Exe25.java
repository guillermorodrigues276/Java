import java.util.Scanner;

public class Uni4Exe25 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2, num3, num4, num5, num6, num7, num8, opcao;

        System.out.println("Escolha uma opção e logo após insira 2 valores: ");
        System.out.println();
        System.out.println("1 - Soma de dois números.");
        System.out.println();
        System.out.println("2 - Diferença entre dois números");
        System.out.println();
        System.out.println("3 - produto entre dois números");
        System.out.println();
        System.out.println("4 - Divisão entre dois números (o denominador não pode ser zero).");
        System.out.println();

        opcao = input.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Insira o primeiro número.");
                System.out.println();
                num1 = input.nextInt();
                System.out.println();
                System.out.println("Insira o segundo número.");
                System.out.println();
                num2 = input.nextInt();
                System.out.println();
                System.out.println("A soma dos dois números é: " + (num1 + num2));
                break;

            case 2:
                System.out.println("Insira o primeiro número.");
                System.out.println();
                num3 = input.nextInt();
                System.out.println();
                System.out.println("Insira o segundo número.");
                System.out.println();
                num4 = input.nextInt();
                System.out.println();
                System.out.println("A diferença dos dois números é: " + (num3 - num4));
                break;

            case 3:
                System.out.println("Insira o primeiro número.");
                System.out.println();
                num5 = input.nextInt();
                System.out.println();
                System.out.println("Insira o segundo número.");
                System.out.println();
                num6 = input.nextInt();
                System.out.println();
                System.out.println("O produto dos dois números é: " + (num5 * num6));
                break;

            case 4:
                System.out.println("Insira o primeiro número.");
                System.out.println();
                num7 = input.nextInt();
                System.out.println();
                System.out.println("Insira o segundo número.");
                System.out.println();
                num8 = input.nextInt();
                System.out.println();
                System.out.println("A divisão dos dois números é: " + (num7 / num8));
                break;
        }
        input.close();
    }

}