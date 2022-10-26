import java.util.Scanner;

public class Uni4Exe08 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Escreva uma input");
        String variavel = input.nextLine();

        if (variavel.toLowerCase().equals("a") ||
                variavel.toLowerCase().equals("e") ||
                variavel.toLowerCase().equals("i") ||
                variavel.toLowerCase().equals("o") ||
                variavel.toLowerCase().equals("u")) {
            System.out.println("É vogal.");
        } else {
            System.out.println("Não é vogal.");
        }
        input.close();
    }
}