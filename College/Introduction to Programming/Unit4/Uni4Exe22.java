import java.util.Scanner;

public class Uni4Exe22 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int curso;

        System.out.println("Insira o numero do curso: ");
        System.out.println();
        System.out.println("1 - Ciência da Computação");
        System.out.println();
        System.out.println("2 - Licenciatura da Computação");
        System.out.println();
        System.out.println("3 - Sistemas de Informação");
        System.out.println();
        System.out.println("_____________________________________");
        System.out.println();

        curso = input.nextInt();

        switch (curso) {
            case 1:
                System.out.println();
                System.out.println("Você será Bacharel em Ciência da Computação ");
                break;
            case 2:
                System.out.println();
                System.out.println("Você será Licenciado em Computação ");
                break;
            case 3:
                System.out.println();
                System.out.println("Você será Bachareal em Sistemas de Informação");
        }
        input.close();
    }
}
