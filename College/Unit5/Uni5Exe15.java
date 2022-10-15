import java.util.Scanner;

public class Uni5Exe15 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String nome;
        double nota1, nota2, media;

        nome = "";

        while (!nome.toLowerCase().equals("fim")) {
            System.out.println("Qual o nome do aluno?");
            nome = input.next();

            System.out.println("Informe as duas notas: ");
            nota1 = input.nextDouble();
            nota2 = input.nextDouble();

            media = (nota1 + nota2) / 2;

            System.out.println();
            System.out.println("A media do aluno é: " + media);
            System.out.println();

        }

        input.close();
    }
}
