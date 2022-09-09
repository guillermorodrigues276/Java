import java.util.Scanner;

public class Uni4Exe04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float variavel;

        variavel = input.nextFloat();

        if (variavel != (int) variavel) {
            System.out.println("Tem ponto flutuante");
        } else {
            System.out.println("Nao tem ponto flutuante");
        }
        input.close();
    }
}
