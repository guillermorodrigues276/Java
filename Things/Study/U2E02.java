import java.util.Scanner;

public class U2E02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b;

        System.out.println("Informe 2 valores inteiros em sequencia.");
        a = input.nextInt();
        b = input.nextInt();

        System.out.println("O valor da multiplicação é de: " + (a * b));
    }
}
