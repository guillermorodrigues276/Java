import java.util.Scanner;

public class Uni5Exe06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double altura, mediaAltura;
        altura = 0;
        mediaAltura = 0;
        for (int i = 1; i < 21; i++) {
            System.out.println("Digite a altura [" + i + "]:");
            altura += input.nextDouble();
            System.out.println();
            mediaAltura = altura / 20;
        }
        System.out.println(mediaAltura);

        input.close();
    }
}
