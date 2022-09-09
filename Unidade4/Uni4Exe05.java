import java.util.Scanner;

public class Uni4Exe05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("A cor é azul?");
        String variavel = input.nextLine();

        if (variavel.equals("Sim")) {
            System.out.println("Sim");
        } else if (variavel.equals("Nao")) {
            System.out.println("Não");
        }
    }
}
