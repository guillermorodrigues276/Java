import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Escreva V ou A ou B");
        String variavel = input.nextLine();

        if (variavel.toLowerCase().equals("v")) {
            System.out.println("Verde");
        } else if (variavel.toLowerCase().equals("a")) {
            System.out.println("Azul");
        } else if (variavel.toLowerCase().equals("b")) {
            System.out.println("Branca");
        } else {
            System.out.println("Tipo Incorreto");
        }
        input.close();
    }

}
