import java.util.Scanner;

public class Uni4Exe02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int valor;

        System.out.println("Entre com um valor inteiro maior que 0");

        valor = input.nextInt();

        if (valor % 2 == 0) {
            System.out.println("Numero é par");
        } else {
            System.out.println("Numero é impar");
        }
        input.close();
    }
}
