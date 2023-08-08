import java.util.Scanner;

public class U2E03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double raio;

        System.out.println("Informe o valor do raio: ");
        raio = input.nextDouble();

        System.out.println("O valor da area da circunferencia é: " + ((raio * raio) * 3.14159));
    }
}
