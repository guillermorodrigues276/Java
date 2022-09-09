import java.util.Scanner;

public class Uni4Exe09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int A, B;

        System.out.println("Entre com um valor inteiro maior e logo após um menor");
        A = input.nextInt();
        B = input.nextInt();

        if (A % B == 0) {
            System.out.println("O numero " + A + " É multiplo de " + B);
        } else {
            System.out.println("O numero " + A + " Não é multiplo de " + B);
        }
        input.close();

    }

}
