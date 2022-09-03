import java.util.Scanner;

public class Uni4Exe10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int idadeMarquinhos, idadeZezinho, idadeLuluzinha;

        System.out.println("Informe a idade do Marquinhos, Zezinho, Luluzinha");

        idadeMarquinhos = input.nextInt();
        idadeZezinho = input.nextInt();
        idadeLuluzinha = input.nextInt();

        if (idadeMarquinhos < idadeZezinho) {
            if (idadeMarquinhos < idadeLuluzinha) {
                System.out.println("Marquinhos é o caçula");
            }
        }
        if (idadeZezinho < idadeMarquinhos) {
            if (idadeZezinho < idadeLuluzinha) {
                System.out.println("Zezinho é o caçula");
            }
        }
        if (idadeLuluzinha < idadeZezinho) {
            if (idadeLuluzinha < idadeMarquinhos) {
                System.out.println("Luluzinha é a caçula");
            }
        }

        System.out.println();
        System.out.println("Final da execução!");

        input.close();

    }
}