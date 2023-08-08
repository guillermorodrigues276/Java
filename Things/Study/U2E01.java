import java.util.Scanner;

public class U2E01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b;

        System.out.println("Informe 2 valores em sequência.");
        a = input.nextInt();
        b = input.nextInt();

        System.out.println("A soma deles é: " + (a + b));
        
        input.close();
    }
}