import java.util.Scanner;

public class Uni4Exe13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int carta1, carta2, carta3, qtCartasBoas;

        System.out.println("Informe as 3 cartas");

        /* Variavel */
        carta1 = input.nextInt();
        carta2 = input.nextInt();
        carta3 = input.nextInt();
        qtCartasBoas = 0;

        if (carta1 == 1 || carta1 == 2 || carta3 == 3) {
            qtCartasBoas += 1;
        }
        if (carta2 == 1 || carta2 == 2 || carta2 == 3) {
            qtCartasBoas = qtCartasBoas + 1;
        }
        if (carta3 == 1 || carta3 == 2 || carta3 == 3) {
            qtCartasBoas++;
        }
        if (qtCartasBoas == 1) {
            System.out.println();
            System.out.println("TRUCO");
        } else if (qtCartasBoas == 2) {
            System.out.println();
            System.err.println("SEIS");
        } else if (qtCartasBoas == 3) {
            System.err.println();
            System.err.println("NOVE");
        }

        input.close();
    }

}
