import java.util.Scanner;

public class Uni3Exe01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int lado = input.nextInt();
        int comprimento = input.nextInt();
        int area;

        area = (lado * comprimento);

        System.out.println("A área é: " + area);

        input.close();

    }
}
