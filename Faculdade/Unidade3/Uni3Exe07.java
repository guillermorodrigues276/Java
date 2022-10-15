import java.util.Scanner;

public class Uni3Exe07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Quantas latas?");
        int lata = input.nextInt();

        System.out.println("Quantas garrafas de 600ml?");
        int garrafa600 = input.nextInt();

        System.out.println("Quantas garrafas 2 Litros?");
        int garrafa2 = input.nextInt();

        double totalLitros = (lata * 0.350 + garrafa600 * 0.600 + garrafa2 * 2);

        System.out.println("TOTAL " + totalLitros + " Litros");

        input.close();

    }
}
