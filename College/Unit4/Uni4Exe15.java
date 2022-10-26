import java.util.Scanner;

public class Uni4Exe15 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int meses;

        System.out.println("Qual a quantidade de meses trabalhados?");
        meses = input.nextInt();

        if (meses < 13) {
            System.out.println();
            System.out.println("O valor de reajuste será de 5%");
        } else if (meses > 12 && meses < 49) {
            System.out.println();
            System.out.println("O valor de reajuste será de 7%");
        } else {
            System.out.println();
            System.out.println("Erro no reajuste!");
        }

        input.close();

    }
}
