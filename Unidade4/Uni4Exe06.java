import java.util.Scanner;

public class Uni4Exe06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String variavel;
        System.out.println("Qual o gênero?");

        variavel = input.nextLine();

        if (variavel.equals("M")) {
            System.out.println("Masculino");
        } else if (variavel.equals("F")) {
            System.out.println("Feminino");
        } else if (variavel.equals("I")) {
            System.out.println("Não Informado");
        } else {
            System.out.println("Entrada Incorreta");
        }
        input.close();
    }
}
