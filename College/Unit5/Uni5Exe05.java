import java.util.Scanner;

public class Uni5Exe05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int quantidade, n1, n2;

        n1 = 4;
        n2 = 0;

        System.out.println("Escreva a quantidade de vezes.");
        quantidade = input.nextInt();
        System.out.println();

        for (int i = 0; i < (quantidade); i++) {
            n1 = n1 * 2;
            n2 = n1 + 2;
            System.out.println(n1 + "," + n2);
        }
        input.close();
    }
}
