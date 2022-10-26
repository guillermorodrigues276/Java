import java.util.Scanner;

public class Uni5Exe01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero;
        for (int i = 1; i < 21; i++) {
            System.out.println("Digite um numero [" + i + "]:");
            numero = input.nextInt();
            System.out.println();

            if (numero % 2 == 0) {
                System.out.println("Numero é par");
            } else {
                System.out.println("Numero é impar");
            }
        }
        input.close();
    }
}
