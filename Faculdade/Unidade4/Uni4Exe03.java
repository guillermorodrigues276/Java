import java.util.Scanner;

public class Uni4Exe03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int valor1, valor2;

        valor1 = input.nextInt();
        valor2 = input.nextInt();

        if (valor1 > valor2) {
            System.out.println("O numero " + valor1 + " é maior que o numero " + valor2);
        } else {
            System.out.println("O numero " + valor2 + " é maior que o numero " + valor1);
        }

        input.close();
    }
}
